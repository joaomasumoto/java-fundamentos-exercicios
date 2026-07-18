import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LeetCode 146. LRU Cache
 * Dificuldade: Medium
 * Link: https://leetcode.com/problems/lru-cache/
 * Tempo: O(1) por operacao | Espaco: O(capacidade)
 */
class LRUCache {
    private final int capacidade;
    private final Map<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacidade = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);

        if (cache.size() > capacidade) {
            Integer chaveMaisAntiga = cache.keySet().iterator().next();
            cache.remove(chaveMaisAntiga);
        }
    }
}
