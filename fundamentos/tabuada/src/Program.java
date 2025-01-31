import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Este programa solicita ao usuário um número entre 1 e 10 e exibe a tabuada correspondente.
     * Caso o usuário informe um número inválido, ele solicitará uma nova entrada até que um valor válido seja digitado.
     *
     * Conceitos Aplicados:
     * - Uso do laço de repetição `while (true)` para garantir entrada válida do usuário.
     * - Validação para aceitar apenas números entre 1 e 10.
     * - Uso do laço `for` para gerar a tabuada de multiplicação.
     * - Interação com o usuário via Scanner.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Laço infinito até que o usuário insira um número válido
        while (true) {
            System.out.print("Digite um número de 1 a 10 para ver sua tabuada: ");
            int num = sc.nextInt();

            // Verifica se o número está dentro do intervalo válido
            if (num >= 1 && num <= 10) {

                System.out.println("Tabuada do " + num + ":");

                // Laço para exibir a tabuada do número escolhido
                for (int i = 1; i <= 10; i++) {
                    int result = num * i;
                    System.out.println(num + " x " + i + " = " + result);
                }
                break; // Sai do loop após exibir a tabuada
            } else {
                // Mensagem de erro caso o número esteja fora do intervalo permitido
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 10.");
            }
        }
        sc.close(); // Fecha o Scanner
    }
}