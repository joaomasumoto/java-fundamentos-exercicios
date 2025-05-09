import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivinhe o número de 1 a 10!");
        int num = (int)(Math.random() * 10) + 1;
        System.out.print("Insira o seu palpite: ");
        int palpite = sc.nextInt();

        while (palpite != num) {
            System.out.printf("Pensando...\nComparando com o oráculo...\nAjustando padrões...\nPADRÃO ANALISADO\n");
            System.out.println("Palpite incorreto. Tente novamente.");
            System.out.print("Insira o seu palpite: ");
            palpite = sc.nextInt();
        }

        System.out.printf("Pensando...\nComparando com o oráculo...\nAjustando padrões...\nPADRÃO ANALISADO\nEita...\n");
        System.out.println("ACERTOU!!!");

        sc.close();
    }
}
