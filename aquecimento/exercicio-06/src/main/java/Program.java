import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de soma números pares até.");
        System.out.print("Qual o número limite? ");
        int limite = sc.nextInt();
        System.out.println("Resultado: " + soma(limite));
        System.out.println("FIM.");

        sc.close();

    }

    public static int soma(int limite) {
        int soma = 0;

        for (int i = 1; i < limite; i++) {
            if (i%2 == 0) {
                soma += i;
            }
        }
        return soma;
    }

}
