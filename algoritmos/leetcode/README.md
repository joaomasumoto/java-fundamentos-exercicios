# LeetCode em Java

Trilha de exercicios escolhida para praticar estruturas de dados e algoritmos importantes para desenvolvimento back-end. As solucoes priorizam codigo direto, nomes claros e recursos conhecidos da linguagem.

## Ordem sugerida

| Ordem | Exercicio | Nivel | Tema | Complexidade de tempo |
| --- | --- | --- | --- | --- |
| 1 | [20. Valid Parentheses](easy/020-valid-parentheses) | Easy | Pilha | O(n) |
| 2 | [49. Group Anagrams](medium/049-group-anagrams) | Medium | HashMap e ordenacao | O(n * k log k) |
| 3 | [3. Longest Substring Without Repeating Characters](medium/003-longest-substring-without-repeating-characters) | Medium | Janela deslizante | O(n) |
| 4 | [56. Merge Intervals](medium/056-merge-intervals) | Medium | Ordenacao e intervalos | O(n log n) |
| 5 | [200. Number of Islands](medium/200-number-of-islands) | Medium | Matriz e DFS | O(linhas * colunas) |
| 6 | [102. Binary Tree Level Order Traversal](medium/102-binary-tree-level-order-traversal) | Medium | Arvore e BFS | O(n) |
| 7 | [347. Top K Frequent Elements](medium/347-top-k-frequent-elements) | Medium | HashMap e fila de prioridade | O(n log n) |
| 8 | [207. Course Schedule](medium/207-course-schedule) | Medium | Grafo e dependencias | O(cursos + dependencias) |
| 9 | [1396. Design Underground System](medium/1396-design-underground-system) | Medium | Modelagem e HashMap | O(1) por operacao |
| 10 | [146. LRU Cache](medium/146-lru-cache) | Medium | Cache e LinkedHashMap | O(1) por operacao |

## Exercicios anteriores

- [1. Two Sum](easy/001-two-sum)
- [9. Palindrome Number](easy/009-palindrome-number)
- [231. Power of Two](easy/231-power-of-two)

## Como testar

Cada pasta nova possui a solucao aceita pelo formato do LeetCode e um teste simples executavel. Exemplo:

```bash
cd algoritmos/leetcode/easy/020-valid-parentheses
javac Solution.java SolutionTest.java
java SolutionTest
```

No exercicio de arvore, inclua tambem `TreeNode.java` na compilacao local. A plataforma LeetCode ja fornece essa classe durante a submissao.
