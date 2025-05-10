import java.util.Scanner;

public class Program {
    //tabuada

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("TABUADA\n Selecione a tabuada desejada: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = i * num;
            System.out.printf("%d x %d = %d\n", num, i, result);        }


        sc.close();

    }
}
