package Files;

import java.io.*;

public class ReadingBinaryFiles {
    public static void main(String[] args) {
        File file = new File("file.bin");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            char c = dataInputStream.readChar();
            int i = dataInputStream.readInt();
            String s = dataInputStream.readUTF();
            double d = dataInputStream.readDouble();
            System.out.println("Char: " +c);
            System.out.println("Int: " +i);
            System.out.println("String: " +s);
            System.out.println("Double: " +d);
            fileInputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encotrado.");
        } catch (IOException e){
            System.out.println("Ocorreu um erro na leitura do arquivo");
        }
    }
}
