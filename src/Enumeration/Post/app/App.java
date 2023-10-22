package Enumeration.Post.app;

import Enumeration.Post.entities.Comments;
import Enumeration.Post.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");

        Comments c1 = new Comments("Have a nice trip");
        Comments c2 = new Comments("All I wanted was to go with u ^_^");
        Post post1 = new Post(
                sdf.parse("21/06/2023 13:20:30"),
                "Traveling to New York!",
                "It's gonna be so wonderful",
                12);
        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);

    }
}
