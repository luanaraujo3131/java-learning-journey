package Enumeration.Post.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comments> comments = new ArrayList<>();

    public Post(){}

    public Post(Date moment, String title,String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void addComment(Comments comment){
        comments.add(comment);
    }

    public void removeComment(Comments comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(title+ "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(sdf.format(moment) + "\n");
        stringBuilder.append(content + "\n");
        stringBuilder.append("Comments:\n");
        for (Comments comment: comments){ //comments is my list
            stringBuilder.append(comment.getText() + "\n");
        }
        return stringBuilder.toString();
    }
}
