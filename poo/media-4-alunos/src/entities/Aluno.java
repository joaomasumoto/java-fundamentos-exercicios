// Classe Aluno para armazenar informações de um aluno
package entities;

public class Aluno {
    private String nome;
    private Double n1;
    private Double n2;
    private Double n3;
    private Double n4;
    private Double media;

    // Construtor da classe que inicializa os atributos e calcula a média
    public Aluno(String nome, Double n1, Double n2, Double n3, Double n4, Calculator calculator) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.media = calculator.calcularMedia(this);
    }

    // Métodos getter e setter para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getN1() {
        return n1;
    }

    public Double getN2() {
        return n2;
    }

    public Double getN3() {
        return n3;
    }

    public Double getN4() {
        return n4;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}