package application;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Este programa calcula o tempo vivido por uma pessoa (anos, meses e dias)
     * com base no ano de nascimento informado, utilizando a API de data e hora
     * do Java.
     *
     * Conceitos Aplicados:
     * - Manipulação de datas com as classes `LocalDate` e `Period`.
     * - Cálculos para converter anos e meses em total aproximado de meses e dias.
     * - Entrada e saída formatada para interação com o usuário.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o ano de nascimento
        System.out.print("Ano de nascimento: ");
        int born = sc.nextInt();

        // Cria uma data representando o primeiro dia do ano de nascimento
        LocalDate bornYear = LocalDate.of(born, 1, 1);
        // Obtém a data atual
        LocalDate now = LocalDate.now();

        // Calcula o período entre a data de nascimento e a data atual
        Period period = Period.between(bornYear, now);

        // Extrai os anos, meses e dias do período calculado
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Calcula o total aproximado de meses e dias vividos
        int totalMonths = (years * 12) + months;
        int totalDays = (totalMonths * 30) + days;

        // Exibe os resultados formatados
        System.out.printf("Você viveu %d anos, %d meses, %d dias.%n", years, months, days);

        sc.close(); // Fecha o Scanner
    }
}