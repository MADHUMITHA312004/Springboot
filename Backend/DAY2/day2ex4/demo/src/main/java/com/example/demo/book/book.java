package com.example.demo.book;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class book {
    private String book;
    private String author;
    @JsonFormat (pattern="yyyy-MM-dd")
    private Date edate;
    public book(String book,String author,Date edate)
    {
        this.book=book;
        this.author=author;
        this.edate=edate;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getEdate() {
        return edate;
    }
    public void setEdate(Date edate) {
        this.edate = edate;
    }
}
