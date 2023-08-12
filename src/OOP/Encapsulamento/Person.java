package OOP.Encapsulamento;

class Information{
    private String name;
    private String email;
    private byte age;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public byte getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = (byte) age; //se tratando de byte, essa código de primeiro pegar em int e depois passar pra byte é necessario.
    }
}
public class Person {
    public static void main(String[] args) {
        Information p1 = new Information();
        Information p2 = new Information();
        p1.setName("Yasmin");
        p1.setEmail("yasmin2932@gmail.com");
        p1.setAge(18);
        p2.setName("Luan");
        p2.setEmail("luanaraujo3131@icloud.com");
        p2.setAge(19);
        System.out.println("Name: " + p1.getName()+
                           "\nAge: " +p1.getAge()+
                           "\nEmail: " +p1.getEmail());
        System.out.println("------------------------------------");
        System.out.println("Name: " + p2.getName()+
                           "\nAge: " +p2.getAge()+
                           "\nEmail: " +p2.getEmail());
    }
}
