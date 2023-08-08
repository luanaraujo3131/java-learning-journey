package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos produtos deseja armazenar?");
        int n = sc.nextInt();
        Produto[] arr = new Produto[n];
        for (int i = 0; i < arr.length; i++){
            sc.nextLine(); //Se não colocar esse nextLine() dá erro(TENTEE SEM!!!!)
            System.out.println("Nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Preço do produto:");
            double preco = sc.nextDouble();
            arr[i] = new Produto(nome, preco);
        }
        double soma = 0.0;
        for (int i = 0; i < arr.length; i++){
            soma += arr[i].getPreco();
        }
        double media = soma / n;
        System.out.printf("Média de preço de todos os produtos: %.2f%n", media);
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].toString());
        }

    }
}
class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: nome: '" + nome + "', preco: " + preco;
    }
}