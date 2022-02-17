package com.example.firebasetemplate.model;

import java.util.HashMap;

public class Post {
    public String postid;
    public String content;
    public String authorName;
    public String date;
    public String imageUrl;

    public HashMap<String, Boolean> likes = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (postid != null ? !postid.equals(post.postid) : post.postid != null) return false;
        if (content != null ? !content.equals(post.content) : post.content != null) return false;
        if (authorName != null ? !authorName.equals(post.authorName) : post.authorName != null)
            return false;
        if (date != null ? !date.equals(post.date) : post.date != null) return false;
        if (imageUrl != null ? !imageUrl.equals(post.imageUrl) : post.imageUrl != null)
            return false;
        return likes != null ? likes.equals(post.likes) : post.likes == null;
    }

    @Override
    public int hashCode() {
        int result = postid != null ? postid.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (likes != null ? likes.hashCode() : 0);
        return result;
    }
}
