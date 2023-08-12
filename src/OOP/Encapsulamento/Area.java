package OOP.Encapsulamento;

class Area {
    private int length;
    private int breadth;
    //Constructor to initialize values:
    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //Método para calcular a área:
    public void getArea(){
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}
class Main{
    public static void main(String[] args) {
        Area rectangle = new Area(6, 10);
        rectangle.getArea();
    }
}
