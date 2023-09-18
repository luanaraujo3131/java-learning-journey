package AlgorithmsAndDataStructure.Collection.InterfaceComperable.SortingNames.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class app {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        String path = "listOfName.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String name = bufferedReader.readLine();
            while(name != null){
                list.add(name);
                name = bufferedReader.readLine();
            }

            Collections.sort(list);//ordena os nomes

            for(String stringName : list){
                System.out.println(stringName);
            }
        } catch(IOException e){
            System.out.println("Erro: " +e.getMessage());
        }
    }
}
