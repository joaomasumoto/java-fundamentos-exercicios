import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Este programa solicita uma frase do usuário e realiza três operações:
     * 1. Conta o número de caracteres da frase.
     * 2. Conta o número de palavras na frase.
     * 3. Exibe a frase invertida.
     *
     * Caso o usuário insira uma frase vazia, o programa pedirá nova entrada.
     *
     * Conceitos Aplicados:
     * - Validação de entrada para garantir que a frase não esteja vazia.
     * - Manipulação de strings para contagem de caracteres e palavras.
     * - Uso da classe `StringBuilder` para inverter a frase.
     * - Estrutura de repetição `while (true)` para garantir entrada válida.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Entrada do usuário
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine();

            // Validação para garantir que a frase não esteja vazia
            if (frase.isBlank()) {
                System.out.println("A frase não pode estar vazia, tente novamente.");
            } else {
                // Número de caracteres na frase
                int numCaracteres = frase.length();

                // Número de palavras na frase (separação por espaços)
                int numPalavras = frase.split(" ").length;

                // Inversão da frase usando StringBuilder
                String fraseInvertida = new StringBuilder(frase).reverse().toString();

                // Exibição dos resultados
                System.out.println("Número de caracteres: " + numCaracteres);
                System.out.println("Número de palavras: " + numPalavras);
                System.out.println("Frase invertida: " + fraseInvertida);

                break; // Encerra o loop após processar a frase válida
            }
        }
        sc.close(); // Fecha o Scanner
    }
}