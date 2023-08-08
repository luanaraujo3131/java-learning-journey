package POO.Exemplos.Imersao.com.test.bank.model.Pagamento;


public interface DocumentoEstornavel {
    double getValorTotal();
    boolean estaPago();
    void estornarPagamento();
}
