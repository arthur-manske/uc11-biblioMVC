package biblioMVC.model;

import java.util.Date;

public class Book {
    private Date   releaseDate;
    private String title, author;
    private int    id;
    
    public Book(String title, String author, Date releaseDate)
    {
        this.title  = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.id = -1;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public Date getReleaseDate()
    {
        return this.releaseDate;
    }
}