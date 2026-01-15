package entities;

public class Seminario {
    private String title;
    private Local local;
    private Aluno[] alunos;


    public Seminario(String title, Local local, Aluno[] alunos) {
        this.title = title;
        this.local = local;
        this.alunos = alunos;
    }

    public Seminario(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
