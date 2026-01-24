class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] mapa = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int resultado = solution.numIslands(mapa);
        if (resultado != 3) {
            throw new AssertionError("Esperado: 3, recebido: " + resultado);
        }

        System.out.println("Testes de Number of Islands passaram.");
    }
}
