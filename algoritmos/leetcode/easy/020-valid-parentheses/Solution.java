import java.util.Stack;

/*
 * LeetCode 20. Valid Parentheses
 * Dificuldade: Easy
 * Link: https://leetcode.com/problems/valid-parentheses/
 * Tempo: O(n) | Espaco: O(n)
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> abertos = new Stack<>();

        for (char caractere : s.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                abertos.push(caractere);
                continue;
            }

            if (abertos.isEmpty()) {
                return false;
            }

            char ultimoAberto = abertos.pop();
            if (caractere == ')' && ultimoAberto != '(') {
                return false;
            }
            if (caractere == ']' && ultimoAberto != '[') {
                return false;
            }
            if (caractere == '}' && ultimoAberto != '{') {
                return false;
            }
        }

        return abertos.isEmpty();
    }
}
