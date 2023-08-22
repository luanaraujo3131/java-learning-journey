package OOP.Inheritance;

public class heranca1 {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.raio = 3;
        System.out.println("Área do circulo: " +circ.calcularArea());
        System.out.println("Perímetro do circulo: " +circ.calcularPerimetro());

        System.out.println("------------------------------------------");

        Cilindro cil = new Cilindro();
        cil.altura = 5;
        cil.raio = 4;
        System.out.println("Área do cilindro: " +cil.calcularArea());
        System.out.println("Perímetro do cilindro: " +cil.calcularPerimetro());
        System.out.println("Volume: " +cil.calculaVolume());
    }
}
class Circulo{
    double raio;
    double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
    double calcularArea(){
        return Math.PI * Math.pow(2, raio);
    }
}
class Cilindro extends Circulo{
    double altura;
    double calculaVolume(){
        return calcularArea() * altura;
    }
}
/**
 * Na prática, o que está acontecendo é que a classe "Cilindro" está herdando todos os métodos da class
 * "Círculo", por causa do "extends", então, se não usarmos a herança nesse caso, por exemplo, teriamos
 * que refaer os métodos. Então ao invés de reinventarmos a roda, pode herdar os métodos que já foram
 * criados anteriomentos usarmos quando necessário.
 *
 */
