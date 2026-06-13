class UndergroundSystemTest {
    public static void main(String[] args) {
        UndergroundSystem sistema = new UndergroundSystem();

        sistema.checkIn(1, "A", 3);
        sistema.checkOut(1, "B", 8);
        sistema.checkIn(2, "A", 10);
        sistema.checkOut(2, "B", 17);

        double media = sistema.getAverageTime("A", "B");
        if (Math.abs(media - 6.0) > 0.0001) {
            throw new AssertionError("Esperado: 6.0, recebido: " + media);
        }

        System.out.println("Testes de Design Underground System passaram.");
    }
}
