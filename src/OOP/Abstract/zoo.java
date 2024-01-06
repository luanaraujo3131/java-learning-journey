package OOP.Abstract;


public class zoo {

    public static void main(String[] args) {
        //Animal animal1 = new Animal(); perceba que isso resulta em um erro de complicação
        Monkey gorila = new Monkey("Gorila", "Selva", "Onívoros",
                (short) 40, AnimalColor.PRETO);
        System.out.println(gorila);
        gorila.makeSound();
        System.out.println();

        Snake sucuri = new Snake("Sucuri", "Aquatico", "Carnivoras",
                (short) 30, AnimalColor.VERDE);
        System.out.println(sucuri);
        sucuri.makeSound();
        System.out.println();

        Lion leaoAfricano = new Lion("Leão-Africano", "Selva", "Carnivoros",
                (short) 12, AnimalColor.MARROM);
        System.out.println(leaoAfricano);
        leaoAfricano.makeSound();
        System.out.println();

        Eagle americanEagle = new Eagle("Águia-americana", "Perto do mar, rios e lagos",
                "Carnívora", (short) 25, AnimalColor.PRETO);
        System.out.println(americanEagle);
        americanEagle.makeSound();
        System.out.println();

        Frog blueFrog = new Frog("Dendrobates azureus", "Lagos e lagoas", "Onívoro",
                (short) 7, AnimalColor.AZUL);
        System.out.println(blueFrog);
        blueFrog.makeSound();
        System.out.println();

        Shark whiteShark = new Shark("Tubarão-Branco", "Mar", "Carnívoro",
                (short) 30, AnimalColor.BRANCO);
        System.out.println(whiteShark);
    }
}
abstract class Animal{
    private String especie;
    private String habitat;
    private String habitoAlimentar;
    private short tempoDeVida;
    private AnimalColor color;

    public Animal(){}

    public Animal(String especie, String habitat, String habitoAlimentar, short tempoDeVida, AnimalColor color){
        this.especie = especie;
        this.habitat = habitat;
        this.habitoAlimentar = habitoAlimentar;
        this.tempoDeVida = tempoDeVida;
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitoAlimentar() {
        return habitoAlimentar;
    }

    public void setHabitoAlimentar(String habitoAlimentar) {
        this.habitoAlimentar = habitoAlimentar;
    }

    public short getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(short tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public AnimalColor getColor() {
        return color;
    }

    public void setColor(AnimalColor color) {
        this.color = color;
    }

    public abstract void makeSound();
}

abstract class Mamifero extends Animal{
    public Mamifero(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                    AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }
}

abstract class Repteis extends Animal {
    public Repteis(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                   AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }
}

abstract class Aves extends Animal{
    public Aves(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                   AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }
}

abstract class Anfibios extends Animal{
    public Anfibios(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                   AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }
}

abstract class Peixes extends Animal{
    public Peixes(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }
}

class Monkey extends Mamifero{
    public Monkey(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                  AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }

    @Override
    public void makeSound() {
        System.out.println("OOOHOHOHOHAHAHAHAHAOHAH");
    }

    @Override
    public String toString() {
        return "Monkey{ " +
                "especie = '" + getEspecie() + '\'' +
                ", habitat = '" + getHabitat() + '\'' +
                ", habitoAlimentar ='" + getHabitoAlimentar() + '\'' +
                ", tempoDeVida = " + getTempoDeVida() +
                ", cor = " + getColor() +
                '}';
    }
}

class Snake extends Repteis{
    public Snake(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                 AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }

    @Override
    public void makeSound() {
        System.out.println("PSSSSSS PSSSS PSSSS");
    }

    @Override
    public String toString() {
        return "Snake{ " +
                "especie = '" + getEspecie() + '\'' +
                ", habitat = '" + getHabitat() + '\'' +
                ", habitoAlimentar ='" + getHabitoAlimentar() + '\'' +
                ", tempoDeVida = " + getTempoDeVida() +
                ", cor = " + getColor() +
                '}';
    }
}

class Lion extends Mamifero{
    public Lion(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }

    @Override
    public void makeSound(){
        System.out.println("RANNN RAHUNNN RAUNNNHJAJSH");
    }

    @Override
    public String toString() {
        return "Lion{ " +
                "especie = '" + getEspecie() + '\'' +
                ", habitat = '" + getHabitat() + '\'' +
                ", habitoAlimentar ='" + getHabitoAlimentar() + '\'' +
                ", tempoDeVida = " + getTempoDeVida() +
                ", cor = " + getColor() +
                '}';
    }
}

class Eagle extends Aves{

    public Eagle(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                 AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }

    @Override
    public void makeSound(){
        System.out.println("PIIIIIIIIIIII");
    }
    @Override
    public String toString() {
        return "Eagle{ " +
                "especie = '" + getEspecie() + '\'' +
                ", habitat = '" + getHabitat() + '\'' +
                ", habitoAlimentar ='" + getHabitoAlimentar() + '\'' +
                ", tempoDeVida = " + getTempoDeVida() +
                ", cor = " + getColor() +
                '}';
    }
}

class Frog extends Anfibios{
    public Frog(String especie, String habitat, String habitoAlimentar, short tempoDeVida,
                AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }

    @Override
    public void makeSound(){
        System.out.println("GREP QUET GREP QUET");
    }

    @Override
    public String toString() {
        return "Frog{ " +
                "especie = '" + getEspecie() + '\'' +
                ", habitat = '" + getHabitat() + '\'' +
                ", habitoAlimentar ='" + getHabitoAlimentar() + '\'' +
                ", tempoDeVida = " + getTempoDeVida() +
                ", cor = " + getColor() +
                '}';
    }
}

class Shark extends Peixes{
    public Shark(String especie, String habitat, String habitoAlimentar,
                 short tempoDeVida, AnimalColor color) {
        super(especie, habitat, habitoAlimentar, tempoDeVida, color);
    }

    @Override
    public void makeSound(){
        System.out.println("....");
    }

    @Override
    public String toString() {
        return "Shark{ " +
                "especie = '" + getEspecie() + '\'' +
                ", habitat = '" + getHabitat() + '\'' +
                ", habitoAlimentar ='" + getHabitoAlimentar() + '\'' +
                ", tempoDeVida = " + getTempoDeVida() +
                ", cor = " + getColor() +
                '}';
    }
}

enum AnimalColor {
    VERDE,
    PRETO,
    MARROM,
    BRANCO,
    AZUL;
}

