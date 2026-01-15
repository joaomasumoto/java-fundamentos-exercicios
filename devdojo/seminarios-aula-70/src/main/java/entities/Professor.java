package entities;

public class Professor {
    private String name;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String name, String especialidade, Seminario[] seminario) {
        this.name = name;
        this.especialidade = especialidade;
        this.seminarios = seminario;
    }

    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("----------------------");
        System.out.println("Professor: " + this.name);
        System.out.println("Especialidade: " + this.especialidade);

        System.out.println("Seminários cadastrados: ");
            for (Seminario seminario : seminarios) {
                System.out.println("Seminário: " + seminario.getTitle());
                System.out.println("Endereco: " + seminario.getLocal().getLocal());
                System.out.println("##ALUNOS##");
                for (Aluno aluno : seminario.getAlunos()) {
                    System.out.printf("Nome: %s, Idade: %d anos%n", aluno.getName(), aluno.getIdade());
                }
            }
            System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
