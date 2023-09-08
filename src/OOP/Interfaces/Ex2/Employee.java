package OOP.Interfaces.Ex2;

abstract class Employee implements Payable{

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, 
                    String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s",
        getFirstName(), getLastName(), getSocialSecurityNumber());
    }  
}

/** 
 * Perceba que a classe Employee não implementa o método contido
 * na interface, ao fazermos uma classe implementar uma interface,
 * estamos assumindo a responsibilidade de fazer essa classe implementar
 * os métodos contidos na interface OU fazendo essa classe ser abstrata.
 * Se apagarmos o abstract vai dar erro de complição, ou seja, ou 
 * implementamos o método da interface ou deixamos a classe como
 * abstrata. Isso significa que qualquer classe que herde da superclasse
 * abstrata(que implementa a interface) deve implementar ou métodos 
 * da interface, ou seja, nesse contexto, a superclasse(Employee),
 * mesmo que não esteja diretamente implementando os métodos, está 
 * "assinando um contrato" com um compilador dizendo que as classes
 * que a herdarão vão implementar os métodos da interface. 
 */
