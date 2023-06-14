package POO.Ex2;

public class Carro {
    String cor;
    String placa;

    public void mudarCor(String novaCor){
        cor = novaCor;
    }

    String corAtual(){
        return cor;
    }

    public void mudarPlaca(String novaPlaca){
        placa = novaPlaca;
    }

    String placaAtual(){
        return placa;
    }
}
