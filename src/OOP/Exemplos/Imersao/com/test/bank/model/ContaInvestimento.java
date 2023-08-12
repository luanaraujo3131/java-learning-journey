package OOP.Exemplos.Imersao.com.test.bank.model;

public class ContaInvestimento extends Conta{//contaInvestimento esá herdando conta.
    //construtor:
    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);

        //A classe super é a classe que estamos herdando, estamos escrevendo isso para falar que o
        //construtor que queremos usar é aquele que obriga a colocar titular agencia e numero
        //não so public Conta(){}, que não obriga e deixa nas mãos do usuário preencher ou não
        //esses campos
        //Quando instanciamos uma classe que herda outra, obrigatoriamente, precisamos chamar o construtor
        // da classe principal com esse super(). Se não fiermos isso, o java vai, por padrão colocar um
        //super() sem argumentos.
    }
    public void creditarInvestimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        //perceba que getSaldo vem da classe principal que é a classe conta, ou seja, quando herdamos
        // uma classe todos os seus atributos da classe super vem para a classe herdada também
        depositar(valorRendimentos);
    }

    @Override
    public void debitarTarifaMensal() {
        if (getSaldo() < 10000){
            sacar(30);
        }
    }
}
