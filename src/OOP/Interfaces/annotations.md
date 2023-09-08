# Interfaces

Uma Interface define um "contrato" ou um conjunto de ações que uma classe
deve implementar. Ela define uma lista de métodos (assinaturas de métodos)
que devem ser implementados pelas classes que a utilizam. Ou seja, uma interface
define padrões que as classes devem seguir, promovendo, assim, a a modularidade, o reuso e a flexibilidade do código.
- ps: Mesmo que a interface defina os métodos a serem criados por cada classe
que a impletemente, um interface não tem implementação desse métodos.

```java
interface shape{
    double area();
    double perimetro();
}
public class Triangle implements shape{
    @Override
    public double area(){
        return b * h /2;
    }
    @Override
    public double perimetro(){
        return side1 + side2 + side3;
    }
}
```
Veja essa implementação completa em **Geometry**. 
Lá foi foi implementa 3 formas geometricas diferentes: círculo, quadrado e triângulo.
Todas implementando a interface shape, mas perceba que cada uma
tem uma implementação diferente, se testarmos, quando diemos que uma classe vai implementar uma interface (implements), o compilador nos obrigaa implementar os métodos contidos na interface, nesse caso, área e perimetro, mas, de novo, não nos dá uma implementação fechada, apenas nos fala que essa implementação precisa acontecer e cada classe vai ter sua forma de implementar, no mínimo, os métodos que estão na interface. 

- ps: Uma classe só pode herdar outra classe, mas pode implementar
várias interfaces.

# Interface X Classes Abstratas


## Relação entre Interfaces e Classes Abstratas
Ao fazermos uma classe implementar uma interface, estamos assumindo
a responsibilidade de fazer essa classe implementar os métodos contidos na interface OU fazendo essa classe ser abstrata. Na prática, ou implementamos os métodos ou dexamos a classe como abstrata. A vantagem disso é garantir que as classes que herdarão da superclasse(a abstrata que implementa a interface), vão implementar os métodos da interface. Ou seja, nesse contexto, a superclasse, mesmo que não esteja diretamente implementando os métodos, está "assinando um contrato" com um compilador dizendo que as classes que a herdarão vão implementar os métodos da interface.
**Olhe um exemplo disso em Ex2.**