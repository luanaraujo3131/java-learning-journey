package Files;

import java.io.*;

public class WritingBinaryFiles {
    public static void main(String[] args) {
        double d = 6.2022E23;
        int i = 88;
        char c= 'P';
        String s = "Comer é uma expressão da vida: Só quem vive come e só quem come vive!";
        File file = new File("file.bin");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeChar(c);
            dataOutputStream.writeUTF(s);
            dataOutputStream.writeDouble(d);

            fileOutputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e){
            System.out.println("Ocorreu um erro durante a escrita do arquivo.");
        }
        /**
         * Se tudo der certo, um aquivo do tipo .bin será criado, e nesse arquivo
         * terá o conteúdo que foi adicionado em dataOutputStream*/
    }
}

