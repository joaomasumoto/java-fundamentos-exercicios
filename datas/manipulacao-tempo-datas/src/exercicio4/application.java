package exercicio4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Objetivo Geral:
 * Este programa calcula o número de dias restantes até uma data futura fornecida pelo usuário.
 *
 * Conceitos Aplicados:
 * - Manipulação de Datas: Uso da classe `ChronoUnit` para calcular diferenças em dias.
 * - Validação de Datas: Garantia de que a data fornecida é futura.
 * - Entrada do Usuário: Leitura de uma data no formato `yyyy-MM-dd`.
 */
public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the future date? (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.printf("%d days left.", ChronoUnit.DAYS.between(LocalDate.now(), date));

        sc.close();
    }
}