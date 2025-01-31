package exercicio6.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
 * Objetivo Geral:
 * Este programa valida uma data fornecida pelo usuário e informa se ela está no passado, presente ou futuro.
 *
 * Conceitos Aplicados:
 * - Validação de Datas: Garante que a entrada está no formato correto (`yyyy-MM-dd`).
 * - Comparação de Datas: Determinação da relação temporal entre a data fornecida e a data atual.
 * - Tratamento de Exceções: Uso de `try-catch` para lidar com erros de formatação.
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter validate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");

        try {
            LocalDate date = LocalDate.parse(sc.nextLine(), validate);
            System.out.println("A data é válida.");

            LocalDate today = LocalDate.now();

            if (date.isAfter(today)) {
                System.out.println("A data está no futuro.");
            } else if (date.isBefore(today)) {
                System.out.println("A data está no passado.");
            } else {
                System.out.println("A data é hoje!");
            }
        } catch (DateTimeParseException e) {
            System.out.println("A data é inválida. Por favor utilize o formato yyyy-MM-dd");
        } finally {
            sc.close();
        }
    }
}