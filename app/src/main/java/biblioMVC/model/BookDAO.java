package biblioMVC.model;

import biblioMVC.model.database.*;

import java.util.List;

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
                UPDATE books SET author = ?, releaseDate = ? WHERE id = ?;
                """,
                book.getAuthor(),
                book.getReleaseDate(),
                book.getId()
        );
        
        return databaseOperation.getError();
    }
    
    public String query(Book book)
    {
        if (!this.db.isInitialized()) return "ERR:BookDAO::query(book: " + book + "): Database is not initialized.";
        if (book.getId() != -1) return "ERR:BookDAO::query(book: " + book + "): Book instance is already initialized.";
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

public String list(List<Book> buffer) {
    if (!this.db.isInitialized()) return "ERR:BookDAO::list(buffer: " + buffer + "): Database is not initialized.";
    if (buffer == null) return "ERR:BookDAO::list(buffer: " + buffer + "): Provided buffer is null.";

    final var databaseOperation = this.db.execute(
            """
            SELECT id, title, author, releaseDate FROM books;
            """
    );

    if (databaseOperation.getError() != null) {
        return databaseOperation.getError();
    }

    try {
        while (databaseOperation.nextResult()) {
            final var book = new Book(databaseOperation.getString("title"), databaseOperation.getString("author"), databaseOperation.getDate("releaseDate"));
            book.setId(databaseOperation.getInt("id"));
            buffer.add(book);
        }
    } catch (Exception e) {
        return "Não foi possível processar o banco de dados: " + e.getMessage();
    }

    return null;
}
};  