package OOP.Exemplos.Ex1.Utilidade;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Construtor para iniciar os valores da "Data"
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String toString(){
        return dia+ "/" +mes+ "/" +ano;
        //cocatena dia/mes/ano
    }
    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
}
