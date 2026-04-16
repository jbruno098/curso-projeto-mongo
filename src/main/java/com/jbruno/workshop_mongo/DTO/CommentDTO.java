package com.jbruno.workshop_mongo.DTO;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {}

    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public CommentDTO setText(String text) {
        this.text = text;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public CommentDTO setDate(Date date) {
        this.date = date;
        return this;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public CommentDTO setAuthor(AuthorDTO author) {
        this.author = author;
        return this;
    }
}
