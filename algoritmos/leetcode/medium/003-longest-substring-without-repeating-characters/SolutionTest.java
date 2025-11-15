class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        testar(solution.lengthOfLongestSubstring("abcabcbb"), 3);
        testar(solution.lengthOfLongestSubstring("bbbbb"), 1);
        testar(solution.lengthOfLongestSubstring("pwwkew"), 3);
        testar(solution.lengthOfLongestSubstring(""), 0);

        System.out.println("Testes de Longest Substring passaram.");
    }

    private static void testar(int recebido, int esperado) {
        if (recebido != esperado) {
            throw new AssertionError("Esperado: " + esperado + ", recebido: " + recebido);
        }
    }
}
