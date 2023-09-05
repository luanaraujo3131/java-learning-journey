package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingTextFiles {
    public static void main(String[] args) {
        File arquivo = new File("file.txt"); //Lê esse arquivo
        byte[] conteudo = new byte[(int) arquivo.length()];
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            fis.read(conteudo);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante a leitura do arquivo.");
        }
        String texto = new String(conteudo);
        System.out.println(texto);
    }
}
