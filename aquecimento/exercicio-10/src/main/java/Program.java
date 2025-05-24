import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Contar quantos alunos passaram (nota ≥ 6)
        //
        //Extra: Criar array de objetos Aluno com nome e nota

        Scanner sc = new Scanner(System.in);
        final double MEDIA_PARA_PASSAR = 6.0;

        int alunosQnt = lerIntValido(sc, "Nº de alunos: ");

        List<Double> notas = new ArrayList<>();

        int numPassaram = 0;

        for (int i = 0; i < alunosQnt; i++) {
            double nota = lerDoubleValido(sc, "Nota aluno " + (i + 1) + ": ");
            if (nota >= MEDIA_PARA_PASSAR) {
                numPassaram += 1;
            }
        }

        System.out.printf("%d alunos tiveram nota maior que %s.", numPassaram, MEDIA_PARA_PASSAR);

        sc.close();

    }

    static int lerIntValido(Scanner sc, String prompt) {
        boolean numValido = false;
        int valor = 0;
        while (!numValido) {
            System.out.print(prompt);
            try {
                valor = sc.nextInt();
                sc.nextLine();
                numValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número inteiro válido.");
                sc.nextLine();
            }
        }
        return valor;
    }

    static double lerDoubleValido(Scanner sc, String prompt) {
        boolean numValido = false;
        double nota = 0;
        while (!numValido) {
            System.out.print(prompt);
            try {
                String entrada = sc.nextLine().replace(',', '.');
                nota = Double.parseDouble(entrada);
                numValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Insira uma nota válida.");
                sc.nextLine();
            }
        }
        return nota;
    }
}
