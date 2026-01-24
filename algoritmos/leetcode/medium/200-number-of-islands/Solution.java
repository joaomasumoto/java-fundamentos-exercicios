/*
 * LeetCode 200. Number of Islands
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/number-of-islands/
 * Tempo: O(linhas * colunas) | Espaco: O(linhas * colunas)
 */
class Solution {
    public int numIslands(char[][] grid) {
        int quantidade = 0;

        for (int linha = 0; linha < grid.length; linha++) {
            for (int coluna = 0; coluna < grid[linha].length; coluna++) {
                if (grid[linha][coluna] == '1') {
                    quantidade++;
                    marcarTerraVisitada(grid, linha, coluna);
                }
            }
        }

        return quantidade;
    }

    private void marcarTerraVisitada(char[][] grid, int linha, int coluna) {
        if (linha < 0 || linha >= grid.length
                || coluna < 0 || coluna >= grid[linha].length
                || grid[linha][coluna] != '1') {
            return;
        }

        grid[linha][coluna] = '0';
        marcarTerraVisitada(grid, linha - 1, coluna);
        marcarTerraVisitada(grid, linha + 1, coluna);
        marcarTerraVisitada(grid, linha, coluna - 1);
        marcarTerraVisitada(grid, linha, coluna + 1);
    }
}
