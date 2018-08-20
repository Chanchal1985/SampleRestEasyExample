package com.resteasy.pojo;

/**
 *
 */
public class Book {

    private String name = null;
    private int isbn = 0;


    public Book(String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
