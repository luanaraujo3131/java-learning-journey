package OOP.Interfaces.ProblemEx.Part1.Model.Service;

import OOP.Interfaces.ProblemEx.Part1.Model.Entities.CarRental;
import OOP.Interfaces.ProblemEx.Part1.Model.Entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double hourPrice;
    private Double dayPrice;

    private TaxService taxService;

    public RentalService(Double hourPrice, Double dayPrice,
                         TaxService taxService) {
        this.hourPrice = hourPrice;
        this.dayPrice = dayPrice;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getEnd()).toMinutes();
        double hours = minutes / 60;//arredonda o valor dos minutos em horas para cima
        double basicPayment;
        if (hours <= 12){
            basicPayment = hourPrice * Math.ceil(hours); //taxa por hora
        } else {
            basicPayment = dayPrice * Math.ceil(hours / 24.0); //taxa por dia
        }
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
    /**Releembrando a regra de négocio:
     * Se o a quantidade de horas em que o carro ficou alugado for menor que 12 horas, será cobrada a
     * taxa por hora, se for superior a 12, a taxa cobrada será a taxa por dia.
     * */

    /**Duration e between vêm do próprio java, da classe da classe Time, como dá pra imaginar,
     ele pega a quantidade de tempo entre uma data e outra ou entre uma hora e outra e podemos
     epresentar isso de diversas maneira, no ex, pegamos as esse tempo em minutos(.toMinutes()), mas
     poderia ser em horas, segundos, dias, miliseguntos, etc.*/
}
