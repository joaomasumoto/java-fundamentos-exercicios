import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da variável A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor da variavel B: ");
        double b = sc.nextDouble();

        double temp = a;
        a = b;
        b = temp;

        System.out.printf("A agora é: %.2f e B agora é: %.2f%n ", a, b);

        sc.close();

    }
}
