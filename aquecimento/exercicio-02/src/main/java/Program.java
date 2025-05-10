import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double IMC;

        System.out.printf("CALCULADORA DE IMC\n Qual o seu Peso (kg)? ");
        double peso = sc.nextDouble();

        System.out.print("Qual a sua altura (m)? ");
        double altura = sc.nextDouble();

        IMC = peso / Math.pow(altura, 2);

        if (IMC <18.5) {
            System.out.println("Abaixo do peso.");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal.");
        } else if (25 <= IMC && IMC <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (30 <= IMC && IMC <= 34.9) {
            System.out.println("Obesidade grau 1.");
        } else if (35 <= IMC && IMC <= 39.9) {
            System.out.println("Obesidade grau 2.");
        } else {
            System.out.println("Obesidade grau 3 (mórbida)");
        }

        sc.close();
    }
}
