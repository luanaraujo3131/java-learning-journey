package POO.Exemplos.Imersao.com.test.bank.model.Pagamento;

import POO.Exemplos.Imersao.com.test.bank.model.Pessoa;


//implementando duas interfaces(DocumentoPagavel e DocumentoEStonavel), ou seja, posso tanto
//pagar um documento, como receber o valor de volta, caso seja necessário.
public class Boleto implements DocumentoPagavel, DocumentoEstornavel{
    private Pessoa pagador;
    private double valorDoBoleto;
    private boolean pago;

    public Boleto(Pessoa pagador, double valorDoBoleto){
        this.pagador = pagador;
        this.valorDoBoleto = valorDoBoleto;
    }
    @Override
    public double getValorTotal() {
        return valorDoBoleto;
    }
    @Override
    public boolean estaPago() {
        return pago;
    }
    @Override
    public void estornarPagamento() {
        pago = false;
    }
    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
