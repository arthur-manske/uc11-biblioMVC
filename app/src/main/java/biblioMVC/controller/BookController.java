package biblioMVC.controller;

import biblioMVC.model.Book;
import biblioMVC.model.BookDAO;
import biblioMVC.model.database.DatabaseContainer;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controlador MVP (Model, View, Controller) que há de realizar a conexação entre
 * O que há em view e o que há em Model, abstraindo recursos.
 * @author Arthur de Souza Manske
 */
public class BookController {
    private final DatabaseContainer db; 
    private final BookDAO           bookDAO;
    
    public BookController()
    {
        this.db      = new DatabaseContainer("DB_PATH");
        this.bookDAO = new BookDAO(db);
        
        db.initialize();
    }
    
    public String addBook(String title, String author, String releaseDate)
    {
        try {
            final var date = new SimpleDateFormat("yyyy-MM-dd").parse(releaseDate);
            final var book  = new Book(title, author, date);
            final var error = bookDAO.insert(book);
            
            return error;
        } catch (ParseException e) {
            return String.format("ERR:BookController:addBook(title: %s, author: %s, releaseDate: %s): %s", title, author, releaseDate, e.getMessage());
        }
    }
    
    public String updateBook(String title, String newTitle, String newAuthor, String newReleaseDate)
    {
        final var book  = new Book(title, null, null);
        final var error = this.bookDAO.query(book);
                
        if (error != null) return error;
        
        if (newTitle != null) book.setTitle(newTitle);
        if (newAuthor != null) book.setAuthor(newAuthor);
        
        if (newReleaseDate != null) {
            try {
                final var date = new SimpleDateFormat("yyyy-MM-dd").parse(newReleaseDate);           
                book.setReleaseDate(date);
            } catch (ParseException e) {
                return String.format("ERR:BookController:updateBook(title: %s, newTitle: %s, newAuthor: %s, newReleaseDate: %s): %s", title, newTitle, newAuthor, newReleaseDate, e.getMessage());
            }
        }
                
        return this.bookDAO.update(book);
    }
    
    public String delBook(String title)
    {
        final var book  = new Book(title, null, null);
        final var error = bookDAO.query(book);
        
        if (error != null) return error;
        return bookDAO.delete(book);
    }
}
