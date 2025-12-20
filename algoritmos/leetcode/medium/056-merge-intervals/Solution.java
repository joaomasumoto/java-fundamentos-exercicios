import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 56. Merge Intervals
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/merge-intervals/
 * Tempo: O(n log n) | Espaco: O(n)
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> resultado = new ArrayList<>();

        int[] intervaloAtual = intervals[0];
        resultado.add(intervaloAtual);

        for (int i = 1; i < intervals.length; i++) {
            int[] proximo = intervals[i];

            if (proximo[0] <= intervaloAtual[1]) {
                intervaloAtual[1] = Math.max(intervaloAtual[1], proximo[1]);
            } else {
                intervaloAtual = proximo;
                resultado.add(intervaloAtual);
            }
        }

        return resultado.toArray(new int[resultado.size()][]);
    }
}
