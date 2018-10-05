package com.pizhanska.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("id")
    private long bookId;
    private String bookName;
    private String bookAuthor;


    public Book(long bookId, String bookName, String bookAuthor){
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public Book(){}

    public Book(long bookId){
        this.bookId = bookId;
    }
}
