package Enumeration;

public class Ex2 {
    public static void main(String[] args) {
        for (Colors colors : Colors.values()){
            System.out.println(colors);
        }
    }
}
enum Colors{
    BLUE,
    BLACK,
    YELLOW,
    PINK,
    GREEN,
    RED,
    ORANGE,
    BROWN,
    WHITE
}