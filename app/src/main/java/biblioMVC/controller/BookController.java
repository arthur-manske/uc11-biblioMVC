package biblioMVC.controller;

import biblioMVC.model.Book;
import biblioMVC.model.BookDAO;
import biblioMVC.model.database.DatabaseContainer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Controlador MVP (Model, View, Controller) que há de realizar a conexação entre
 * O que há em view e o que há em Model, abstraindo recursos.
 * @author Arthur de Souza Manske
 */
public class BookController {
    private final DatabaseContainer db; 
    private final BookDAO           bookDAO;
    
    public BookController(String path)
    {
        this.db      = new DatabaseContainer("jdbc:sqlite:" + path);
        this.bookDAO = new BookDAO(db);
             
        db.initialize();
    }
    
    public String addBook(String title, String author, String releaseDate)
    {
        if (title == null || "".equals(title)) return "Não foi fornecido um título!";
        if (author == null || "".equals(author)) return "Não foi fornecido um autor!";
        if (releaseDate == null || "".equals(releaseDate)) return "Não foi fornecida uma data!";
        
        try {
            final var date = new SimpleDateFormat("yyyy-MM-dd").parse(releaseDate);
            final var book  = new Book(title, author, date);
            final var error = bookDAO.insert(book);
            
            return error;
        } catch (ParseException e) {
            return String.format("Formato de data inválido (esperado yyyy-MM-dd): %s", releaseDate);
        }
    }
    
    public String updateBook(String title, String newAuthor, String newReleaseDate)
    {
        final var book  = new Book(title, null, null);
        final var error = this.bookDAO.query(book);
                
        if (error != null) return error;
        if (newAuthor != null && !"".equals(newAuthor)) book.setAuthor(newAuthor);
        
        if (newReleaseDate != null && !"".equals(newReleaseDate)) {
            try {
                final var date = new SimpleDateFormat("yyyy-MM-dd").parse(newReleaseDate);           
                book.setReleaseDate(date);
            } catch (ParseException e) {
                return String.format("Formato de data inválida (yyyy-MM-dd): %s", newReleaseDate);
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
    
    public String listBooks(ArrayList<String> buffer)
    {
        final var books = new ArrayList<Book>();
        final var error = bookDAO.list(books);
        final var dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        
        if (error != null) return error;
                
        for (final var book : books) {
            buffer.add(book.getTitle());
            buffer.add(book.getAuthor());
            buffer.add(dateFormatter.format(book.getReleaseDate()));
        }
        
        return null;
    }
}