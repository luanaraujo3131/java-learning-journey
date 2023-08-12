package OOP.Exemplos.Imersao.com.test.bank.model;

public class Pessoa {
    private String nome;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + "\n" +
                "CPF: '" + CPF + '\'';
    }
}
