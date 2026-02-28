import java.util.List;

class SolutionTest {
    public static void main(String[] args) {
        TreeNode raiz = new TreeNode(3);
        raiz.left = new TreeNode(9);
        raiz.right = new TreeNode(20);
        raiz.right.left = new TreeNode(15);
        raiz.right.right = new TreeNode(7);

        List<List<Integer>> esperado = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );
        List<List<Integer>> resultado = new Solution().levelOrder(raiz);

        if (!resultado.equals(esperado)) {
            throw new AssertionError("A arvore nao foi percorrida por nivel corretamente");
        }

        System.out.println("Testes de Binary Tree Level Order passaram.");
    }
}
