import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //maioridade

        Scanner sc = new Scanner(System.in);

        System.out.println("VERIFICADOR MAIORIDADE");
        System.out.print("Insira a idade a ser testada: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.print("É maior de idade. Já pode ser preso hein???");
        } else {
            System.out.print("Menor de idade, seja responsável!");
        }

        sc.close();
    }
}
