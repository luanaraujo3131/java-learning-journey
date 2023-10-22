package Generics.Map;

import java.util.Map;
import java.util.TreeMap;

//Conteúdo mais aprofundado no capítulo de Collections
//MAP<K,V> (KEY, VALUE)
//pode ser um HashMap, TreeMap ou LinkedHashMap
public class Ex1 {
    public static void main(String[] args){
        //key e value do tipo string
        Map<String, String> cookies = new TreeMap<>();

        //chave e valor
        cookies.put("userName", "Bruce");
        cookies.put("phone", "1234567");
        cookies.put("email", "bruceBatman12@gmail.com");

        cookies.remove("email");//remove o obj com a chave escolhida, nesse caso, email

        System.out.println("Contain 'phone'?: " +cookies.containsKey("phone"));
        //pegando o valor da chave phone:
        System.out.println("phone: " +cookies.get("phone"));

        //Tamanho do map
        //2: username e phone
        System.out.println("Size: " +cookies.size());

        System.out.println("All cookies: ");
        //pegando a informação de cada chave/valor
        for (String key : cookies.keySet()) {
            System.out.println(key+ ": " +cookies.get(key));
        }
    }
}
