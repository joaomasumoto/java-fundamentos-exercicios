import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] palavras = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> resultado = solution.groupAnagrams(palavras);

        Set<Set<String>> grupos = new HashSet<>();
        for (List<String> grupo : resultado) {
            grupos.add(new HashSet<>(grupo));
        }

        if (grupos.size() != 3
                || !grupos.contains(Set.of("eat", "tea", "ate"))
                || !grupos.contains(Set.of("tan", "nat"))
                || !grupos.contains(Set.of("bat"))) {
            throw new AssertionError("Os anagramas nao foram agrupados corretamente");
        }

        System.out.println("Testes de Group Anagrams passaram.");
    }
}
