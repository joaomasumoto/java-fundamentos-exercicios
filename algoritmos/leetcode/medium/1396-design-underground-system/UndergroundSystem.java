import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1396. Design Underground System
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/design-underground-system/
 * Tempo: O(1) por operacao | Espaco: O(n)
 */
class UndergroundSystem {
    private final Map<Integer, CheckIn> entradas = new HashMap<>();
    private final Map<String, RouteStats> viagens = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        entradas.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn entrada = entradas.remove(id);
        String rota = entrada.estacao + "->" + stationName;
        int duracao = t - entrada.horario;

        viagens.putIfAbsent(rota, new RouteStats());
        RouteStats estatisticas = viagens.get(rota);
        estatisticas.tempoTotal += duracao;
        estatisticas.quantidade++;
    }

    public double getAverageTime(String startStation, String endStation) {
        String rota = startStation + "->" + endStation;
        RouteStats estatisticas = viagens.get(rota);
        return (double) estatisticas.tempoTotal / estatisticas.quantidade;
    }

    private static class CheckIn {
        private final String estacao;
        private final int horario;

        private CheckIn(String estacao, int horario) {
            this.estacao = estacao;
            this.horario = horario;
        }
    }

    private static class RouteStats {
        private int tempoTotal;
        private int quantidade;
    }
}
