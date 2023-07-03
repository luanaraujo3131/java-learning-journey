package Files;

import java.io.File;
import java.io.FileOutputStream;

public class WritingOnCSVFiles {
    public static void main(String[] args) {
        File arquivo = new File("../arquivo.csv"); //Arquivo planilha
        String texto = "Produto; quantidade; Preço\n";
        byte[] conteudo = texto.getBytes();
      /*  try{

        } catch (){

        }*/
    }
}
