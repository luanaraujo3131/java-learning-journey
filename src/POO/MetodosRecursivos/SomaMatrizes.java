package POO.MetodosRecursivos;

import javax.swing.JOptionPane;
public class SomaMatrizes {
    public static void main(String[] args) {
        int m = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas tem as matrizes?"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas tem as matrizes?"));
        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o próximo item da matriz A."));
            }
        }
        System.out.println("Matriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizA[i][j]+"\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o próximo item da matriz B."));
            }
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizB[i][j]+"\t");
            }
            System.out.println("");
        }
        int[][] matrizSoma = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizSoma[i][j] = matrizA[i][j]+matrizB[i][j];
            }
        }
        System.out.println("Resultado da Soma das Matrizes:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizSoma[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
