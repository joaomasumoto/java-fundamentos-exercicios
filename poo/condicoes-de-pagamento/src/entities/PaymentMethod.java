package entities;

// Enumeração que representa os metodos de pagamento
public enum PaymentMethod {

    // Pagamento à vista com dinheiro ou Pix (15% de desconto)
    CASH_OR_PIX {
        @Override
        public double calculatePrice(double price) {
            return price * (1 - 0.15);
        }
    },

    // Pagamento à vista no cartão de crédito (10% de desconto)
    CREDIT_CARD {
        @Override
        public double calculatePrice(double price) {
            return price * (1 - 0.1);
        }
    },

    // Pagamento parcelado em duas vezes (sem juros)
    TWO_INSTALLMENTS {
        @Override
        public double calculatePrice(double price) {
            return price;
        }
    },

    // Pagamento parcelado em três vezes ou mais (10% de juros)
    THREE_OR_MORE_INSTALLMENTS {
        @Override
        public double calculatePrice(double price) {
            return price * (1 + 0.1);
        }
    };

    // Metodo abstrato que será implementado por cada metodo de pagamento
    public abstract double calculatePrice(double price);
}