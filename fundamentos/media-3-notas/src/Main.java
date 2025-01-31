/**
 * Objetivo: Este programa recebe três notas de um aluno, calcula a média e exibe se ele foi aprovado ou não.
 *
 * Conceitos aplicados:
 * - Uso da classe Scanner para entrada de dados.
 * - Estruturas condicionais para validar notas e exibir o resultado.
 * - Função separada para cálculo da média.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Define o padrão de localidade para os Estados Unidos (formatação de números)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA DE MÉDIA");

        // Solicita e lê as três notas do usuário
        System.out.print("NOTA 01: ");
        double n1 = sc.nextDouble();
        System.out.print("NOTA 02: ");
        double n2 = sc.nextDouble();
        System.out.print("NOTA 03: ");
        double n3 = sc.nextDouble();

        // Verifica se alguma das notas está fora do intervalo válido (0 a 10)
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
            System.out.println("As notas precisam estar entre 0 e 10.");
            return; // Encerra o programa caso alguma nota seja inválida
        }

        // Chama o metodo para calcular a média das notas
        double media = calcularMedia(n1, n2, n3);
        System.out.printf("A sua média ficou de %.2f%n", media);

        // Exibe a mensagem correspondente ao resultado da média
        if (media >= 7) {
            System.out.println("PARABÉNS! Passou de ano.");
        } else {
            System.out.println("Não foi dessa vez! Ficou no vermelho :(");
        }

        sc.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Metodo para calcular a média de três notas
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
