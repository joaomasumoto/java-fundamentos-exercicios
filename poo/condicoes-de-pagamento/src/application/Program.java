/**
 * Objetivo Geral:
 * Este programa implementa um sistema de pagamento que calcula o valor final de um produto
 * baseado no metodo de pagamento escolhido pelo usuario. Os valores podem incluir descontos
 * ou juros dependendo da opcao selecionada.
 *
 * Conceitos Aplicados:
 * - Enumerações para representar os métodos de pagamento.
 * - Polimorfismo para sobrescrever comportamentos específicos dos métodos de pagamento.
 * - Encapsulamento para isolar a lógica do pagamento em classes distintas.
 * - Validação de entrada do usuário para garantir opções válidas.
 * - Orientação a Objetos com separação de responsabilidades.
 */

package application;

import entities.Payment;
import entities.PaymentMethod;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Define o padrão de localidade para números (formatação com ponto decimal)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-------PAGAMENTO--------");

        // Solicita ao usuário o valor do produto
        System.out.print("Valor do produto em R$: ");
        Double price = sc.nextDouble();
        System.out.println();

        // Exibe as opções de método de pagamento
        System.out.print("1 - À Vista em Dinheiro ou Pix (15% de desconto);\n" +
                "2 - À Vista no cartão de crédito (10% de desconto);\n" +
                "3 - Parcelado no cartão em duas vezes (sem juros);\n" +
                "4 - Parcelado no cartão em três vezes ou mais (10% de juros);\n" +
                "\n" +
                "Código do método de pagamento escolhido (1 a 4): ");

        // Lê a escolha do usuário
        Integer paymentCode = sc.nextInt();
        PaymentMethod paymentMethod = null;

        // Define o metodo de pagamento com base na escolha do usuário
        switch (paymentCode) {
            case 1:
                paymentMethod = PaymentMethod.CASH_OR_PIX;
                break;
            case 2:
                paymentMethod = PaymentMethod.CREDIT_CARD;
                break;
            case 3:
                paymentMethod = PaymentMethod.TWO_INSTALLMENTS;
                break;
            case 4:
                paymentMethod = PaymentMethod.THREE_OR_MORE_INSTALLMENTS;
                break;
            default:
                // Mensagem de erro para código inválido
                System.out.println("Código de pagamento inválido.");
                sc.close();
                return;
        }

        // Cria um objeto Payment com o metodo escolhido
        Payment payment = new Payment(paymentMethod);

        // Calcula o preço final com base no metodo de pagamento
        Double finalPrice = payment.finalPrice(price);

        // Exibe o preço final se válido
        if (finalPrice != null) {
            System.out.printf("Valor final a ser pago: R$ %.2f%n", finalPrice);
        }

        // Fecha o scanner
        sc.close();
    }
}