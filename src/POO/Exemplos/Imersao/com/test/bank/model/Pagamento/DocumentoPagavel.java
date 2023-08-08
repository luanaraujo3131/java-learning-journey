package POO.Exemplos.Imersao.com.test.bank.model.Pagamento;

public interface DocumentoPagavel {
    //public abstract double getValorTotal();
    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();
    default void imprimirRecibo(){
        System.out.println("RECIBO:");
        System.out.println("Valor: " +getValorTotal());
        System.out.println("Pago: " +estaPago());
    }

    /*todo método ou variável numa interface é abstract e o compilador aumtomáticamente entende isso,
    quando colocamos "PUBLIC ABSTRACT DOUBLE VARIAVEL", nós estamos sendo redundantes, ou seja,
    colocando coisas desnecessárias no nosso código(a própria IDE nos alerta sobre isso).*/

    /*Numa interface, não colocamos nenhuma implementação, apenas falamos quais implementações e atributos
    * algo deve ter, nesse caso, quais são os atributos e métodos de um documento pagavél...*/


}
