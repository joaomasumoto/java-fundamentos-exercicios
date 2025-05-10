import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //PAR OU IMPAR

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.printf("É par ou impar? \nEscolha um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("É PAR!");
        } else {
            System.out.println("É IMPAR");
        }


        sc.close();

    }
}
