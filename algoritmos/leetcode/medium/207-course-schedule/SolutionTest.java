class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        if (!solution.canFinish(2, new int[][]{{1, 0}})) {
            throw new AssertionError("Uma dependencia simples deveria ser possivel");
        }
        if (solution.canFinish(2, new int[][]{{1, 0}, {0, 1}})) {
            throw new AssertionError("Uma dependencia circular deveria ser impossivel");
        }

        System.out.println("Testes de Course Schedule passaram.");
    }
}
