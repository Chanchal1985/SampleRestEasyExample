package com.resteasy.controller;

import com.resteasy.pojo.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.Arrays;
import java.util.List;

/**
 * @author chanchal
 */
@Path("/library")
public class LibraryController {

    public static List<Book> BOOKS = Arrays.asList(new Book("History", 1234), new Book("Maths", 3456));


    @Path("/books")
    @GET
    public String getBooks() {
        return "Lots of Books";
    }

    @Path("/books/{isbn}")
    @GET
    public String getBook(@PathParam("isbn") String isbn) {

        return "Book with Id : " + isbn;
        //  return BOOKS.stream().filter(book -> isbn.equals(book.getIsbn())).limit(1).collect(Collectors.toList()).get(0);

    }

    @Path("/books/{isbn}")
    @GET
    public String getBook(@PathParam("isbn") String isbn, @QueryParam("name") String name) {
        return "Book with Id : " + isbn + " name : " + name;
    }


}
