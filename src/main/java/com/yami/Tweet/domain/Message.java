package com.yami.Tweet.domain;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String text;
    private String hashTag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user.id")
    private User author;



    public Message() {
    }

    public Message(String text, String hashTag, User user) {
        this.text = text;
        this.hashTag = hashTag;
        this.author = user;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<anon>";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}