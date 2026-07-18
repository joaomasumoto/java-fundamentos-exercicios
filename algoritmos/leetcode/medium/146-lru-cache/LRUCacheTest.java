class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        testar(cache.get(1), 1);
        cache.put(3, 3);
        testar(cache.get(2), -1);
        cache.put(4, 4);
        testar(cache.get(1), -1);
        testar(cache.get(3), 3);
        testar(cache.get(4), 4);

        System.out.println("Testes de LRU Cache passaram.");
    }

    private static void testar(int recebido, int esperado) {
        if (recebido != esperado) {
            throw new AssertionError("Esperado: " + esperado + ", recebido: " + recebido);
        }
    }
}
