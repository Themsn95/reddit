package org.example;

import java.util.ArrayList;
import java.util.List;

public class subreddit {
    String title;
    int membersNumber;
    List<subreddit> members = new ArrayList<>();

    public subreddit(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
