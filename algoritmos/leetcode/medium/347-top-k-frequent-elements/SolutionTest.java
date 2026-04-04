import java.util.Arrays;

class SolutionTest {
    public static void main(String[] args) {
        int[] resultado = new Solution().topKFrequent(
                new int[]{1, 1, 1, 2, 2, 3},
                2
        );
        Arrays.sort(resultado);

        if (!Arrays.equals(resultado, new int[]{1, 2})) {
            throw new AssertionError("Os elementos mais frequentes estao incorretos");
        }

        System.out.println("Testes de Top K Frequent Elements passaram.");
    }
}
