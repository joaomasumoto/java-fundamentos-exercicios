package application;

import entities.Person;

import java.util.Scanner;

public class Program {
    /**
     * Objetivo Geral:
     * Verificar se uma pessoa é maior de idade com base na idade fornecida.
     *
     * Conceitos Aplicados:
     * - Encapsulamento para gerenciar os dados e a lógica na classe `Person`.
     * - Entrada do usuário para capturar informações como nome e idade.
     * - Validação da idade para determinar a maioridade legal.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("IS LEGAL AGE?");

        // Solicita o nome do usuário
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        // Solicita a idade do usuário
        System.out.print("How old are you? ");
        int age = sc.nextInt();

        // Cria um objeto Person com os dados fornecidos
        Person person = new Person(name, age);

        // Verifica se a pessoa é maior de idade
        if (person.isLegalAge()) {
            System.out.printf("%s is of legal age.%n", person.getName());
        } else {
            System.out.printf("%s isn't of legal age.%n", person.getName());
        }

        sc.close(); // Fecha o Scanner
    }
}
