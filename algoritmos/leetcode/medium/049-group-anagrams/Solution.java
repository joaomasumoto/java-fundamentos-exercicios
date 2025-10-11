import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 49. Group Anagrams
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/group-anagrams/
 * Tempo: O(n * k log k) | Espaco: O(n * k)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grupos = new HashMap<>();

        for (String palavra : strs) {
            char[] letras = palavra.toCharArray();
            Arrays.sort(letras);
            String chave = new String(letras);

            grupos.putIfAbsent(chave, new ArrayList<>());
            grupos.get(chave).add(palavra);
        }

        return new ArrayList<>(grupos.values());
    }
}
