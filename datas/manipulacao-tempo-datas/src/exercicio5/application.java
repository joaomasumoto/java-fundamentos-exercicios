package exercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Objetivo Geral:
 * Este programa exibe o dia, mês e ano de uma data fornecida no formato `dd/MM/yyyy`.
 *
 * Conceitos Aplicados:
 * - Formatação de Datas: Uso de `DateTimeFormatter` para interpretar e exibir datas.
 * - Manipulação de Datas: Extração de partes individuais (dia, mês, ano).
 * - Entrada do Usuário: Leitura de uma data formatada.
 */
public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (dd/MM/yyyy): ");
        String dateString = sc.nextLine();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString, pattern);

        System.out.printf("Day: %d, Month: %d, Year: %d.", date.getDayOfMonth(), date.getMonthValue(), date.getYear());

        sc.close();
    }
}