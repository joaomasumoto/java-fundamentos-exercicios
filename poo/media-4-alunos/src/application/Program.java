/**
 * Objetivo Geral:
 * Este programa é uma calculadora de média orientada a objetos que solicita as notas de um aluno,
 * calcula a média e determina se o aluno foi aprovado ou reprovado.
 *
 * Conceitos Aplicados:
 * - Programação Orientada a Objetos (POO) com uso de classes e métodos.
 * - Encapsulamento para organizar dados e lógicas relacionadas.
 * - Validação de entrada de dados para garantir notas dentro do intervalo permitido (0 a 10).
 * - Uso da classe Scanner para capturar entrada do usuário de forma interativa.
 */

package application;

import entities.Aluno;
import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Configura o formato para números com ponto decimal (padrão dos EUA)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("----------CALCULADORA DE MEDIA------------");

        // Solicita ao usuário o nome e as notas do aluno
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Nota P1: ");
        Double n1 = sc.nextDouble();
        System.out.print("Nota P2: ");
        Double n2 = sc.nextDouble();
        System.out.print("Nota P3: ");
        Double n3 = sc.nextDouble();
        System.out.print("Nota P4: ");
        Double n4 = sc.nextDouble();

        // Instancia a classe responsável pelo cálculo
        Calculator calculator = new Calculator();

        // Cria um objeto Aluno com os dados fornecidos
        Aluno aluno1 = new Aluno(nome, n1, n2, n3, n4, calculator);

        // Valida as notas e exibe os resultados
        calculator.validacao(aluno1);

        sc.close(); // Fecha o scanner para liberar recursos
    }
}