import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Ler 5 nomes e imprimir na ordem inversa

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i<nomes.length; i++) {
            System.out.printf("Nome %02d: ", i+1);
            nomes[i] = sc.nextLine();
        }

        System.out.println();
        System.out.println("Lista recebida: " + Arrays.toString(nomes));
        System.out.println();

        for (int i = nomes.length - 1; i>=0; i--) {
            System.out.printf("Nome %02d: %s%n", i+1, nomes[i]);
        }

    sc.close();
    }
}
