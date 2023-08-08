/*
* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
* pelos números 0 a 9. Faça um programa que inicie com todos os dez quartos vazios, e depois leia uma
* quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10).
* Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email
* do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago.
* Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto,
* conforme exemplo:
* How many rooms will be rented? 3
* Rent #1:
* Name: Maria Green
* Email: maria@gmail.com
* Room: 5
* Rent #2:
* Name: Marco Antonio
* Email: marco@gmail.com
* Room: 1
* Rent #3:
* Name: Alex Brown
* Email: alex@gmail.com
* Room: 8
* Busy rooms:
* 1: Marco Antonio, marco@gmail.com
* 5: Maria Green, maria@gmail.com
* 8: Alex Brown, alex@gmail.com
* */

package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.Scanner;

public class DesafioPensionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quarto arrQuarto[] = new Quarto[10];

        System.out.println("Quantos estudantes vão alugar?");
        byte n = sc.nextByte();
        sc.nextLine(); // Limpa o buffer de entrada após a leitura do byte
        try {
            if (n < 1 || n > 10) {
                throw new InvalidNumberOfStudents("Número inválido de estudantes. Deve ser um valor entre 1 e 10.");
            } else {
                for(int i = 1; i <= n; i++){
                    System.out.println("Aluguel # " +i+ ":");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    try {
                        System.out.println("Quarto: ");
                        byte numQuarto = sc.nextByte();

                        arrQuarto[numQuarto] = new Quarto(nome, email);
                    } catch (ArrayIndexOutOfBoundsException e ){
                        System.out.println("O número máximo de quartos é 10");
                    }
                    sc.nextLine();
                }
            }
        } catch (InvalidNumberOfStudents e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++){
            if (arrQuarto[i] != null) {
                System.out.println(i+ " : " +arrQuarto[i]);
            }
        }


        sc.close();
    }
}
class Quarto{
    private String nomeEstudante;
    private String email;
    private static byte quarto; //0 a 9

    public Quarto(String nomeEstudante, String email){
        this.nomeEstudante = nomeEstudante;
        this.email = email;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }
    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static byte getQuarto() {
        return quarto;
    }
    public void setQuarto(byte quarto) {
        this.quarto = quarto;
    }
    @Override
    public String toString(){
        return "Rent: \n" +
                "----------------------- \n"+
                "Nome: " +nomeEstudante+ "\n"+
                "E-mail: " +email+ "\n"+
                "Quarto alugado: " +quarto+ "\n";
    }
}
class InvalidNumberOfStudents extends RuntimeException{
    public InvalidNumberOfStudents(String message){
        super(message);
    }
}
