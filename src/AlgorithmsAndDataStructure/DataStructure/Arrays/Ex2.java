/*
* Faça um programa para ler o nome, a idade e altura de N pessoas. Depois mostre a altura média dessas
* pessoas, mostre a porcentagem de pessoas com menos de 16 anos, bem como o nome dessas pessoas, se houver.
* */

package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas desejar armazenar?");
        byte n = sc.nextByte();
        sc.nextLine();

        Pessoa[] pessoaArr = new Pessoa[n];

        for (int i = 0; i < pessoaArr.length; i++) {
            System.out.println("Pessoa " +(i+1));
            System.out.println("---------------");
            System.out.println("Digite o nome:");
            String nome = sc.next();
            byte idade = 0;
            boolean idadeValida = false; //como não temos valor nenhum, inicia com false
            do {
                System.out.println("Idade: ");
                try {
                    idade = sc.nextByte();
                    idadeValida = true; //dentro do try, acontecerá a verificação, se tudo der certo, muda pra true
                } catch (InputMismatchException e) {//se ocorrer um erro o catch é chamado
                    System.out.println("A idade deve ser um número inteiro");
                    sc.nextLine(); // Limpa o buffer de entrada após a leitura incorreta
                }
            } while (!idadeValida);//enquanto a idadeValida = false, repete o loop, quando for true, sai!!

            sc.nextLine(); // Limpa o buffer de entrada após a leitura do byte

            float altura = 0;
            boolean alturaValida = false;
            do {
                System.out.println("Altura:");
                try {
                    altura = sc.nextFloat();
                    alturaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Digite a altura usando ',', não '.'");
                }
                sc.nextLine();
            } while (!alturaValida);

            pessoaArr[i] = new Pessoa(nome, idade, altura);
        }
        float soma = 0.0f; //para calcular a média!!!!
        for (int i = 0; i < pessoaArr.length; i++){
            soma += pessoaArr[i].getAltura();
        }
        float media = soma / n;
        System.out.printf("Altura média dessas pessoas: %.2f%n", media);

        //mostre a porcentagem de pessoas com menos de 16 anos, bem como o nome dessas pessoas, se houver
        int cont = 0;
        for(int i = 0; i < n; i++){
            if (pessoaArr[i].getIdade() < 16){
                cont += 1;
            }
        }
        float porcentagem = cont * 100.0f / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        //esses %% após o f é para mostrar % apos o número e o último "%" é para o %n que quebra linha
        //"%%" imprimir % e "%n" quebra a linha

        sc.close();
    }
}
class Pessoa{
    private String nome;
    private byte idade;
    private float altura;

    public Pessoa(String nome, byte idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}