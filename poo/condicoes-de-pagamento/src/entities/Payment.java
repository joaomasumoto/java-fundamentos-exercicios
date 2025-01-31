package entities;

// Classe que encapsula as operações relacionadas ao pagamento
public class Payment {
    private PaymentMethod method;

    // Construtor para inicializar o metodo de pagamento
    public Payment(PaymentMethod method) {
        this.method = method;
    }

    // Getter e setter para o metodo de pagamento
    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    // Calcula o valor final do produto com base no metodo de pagamento escolhido
    public Double finalPrice(Double price) {
        return this.method.calculatePrice(price);
    }
}