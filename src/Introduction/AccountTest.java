package Introduction;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // cria um objeto Account e o atribui a myAccount
        Account myAccount = new Account();
        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // solicita e lê o nome
        System.out.println("Please, enter the name: ");
        String name = input.nextLine(); // lê uma linha de texto
        myAccount.setName(name);//Insere o valor de name em myAccount
        System.out.println();//gera saida de uma linha em branco

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
class Account{
    private String name;// variável de instância

    // método para definir o nome no objeto:
    public void setName(String name) {
        this.name = name; //armazena o nome
    }

    // método para recuperar o nome do objeto:
    public String getName() {
        return name; // retorna valor do nome para o chamador
    }
}
