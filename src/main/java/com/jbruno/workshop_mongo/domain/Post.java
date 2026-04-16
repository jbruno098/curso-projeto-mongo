package com.jbruno.workshop_mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Post implements Serializable {
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;

    private User author;

    public Post() {}

    public Post(String id, Date date, String title, String body, User author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public Post setId(String id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Post setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Post setBody(String body) {
        this.body = body;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Post setAuthor(User author) {
        this.author = author;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;
        return id.equals(post.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
