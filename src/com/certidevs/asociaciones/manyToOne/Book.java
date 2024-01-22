package com.certidevs.asociaciones.manyToOne;

public class Book extends BaseEntity {

    private String title;
    private double price;
    private int numPages;
    private Author author;
    private Editorial editorial;

    public Book(long id, String title, double price, int numPages, Author author, Editorial editorial) {
        super(id);
        this.title = title;
        this.price = price;
        this.numPages = numPages;
        this.author = author;
        this.editorial = editorial;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
