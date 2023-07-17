package Files;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingOnTextFiles {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Write Something: ");
        byte[] conteudo = text.getBytes();
        File arquivo = new File("file.txt"); //cria o arquivo com o que for escrito ao compilar.
        try {
            FileOutputStream fos = new FileOutputStream(arquivo);
            fos.write(conteudo);
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        } catch (IOException e){
            System.out.println("Ocorreu um erro");
        }
    }
}
