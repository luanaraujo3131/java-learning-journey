# Set

Representa um conjunto de elementos

- Não admite repetições
- Elementos não possuem posição
- Acesso, inserção e remoção de elementos são rápidos
- Oferece operações eficientes de conjunto: interseção, união, diferença.

## Principais implementações:

- HashSet: mais rápido (operações O(1) em tabela hash) e não ordenado;
- TreeSet: mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto;
- LinkedHashSet: velocidade intermediária e elementos na ordem em que são adicionados

## Alguns métodos importantes

- add(obj), remove(obj), contains(obj)
Baseado em equals e hashCode
Se equals e hashCode não existir, é usada comparação de ponteiros
- clear()
- size()
- removeIf(predicate)
- addAll(other) (união): adiciona no conjunto os elementos do outro conjunto sem repetição
- retainAll(other) (interserção): remove do conjunto os elementos não contitos em other
- removeAll(other) (diferença): remove do conjunto os elementos contidos em other
