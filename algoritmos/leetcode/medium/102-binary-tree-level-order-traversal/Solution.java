import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * LeetCode 102. Binary Tree Level Order Traversal
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Tempo: O(n) | Espaco: O(n)
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultado = new ArrayList<>();

        if (root == null) {
            return resultado;
        }

        Queue<TreeNode> fila = new LinkedList<>();
        fila.add(root);

        while (!fila.isEmpty()) {
            int quantidadeNoNivel = fila.size();
            List<Integer> nivelAtual = new ArrayList<>();

            for (int i = 0; i < quantidadeNoNivel; i++) {
                TreeNode no = fila.remove();
                nivelAtual.add(no.val);

                if (no.left != null) {
                    fila.add(no.left);
                }
                if (no.right != null) {
                    fila.add(no.right);
                }
            }

            resultado.add(nivelAtual);
        }

        return resultado;
    }
}
