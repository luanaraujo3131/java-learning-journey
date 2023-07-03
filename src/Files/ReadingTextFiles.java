package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingTextFiles {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\07951579165\\arquivo.txt"); //caminho para o arquivo
        byte[] conteudo = new byte[(int)arquivo.length()];
        try{
            FileInputStream fis = new FileInputStream(arquivo);
            fis.read(conteudo);
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        } catch (IOException e){
            System.out.println("Ocorreu um erro durante a leitura do arquivo");
        }
        String texto = new String(conteudo);
        System.out.println(texto);
    }
}
