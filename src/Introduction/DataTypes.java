package Introduction;

public class DataTypes {
    public static void main(String[] args){
        byte inteiroByte = 127; //suporta números de -128 a 127. Tamanho de 8 bits
        short inteiroShort = 32767;//suporta números de -32768 a 32767. Tamanho de 16 bits
        int inteiroInt = 2147483647;//suporta números de -2147483648 a 2147483647. Tamanho de 32 bits
        long interoLong = 2543215262300035632L;// 64 bits. Precisamos usar o L de long
        float pontoFlutuanteFloat = 4.52F;//ponto flutuante de 32 bits. Precisamos do F de float
        double pontoFlutuanteDouble = 12.035654;//Ponto flutuante de 64 bits.
        boolean trueOrFalse = true;//recebe por padrão o false. 1 bit
        char caractere = '!';//um caractere. 16 bits, representado por ''
        String textoQualquer = "Hello, world!";

        System.out.println(textoQualquer);
        /*A diferença entre float e double é que como o double é 2x maior que o float (64 e 32), o
        * double tem uma precisão muito maior que o float e suporta mais números após a virgular, ou seja,
        * se for uma váriavel com muitos números após a vírgula ou que se precise de muita precisão nos
        * resultados, o double é a melhor opção, caso perder alguns números após a vírgula não seja um
        * problema, o float é a melhor opção, pois ele redu o uso de mémoria*/

    }
}
