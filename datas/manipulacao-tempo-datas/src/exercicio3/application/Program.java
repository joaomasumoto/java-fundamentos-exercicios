package exercicio3.application;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
 * Objetivo Geral:
 * Este programa calcula a diferença em anos, meses e dias entre duas datas fornecidas pelo usuário.
 *
 * Conceitos Aplicados:
 * - Manipulação de Datas: Uso da API `java.time` para calcular diferenças entre datas.
 * - Entrada do Usuário: Leitura de duas datas no formato `yyyy-MM-dd`.
 * - Impressão Formatada: Exibição clara e organizada do resultado.
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        int years = Period.between(date1, date2).getYears();
        int months = Period.between(date1, date2).getMonths();
        int days = Period.between(date1, date2).getDays();

        System.out.printf("The difference between them is %d years, %d months and %d days.", years, months, days);

        sc.close();
    }
}