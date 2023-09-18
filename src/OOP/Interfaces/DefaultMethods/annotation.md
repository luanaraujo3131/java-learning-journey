# Default Methods
A partir do Java 8, tornou-se possivel adicionar implementações

``` java
    public interface Carro{
        default void Ligar(){
            throw new UnsupportedOperationException("Error"!);
        }
        default void Desligar(){
            throw new UnsupportedOperationException("Error");
        }
    }
```

Os métodos ligar e desligar agora possuem uma implementação default que será herdada por todas as classes que implementarem a interface TV.

A intenção básica é prover implementação padrão para métodos, evitando repetição de implementação em toda classe que implemente a interface e a necessidade de se criar classes abstratas para prover reuso da implementação.


Outras vantagens:
    - Manter a retrocompatibilidade com sistemas existentes
    - Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis

## Olhe o arquivo "Ex1"