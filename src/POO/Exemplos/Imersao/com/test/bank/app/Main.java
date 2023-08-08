package POO.Exemplos.Imersao.com.test.bank.app;

import POO.Exemplos.Imersao.com.test.bank.model.*;
import POO.Exemplos.Imersao.com.test.bank.model.ATM.CaixaEletronico;
import POO.Exemplos.Imersao.com.test.bank.model.Pagamento.Boleto;
import POO.Exemplos.Imersao.com.test.bank.model.Pagamento.DocumentoEstornavel;
import POO.Exemplos.Imersao.com.test.bank.model.Pagamento.DocumentoPagavel;
import POO.Exemplos.Imersao.com.test.bank.model.Pagamento.Holerite;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        ContaInvestimento conta1 = new ContaInvestimento(pessoa1, 123, 12345);
        ContaEspecial conta2 = new ContaEspecial(pessoa2, 456, 45678, 10000);

        pessoa1.setNome("Luan Araújo Lima");
        pessoa1.setCPF("123456789");

        pessoa2.setNome("Davi Araújo");
        pessoa2.setCPF("987654321");

        //conta1.titular = pessoa1;
        //conta1.agencia = 123;
        //conta1.numero = 12345;
        //conta1.saldo = 3500;

        //ações:
        CaixaEletronico caixaEletronico = null;
        try {
            conta1.depositar(4000);
            conta1.sacar(1200, 10);
            conta1.creditarInvestimentos(0.8);
            conta1.debitarTarifaMensal();

            conta2.depositar(30000);
            conta2.sacar(15500, 0);
            conta2.debitarTarifaMensal();

            caixaEletronico = new CaixaEletronico();

            DocumentoPagavel boletoInternet = new Boleto(pessoa1, 40000);
            Holerite salarioFuncionario = new Holerite(pessoa2, 100, 160);

            System.out.println("Boleto pago: " + boletoInternet.estaPago());//inicia como falso
            caixaEletronico.pagar(boletoInternet, conta1);
            System.out.println("Boleto pago: " + boletoInternet.estaPago());//após ser pago vira true

            caixaEletronico.pagar(salarioFuncionario, conta2);//paga o salário do funcionário

            //estorna o pagamento do boleto da Internet
            caixaEletronico.estornarPagamento((DocumentoEstornavel) boletoInternet, conta1);

            System.out.println("Boleto pago: " + boletoInternet.estaPago());//como o boleto foi estornado
            //vira false
            System.out.println("Salário pago: " + salarioFuncionario.estaPago());
            System.out.println();

            boletoInternet.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();
            System.out.println();
        } catch (IllegalStateException e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }
        caixaEletronico.imprimirSaldo(conta1);
        System.out.println();
        caixaEletronico.imprimirSaldo(conta2);

        //System.out.println("Conta 1:");
        //System.out.println("--------------------------------");
        //System.out.println(conta1.getTitular());
        //System.out.println("Agência: "+conta1.getAgencia()+", número: "+conta1.getNumero());
        //System.out.println("Saldo: " +conta1.getSaldo());
        //System.out.println("------------------------------");

        //System.out.println("Conta 2");
        //System.out.println("--------------------------------");
        //System.out.println(conta2.getTitular());
        //System.out.println("Agência: "+conta2.getAgencia()+", número: "+conta2.getNumero());
        //System.out.println("Saldo: " +conta2.getSaldo());
    }
}
