import java.util.Arrays;
import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Receber três valores inteiros, ordená-los em ordem crescente e exibi-los.
     *
     * Conceitos Aplicados:
     * - Entrada do usuário com a classe Scanner.
     * - Manipulação de arrays para armazenar e ordenar dados.
     * - Uso do método Arrays.sort para organizar os números.
     * - Laço for-each para exibição dos valores ordenados.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita os três valores inteiros do usuário
        System.out.print("1º valor: ");
        int valor1 = sc.nextInt();

        System.out.print("2º valor: ");
        int valor2 = sc.nextInt();

        System.out.print("3º valor: ");
        int valor3 = sc.nextInt();

        // Armazena os valores em um array
        int valores[] = {valor1, valor2, valor3};

        // Ordena os valores dentro do array
        Arrays.sort(valores);

        // Imprime os valores em ordem crescente
        System.out.println("Valores em ordem crescente:");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        sc.close(); // Fecha o Scanner
    }
}