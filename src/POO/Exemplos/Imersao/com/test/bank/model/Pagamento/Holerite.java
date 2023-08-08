package POO.Exemplos.Imersao.com.test.bank.model.Pagamento;

import POO.Exemplos.Imersao.com.test.bank.model.Pessoa;

public class Holerite implements DocumentoPagavel{
    private Pessoa funcionario;
    private double valorHora;
    private int qtdHoras;
    private boolean pago;

    public Holerite(Pessoa funcionario, double valorHora, int qtdHoras){
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double getValorTotal() {
        return valorHora * qtdHoras;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
