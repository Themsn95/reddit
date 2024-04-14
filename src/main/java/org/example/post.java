package org.example;

import java.util.ArrayList;
import java.util.List;

public class post {
    String title;
    String body;
    String comments;
    String subreddit;
    account author;
    int karma;
    List<post> posts = new ArrayList<>();
    public post(String title, String body, String comments, String subreddit){
        this.title = title;
        this.body = body;
        this.comments = comments;
        this.karma = karma;
        this.subreddit = subreddit;

    }
    public String getAuthor(){
        return author.getUsername();
    }
    public String getTitle(){
        return title;
    }
    public String getBody(){
        return body;
    }
    public String getComments(){
        return comments;
    }
    public int getKarma(){
        return karma;
    }
    public String getSubreddit() {
        return subreddit;
    }

}
