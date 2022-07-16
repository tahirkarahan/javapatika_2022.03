package com.patika.java102.encapsulation;

public class Book {
    private String bookName;
    private String author;
    private  int pageNumber;

    public Book(String bookName, String author, int pageNumber){
        this.bookName=bookName;
        this.author=author;
        if (pageNumber <0){
            pageNumber=0;
        }
            this.pageNumber =pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber <0){
            pageNumber=0;
        }
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return  "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber ;
    }
}
