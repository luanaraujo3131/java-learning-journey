package OOP.Exemplos.Ex1.Controle;

import OOP.Exemplos.Ex1.Utilidade.Data;

public class RegistroConta {
    public static void main(String[] args) {
        Data d = new Data(29, 05, 2023);
        //(cpf e nome, como é String tem que usar "")
        Correntista c1 = new Correntista("07951579165", "Luan Araújo Lima");
        Correntista c2 = new Correntista("84543287452", "Sara");
        Correntista[] correntistas = new Correntista[2]; //criando o array com 2 valores
        correntistas [0] = c1;
        correntistas [1] = c2;
        //numeroConta, SALDO, d=data, correntista, 200=monto(quanto dinheiro tem na conta)
        Conta conta1 = new Conta(334455, 250, d, correntistas, 200);
        System.out.println(conta1);
    }
}
