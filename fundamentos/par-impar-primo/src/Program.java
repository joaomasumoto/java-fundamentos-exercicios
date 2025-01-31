import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Este programa recebe um número inteiro e analisa se ele é par ou ímpar e se é um número primo.
     *
     * Conceitos Aplicados:
     * - Entrada do usuário usando Scanner.
     * - Uso do operador módulo (%) para determinar paridade.
     * - Implementação de um método otimizado para verificar se um número é primo.
     * - Modularização com métodos para organização do código.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário um número inteiro
        System.out.print("Digite o número a ser analisado: ");
        int num = sc.nextInt();

        // Verifica se o número é par ou ímpar
        if (evenOrOdd(num)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Verifica se o número é primo
        if (isPrimeNumber(num)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        sc.close(); // Fecha o Scanner
    }

    // Metodo que verifica se um número é par ou ímpar
    public static boolean evenOrOdd(int num) {
        return num % 2 == 0;
    }

    // Metodo que verifica se um número é primo
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false; // Números menores ou iguais a 1 não são primos
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se houver divisor além de 1 e ele mesmo, não é primo
            }
        }
        return true; // Número primo
    }
}