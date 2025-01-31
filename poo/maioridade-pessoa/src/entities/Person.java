package entities;

/**
 * Classe Person:
 * Representa uma pessoa com nome e idade e permite verificar se é maior de idade.
 */
public class Person {
    private String name;
    private int age;

    // Construtor que inicializa os atributos da pessoa
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Setter para o nome
    public void setName(String name) {
        this.name = name;
    }

    // Getter para a idade
    public Integer getAge() {
        return age;
    }

    // Setter para a idade
    public void setAge(int age) {
        this.age = age;
    }

    // Metodo para verificar se a pessoa é maior de idade
    public boolean isLegalAge() {
        return this.age >= 18;
    }
}
