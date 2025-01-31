package exercicio1.application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Objetivo Geral:
 * Este programa exibe a data e a hora atual no formato personalizado, utilizando formatação com padrões específicos.
 *
 * Conceitos Aplicados:
 * - API `java.time`: Manipulação de datas (`LocalDate`) e horários (`LocalTime`) atuais.
 * - Formatação de Data e Hora: Uso de `DateTimeFormatter` para personalizar a saída.
 * - Exibição Formatada: Impressão da data e hora no console com formatos específicos.
 */
public class Program {
    public static void main(String[] args) {

        // Define um formato personalizado para exibir a data
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Define um formato personalizado para exibir o horário
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Obtém a data atual e exibe formatada
        LocalDate date = LocalDate.now();
        System.out.println("Data atual: " + date.format(dateFormatter));

        // Obtém o horário atual e exibe formatado
        LocalTime time = LocalTime.now();
        System.out.println("Hora atual: " + time.format(timeFormatter));
    }
}