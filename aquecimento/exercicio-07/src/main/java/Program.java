import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Contagem regressiva

        Scanner sc = new Scanner(System.in);

        System.out.print("Selecione o numero para a contagem: ");
        int num = sc.nextInt();

        while (num >= 0) {
            System.out.println(num);
            num = num - 1;
        }

        System.out.println();

        sc.close();
    }
}
