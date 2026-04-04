import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * LeetCode 347. Top K Frequent Elements
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 * Tempo: O(n log n) | Espaco: O(n)
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencias = new HashMap<>();

        for (int numero : nums) {
            frequencias.put(numero, frequencias.getOrDefault(numero, 0) + 1);
        }

        PriorityQueue<Integer> fila = new PriorityQueue<>(
                (a, b) -> Integer.compare(frequencias.get(b), frequencias.get(a))
        );
        fila.addAll(frequencias.keySet());

        int[] resultado = new int[k];
        for (int i = 0; i < k; i++) {
            resultado[i] = fila.remove();
        }

        return resultado;
    }
}
