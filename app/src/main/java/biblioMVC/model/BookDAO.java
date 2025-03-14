package biblioMVC.model;

import biblioMVC.model.database.*;

/**
 * Book Data Access Object (DAO) for Database interactions.
 * Handles CRUD operations for Book objects.
 * 
 * @author Arthur de Souza Manske
 */
public class BookDAO {
    private final DatabaseContainer db;
    
    public BookDAO(DatabaseContainer db)
    {
        this.db = db;
    }
    
    public String insert(Book book)
    {
        if (!this.db.isInitialized()) return "ERR:BookDAO::insert(book: " + book + "): Database is not initialized.";
        if (book.getId() != -1) return "ERR:BookDAO::insert(book: " + book + "): Book instance is already initialized.";
        if (book.getTitle() == null || book.getAuthor() == null || book.getReleaseDate() == null)
            return "ERR:BookDAO::insert(book: " + book + "): Book instance has a null member.";
        
        final var databaseOperation = this.db.execute(
                """
                INSERT INTO books (title, author, releaseDate) VALUES (?, ?, ?);
                """,
                book.getTitle(),
                book.getAuthor(),
                book.getReleaseDate()
        );
        
        return databaseOperation.getError();
    }
    
    public String delete(Book book)
    {
        if (!this.db.isInitialized()) return "ERR:BookDAO::delete(book: " + book + "): Database is not initialized.";
        if (book.getId() == -1) return "ERR:BookDAO::delete(book: " + book + "): Book instance is not initialized.";
        
        final var databaseOperation = this.db.execute(
                """
                DELETE FROM books WHERE id = ?;
                """,
                book.getId()
        );
        
        return databaseOperation.getError();
    }
    
    public String update(Book book)
    {
        if (!this.db.isInitialized()) return "ERR:BookDAO::update(book: " + book + "): Database is not initialized.";
        if (book.getId() == -1) return "ERR:BookDAO::update(book: " + book + "): Book instance is not initialized.";
        if (book.getTitle() == null || book.getAuthor() == null || book.getReleaseDate() == null)
            return "ERR:BookDAO:update(book: " + book + "): Book instance has a null member.";
        
        final var databaseOperation = this.db.execute(
                """
                UPDATE books SET title = ?, author = ?, releaseDate = ? WHERE id = ?;
                """,
                book.getTitle(),
                book.getAuthor(),
                book.getReleaseDate(),
                book.getId()
        );
        
        return databaseOperation.getError();
    }

    public String query(Book book)
    {
        if (!this.db.isInitialized()) return "ERR:BookDAO::query(book: " + book + "): Database is not initialized.";
        if (book.getId() == -1) return "ERR:BookDAO::query(book: " + book + "): Book instance is already initialized.";
        if (book.getTitle() == null) return "ERR:BookDAO::query(book: " + book + "): Book instance has a null title.";
        
        final var databaseOperation = this.db.execute(
                """
                SELECT id, author, releaseDate FROM books WHERE title = ?;
                """,
                book.getTitle()
        );
        
        if (databaseOperation.getError() != null) return databaseOperation.getError();
        
        book.setId(databaseOperation.getInt("id"));
        book.setAuthor(databaseOperation.getString("author"));
        book.setReleaseDate(databaseOperation.getDate("releaseDate"));
        
        return databaseOperation.getError();
    }
};  