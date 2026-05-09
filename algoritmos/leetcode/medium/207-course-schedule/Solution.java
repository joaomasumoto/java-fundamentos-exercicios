import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * LeetCode 207. Course Schedule
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/course-schedule/
 * Tempo: O(cursos + dependencias) | Espaco: O(cursos + dependencias)
 */
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> grafo = new ArrayList<>();
        int[] quantidadeDePreRequisitos = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            grafo.add(new ArrayList<>());
        }

        for (int[] requisito : prerequisites) {
            int curso = requisito[0];
            int preRequisito = requisito[1];
            grafo.get(preRequisito).add(curso);
            quantidadeDePreRequisitos[curso]++;
        }

        Queue<Integer> fila = new LinkedList<>();
        for (int curso = 0; curso < numCourses; curso++) {
            if (quantidadeDePreRequisitos[curso] == 0) {
                fila.add(curso);
            }
        }

        int cursosConcluidos = 0;
        while (!fila.isEmpty()) {
            int cursoAtual = fila.remove();
            cursosConcluidos++;

            for (int proximoCurso : grafo.get(cursoAtual)) {
                quantidadeDePreRequisitos[proximoCurso]--;
                if (quantidadeDePreRequisitos[proximoCurso] == 0) {
                    fila.add(proximoCurso);
                }
            }
        }

        return cursosConcluidos == numCourses;
    }
}
