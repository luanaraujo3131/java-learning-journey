package OOP.Interfaces.DefaultMethods;

interface TV{
    void Ligar();
    default void Desligar(){
        System.out.println("Desligou");
    }
}

class Sony implements TV{

    @Override
    public void Ligar() {
        System.out.println("Ligou");
    }

    @Override
    public void Desligar(){
        System.out.println("Perceba que o método desligar mudou");
    }
}

class Samsung implements TV{

    @Override
    public void Ligar() {
        System.out.println("Ligou");
    }   
}

public class Ex1 {
    public static void main(String[] args) {
        Samsung tvSamsung = new Samsung();
        Sony tvSony = new Sony();   
        tvSamsung.Ligar();
        tvSamsung.Desligar();
        tvSony.Desligar();        
    }
}

/*
 * Suponhamos que primeiro foi criado a interface apenas 
 * com o método Ligar(), se futuramente quisersemos adicionar
 * o método desligar, fariamos isso, mas depois teriamos que 
 * ir em cada classe que implementa a interface e adcionar o 
 * método Desligar(), mas se adicionarmos o default methd,
 * automáticamente as classes que implementam a interface vão
 * herdar esses métodos default. Perceba que o método "Desligar()"
 * está apenas na minha interface, mas se rodar o programa,
 * a "samsung" consegue rodar o método Desligar, mesmo que
 * ele não esteja implementado na class Sansumg.
 * O mais legal disso é que a interface nos dá o modelo,
 * tipo uma classe abstrata, ou seja, se não modificarmos, o 
 * o padrão será o default da interface, mas caso seja necessário
 * mudar algo pra uma classe especifica, podemos mudar sem nenhum
 * problema, o que prevalece é o método na classe. No exemplo, a 
 * TV Samsung só mostrará o "Desligar", pois é o que está na interface,
 * mas a TV Sony, irá imprimir "Perceba que o método desligar mudou",
 * pois mudamos o método "Desligar()" direto na classe.
 */
