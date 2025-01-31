package exercicio2.application;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * Objetivo Geral:
 * Este programa permite adicionar dias, meses e anos a uma data fornecida pelo usuário.
 *
 * Conceitos Aplicados:
 * - Manipulação de Datas: Uso de métodos `plusDays`, `plusMonths` e `plusYears` para modificar datas.
 * - Entrada do Usuário: Leitura de uma data e os valores a serem adicionados.
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Date (in format yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("1. How many days do you want to add? ");
        int plusDays = sc.nextInt();

        System.out.print("2. How many months do you want to add? ");
        int plusMonths = sc.nextInt();

        System.out.print("3. How many years do you want to add? ");
        int plusYears = sc.nextInt();

        System.out.print("The new date is " + date.plusDays(plusDays).plusMonths(plusMonths).plusYears(plusYears));

        sc.close();
    }
}