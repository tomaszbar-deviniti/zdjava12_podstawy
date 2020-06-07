package rozwiazaniazadan.libraryapp;

import rozwiazaniazadan.StringsContainer;

public class Book {
    private String title;
    private String author;
    private int bookId;
    private static int IdCounter = 0;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.bookId = IdCounter++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public String toString(){
        return "{Title: "+this.title+", Author: "+this.author+", BookID: "+this.bookId+"}";
    }
}
