package Files;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingOnTextFiles {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Digite algo: ")+"\n";
        byte[] contet = text.getBytes();
        File file = new File("file.txt");
        try {
            //FileOutputStream fileOutputStream = new FileOutputStream(file); sobrescreve
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(contet);
            fileOutputStream.close();
            JOptionPane.showMessageDialog(null, "Tudo deu certo! Veja seu arquivo em file.txt");
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        } catch (IOException e){
            System.out.println("Ocorreu um erro durante a escrita do arquivo.");
        }
    }
}
