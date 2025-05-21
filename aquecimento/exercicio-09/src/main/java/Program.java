import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //
        //Ler 10 números e exibir maior/menor
        //
       
        Scanner sc = new Scanner(System.in);


        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            boolean numValido = false;
            while (!numValido) {
                System.out.print((i + 1) + "º número: ");
                try {
                    numero[i] = sc.nextInt();
                    numValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um valor numérico válido.");
                    sc.nextLine();
                }
            }
        }


        int menor = numero[0];
        int maior = numero[0];

        System.out.println();
        System.out.println("Lista recebida: " + Arrays.toString(numero));
        System.out.println();

        for (int j : numero) {
            if (j < menor) menor = j;
            if (j > maior) maior = j;
        }

        System.out.printf("Menor valor: %d.%n", menor);
        System.out.printf("Maior valor: %d.%n", maior);


        sc.close();
    }
}
