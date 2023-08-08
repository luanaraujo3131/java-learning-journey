package POO.Exemplos.Imersao.com.test.bank.model.ATM;

import POO.Exemplos.Imersao.com.test.bank.model.Conta;
import POO.Exemplos.Imersao.com.test.bank.model.Pagamento.DocumentoEstornavel;
import POO.Exemplos.Imersao.com.test.bank.model.Pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta){
        //aceita contaInvestimento e contaEspecial
        //ou seja, eu não preciso escrever dois métodos, um para contaInvestimento e outro para contaEspecial
        //Isso é o polimorfismo
        System.out.println("Conta: "+conta.getAgencia()+"/"+conta.getNumero());
        System.out.println("Titular: "+ conta.getTitular().getNome());
        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Saldo disponível: "+conta.getSaldoDisponivel());
    }
    public void pagar(DocumentoPagavel documento, Conta conta){
        if (documento.estaPago()){
            throw new IllegalStateException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }
    public void estornarPagamento(DocumentoEstornavel documento, Conta conta){
        if (!documento.estaPago()){//se documento não está pago!!!!!!!
            throw new IllegalStateException("Documento não está pago!");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}
