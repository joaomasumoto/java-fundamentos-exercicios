class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        if (!solution.isValid("()[]{}")) {
            throw new AssertionError("Pares validos deveriam retornar true");
        }
        if (solution.isValid("([)]")) {
            throw new AssertionError("Ordem incorreta deveria retornar false");
        }
        if (solution.isValid("(")) {
            throw new AssertionError("Par incompleto deveria retornar false");
        }

        System.out.println("Testes de Valid Parentheses passaram.");
    }
}
