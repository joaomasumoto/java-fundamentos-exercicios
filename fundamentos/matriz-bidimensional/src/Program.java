import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Este programa recebe uma matriz 2x2 preenchida pelo usuário, exibe a matriz,
     * calcula a soma de todos os seus elementos e a soma da diagonal principal.
     *
     * Conceitos Aplicados:
     * - Uso de matrizes (arrays bidimensionais) para armazenar valores.
     * - Entrada do usuário com Scanner para preencher a matriz.
     * - Uso de loops aninhados para percorrer e exibir a matriz.
     * - Cálculo da soma total e da diagonal principal.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração da matriz 2x2
        int matriz[][] = new int[2][2];

        // Preenchimento da matriz pelo usuário
        System.out.println("Digite os valores da matriz 2x2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Exibição da matriz formatada
        System.out.println("\nMatriz fornecida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Cálculo da soma de todos os elementos da matriz
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
        }

        // Cálculo da soma da diagonal principal
        int diagonalP = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonalP += matriz[i][i];
        }

        // Exibição dos resultados das somas
        System.out.println("\nResultados:");
        System.out.println("Soma de todos os elementos da matriz: " + sum);
        System.out.println("Soma da diagonal principal: " + diagonalP);

        sc.close(); // Fecha o Scanner
    }
}