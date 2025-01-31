// Classe Calculator para lógica de cálculo e validação
package entities;

public class Calculator {

    // Metodo para calcular a média de um aluno
    public Double calcularMedia(Aluno aluno) {
        // Soma as quatro notas do aluno e calcula a média
        return (aluno.getN1() + aluno.getN2() + aluno.getN3() + aluno.getN4()) / 4;
    }

    // Metodo para validar as notas e exibir o resultado
    public void validacao(Aluno aluno) {
        // Verifica se todas as notas estão no intervalo válido (0 a 10)
        if (aluno.getN1() < 0 || aluno.getN1() > 10 || aluno.getN2() < 0 || aluno.getN2() > 10 ||
                aluno.getN3() < 0 || aluno.getN3() > 10 || aluno.getN4() < 0 || aluno.getN4() > 10) {
            System.out.println("Erro: Todas as notas devem estar entre 0 e 10.");
            return; // Encerra o metodo se as notas forem inválidas
        }

        // Exibe o nome do aluno, a média calculada e o resultado final
        System.out.printf("A média do aluno %s é: %.2f%n", aluno.getNome(), aluno.getMedia());
        System.out.println(resultadoFinal(aluno.getMedia()));
    }

    // Metodo para determinar o resultado final com base na média
    public String resultadoFinal(Double media) {
        // Retorna "Aprovado" se a média é maior ou igual a 7; caso contrário, "Reprovado"
        return media >= 7 ? "Parabéns! Você foi aprovado!" : "Você foi reprovado.";
    }
}