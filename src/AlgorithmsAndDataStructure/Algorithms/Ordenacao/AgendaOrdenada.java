package AlgorithmsAndDataStructure.Algorithms.Ordenacao;

public class AgendaOrdenada {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[10];
        agenda[0] = new Contato("Luan", "0000-0000", "Brasil");
        agenda[1] = new Contato("Yasmin", "1111-1111", "Portugal");
        agenda[2] = new Contato("Jasmin", "2222-2222", "Suiça");
        agenda[3] = new Contato("Jhon", "3333-3333", "Alemanha");
        agenda[4] = new Contato("Lilian", "4444-4444", "França");
        agenda[5] = new Contato("Karen", "5555-5555", "USA");
        agenda[6] = new Contato("Bruce", "6666-6666", "Canadá");
        agenda[7] = new Contato("Jude", "7777-7777", "Inglaterra");
        agenda[8] = new Contato("Senku", "8888-8888", "Japão");
        agenda[9] = new Contato("Beth", "9999-9999", "Grécia");
        quickSort(agenda, 0, agenda.length);
        //É possivel ordenar com quakquer um desses algoritmos, só tinhamos que trocar numero pelo "name"
        // e o método "COMPARE TO()" que serve para comparar strings
        //bubbleSort(agenda);
        //selectionSort(agenda);
        //insertSort(agenda);
        //mergeSort(agenda, 0, agenda.length);

        for (int i = 0; i < agenda.length; i++) {
            System.out.println(agenda[i]);
        }
    }
    public static void quickSort(Contato[] array, int inicio, int fim) {
        if(fim-inicio <= 1) {
            return;
        }
        int pivot = particionamento(array, inicio, fim);
        quickSort(array, inicio, pivot);
        quickSort(array, pivot+1, fim);
    }

    public static int particionamento(Contato[] array, int inicio, int fim) {
        int pivot = inicio+1;
        for(int i = pivot; i < fim; i++) {
            if(array[i].name.compareTo(array[inicio].name) < 0) {
                Contato swap = array[i];
                array[i] = array[pivot];
                array[pivot] = swap;
                pivot++;
            }
        }
        pivot--;
        Contato swap = array[inicio];
        array[inicio] = array[pivot];
        array[pivot] = swap;
        return pivot;
    }
}
class Contato{
    String name;
    String number;
    String address;

    public Contato(String n, String num, String ad){
        name = n;
        number = num;
        address = ad;
    }
    public String toString(){
        return "Name: " +name+ "\nPhone number: " +number+ "\nAddress: " +address;
    }

}
