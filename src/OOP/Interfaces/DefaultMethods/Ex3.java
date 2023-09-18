package OOP.Interfaces.DefaultMethods;

import java.util.Random;
import java.util.function.Supplier;

interface Cronometro{
    <T> T cronometrar(Supplier<T> supplier);
}

interface CronometroMillisegungos extends Cronometro{
    @Override 
    default <T> T cronometrar(Supplier<T> supplier){
        long start = System.currentTimeMillis();
        T result = supplier.get();
        long end = System.currentTimeMillis();
        System.out.println("Millisegundos = " + (end - start));
        return result;
    }
}

interface CronometroNanosegundos extends Cronometro{
    @Override
    default<T> T cronometrar(Supplier<T> supplier){
        long start = System.nanoTime();
        T result = supplier.get();
        long end = System.nanoTime();
        System.out.println("Nanossegundos: " + (end - start));
        return result;
    }
}

interface CronometroComponente{
    Cronometro getCronometro();
}

interface FactoryCronometro extends CronometroComponente{
    @Override
    default Cronometro getCronometro(){
        return new CronometroNanosegundos() {};
    }
}

public class Ex3 implements CronometroComponente, FactoryCronometro{

    private final Cronometro cronometro = getCronometro();

    public long fazerAlgo(){
        return cronometro.cronometrar( () -> {
            long soma = 0;
            for(int i = 0; i < 100000 + new Random().nextInt(10000); i++){
                soma += i;
            }
            return soma;
        });
    }

    public static void main(String[] args) {
        long result = new Ex3().fazerAlgo();
        System.out.println("Soma = " + result);
    }
}
