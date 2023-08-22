# Classes abstratas

- Classes abstratas são aquelas que não
podem ser instanciadas, apenas herdadas.
- É uma forma de garantir que apenas subclasses
sejam criadas.
---
### Imagine o seguinte cenário: 
Um zoológico deseja armazenar a todas as éspecies de animais.
Poderiamos fazer uma classe abstrata "Animal" que contém o que todas
as éspecies de animais vão ter, e fazer uma classe para cada éspecie
herdando da superclasse animal. Como a classe animal, no exemplo, 
é abstrata, não poderiamos criar um objeto a partir dela, apenas
das subclasses que herdam dela

Essa classe abstrata "Animal "poderia conter as características 
e comportamentos comuns a todas as espécies de animais,
como éspecie, idade, habitat, habito alimentar, etc. 
No entanto, a classe abstrata "Animal" não pode ser instanciada 
diretamente; ela serve como uma base para subclasses mais específicas.

A partir da classe abstrata "Animal", poderíamos criar subclasses 
individuais para cada espécie de animal, como "Snake", "Monkey", "Elephant", etc.
Essas subclasses herdariam as características e métodos da classe abstrata "Animal", 
permitindo a reutilização de código e uma estrutura organizada.

Além disso, a classe abstrata "Animal" pode conter métodos abstratos, que são declarados
na classe base, mas não fornecem uma implementação. Cada subclasse deve fornecer sua 
própria implementação para esses métodos abstratos, garantindo que cada espécie de animal 
possa executar suas ações específicas.

Essa abordagem não apenas evita a duplicação de código, mas também permite a adição fácil 
de novas espécies de animais no futuro, pois basta criar uma nova classe de subclasse.

Dito tudo isso pode surgir a pergunta: Se não podemos instânciar, para que criar essas classes?
<br>
Tem principais motivos para isso:
- Reuso: Veja, tendo a classe animal, podemos reunir os atributos que todos os animais têm em comum,
se não tivessemos a classe abstrata animal, teriamos que manuamente colocar a éspecie, cor, etc.
em todos os animais. Veja que tem muito mais atributos, aqui foi apenas um exemplo para ilustrar.
Então com a classe abstrata, reunindo os atributos que todos têm em comum, não precismos manuamente
colocar os mesmo atributos em todas as classes e de animais e nos preocuparmos apenas com os atributos
únicos de cada
- Polimorfismo: Como toda relação de herança é um relacionamento "é um", podemos assumir, que todos
os animais do exemplo, independente da classe, ainda é um animal.
OLHEM EM EX1 e preceba como é simples implementar uma mudança em todas as classes herdadas da subclasse.

### Essa implementação está contida na classe zoo