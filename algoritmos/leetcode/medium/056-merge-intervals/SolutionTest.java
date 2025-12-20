import java.util.Arrays;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] entrada = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] esperado = {{1, 6}, {8, 10}, {15, 18}};
        int[][] resultado = solution.merge(entrada);

        if (!Arrays.deepEquals(resultado, esperado)) {
            throw new AssertionError("Intervalos nao foram unidos corretamente");
        }

        System.out.println("Testes de Merge Intervals passaram.");
    }
}
