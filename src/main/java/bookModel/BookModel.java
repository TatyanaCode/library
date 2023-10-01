package bookModel;

import java.util.Date;

public class BookModel {
    private long id;
    private String title;
    private String author;
    private Date publicationData;
    private double price;
    private String genre;

    public BookModel(long id, String title, String author, Date publicationData, double price, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationData = publicationData;
        this.price = price;
        this.genre = genre;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationData() {
        return publicationData;
    }

    public void setPublicationData(Date publicationData) {
        this.publicationData = publicationData;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
