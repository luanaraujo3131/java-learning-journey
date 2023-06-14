package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.Arrays;

public class ImprimindoArray4 {
    //Não podemos usar o arrays.toString para imprimir arrays multidimensionais,
    //Para isso, podemos usar o Arrays.deepToString()
    public static void main(String[] args) {
        //Array multidimensional tipo primitivo:
        int[][] multDimenArr = {{2, 3}, {4, 6}};
        System.out.println(Arrays.deepToString(multDimenArr));

        Teach[][] teach = {{ new Teach("John"), new Teach("David") }, {new Teach("Mary")} };
        System.out.println(Arrays.deepToString(teach));
    }
}

class Teach{
    private String name;

    public Teach(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Teachs{ " + "Name = " +name+ "}";
    }
}

