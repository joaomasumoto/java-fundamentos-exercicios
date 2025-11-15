import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 3. Longest Substring Without Repeating Characters
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Tempo: O(n) | Espaco: O(n)
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> caracteres = new HashSet<>();
        int inicio = 0;
        int maiorTamanho = 0;

        for (int fim = 0; fim < s.length(); fim++) {
            char atual = s.charAt(fim);

            while (caracteres.contains(atual)) {
                caracteres.remove(s.charAt(inicio));
                inicio++;
            }

            caracteres.add(atual);
            maiorTamanho = Math.max(maiorTamanho, fim - inicio + 1);
        }

        return maiorTamanho;
    }
}
