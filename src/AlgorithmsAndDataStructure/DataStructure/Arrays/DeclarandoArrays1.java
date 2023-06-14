package AlgorithmsAndDataStructure.DataStructure.Arrays;

public class DeclarandoArrays1 {
    //podemos declarar arrays de duas maneiras:
    //int arrayDeInteiros[];
    //int[] arrayDeInteiros;
    public static void main(String[] args) {
        int[] arraysDeInteiros = new int[10];//[quantidade de arrays]
        arraysDeInteiros[7] = 10;
        arraysDeInteiros[5] = 32;
        arraysDeInteiros[3] = 20;
        System.out.println(arraysDeInteiros[7]);
        System.out.println(arraysDeInteiros);

        //Não é possivel imprimir um array com um simples System..
        //podemos imprimir de uma posição especifica, como na linha 12
        //Algumas maneiras de podermos imprimir arrays:
        //Laços: laço for e laço for-each
        //Método Arrays.toString()
        //Método Arrays.deepToString()
        //Método Arrays.asList()
        //Interface Iterator do Java
        //Stream API do Javaic class declarandoArray {
    }
}
