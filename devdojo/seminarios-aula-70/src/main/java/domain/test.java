package domain;

import entities.Aluno;
import entities.Local;
import entities.Professor;
import entities.Seminario;

public class test {
    public static void main(String[] args) {

        Local local = new Local("Ramos Lopes");

        Aluno aluno1 = new Aluno("Joao", 26);
        Aluno aluno2 = new Aluno("Bruno", 27);

        Professor professor1 = new Professor("Chagas", "Social Studies");
        Professor professor2 = new Professor("Marlene", "Math");

        Aluno[] classeSeminario1 = {aluno1, aluno2};

        Seminario seminario1 = new Seminario("Arte das trevas", local, classeSeminario1);


        Seminario[] seminariosProfessor1 = {seminario1};
        professor1.setSeminarios(seminariosProfessor1);

        try {
            professor1.imprime();
        } catch (Exception e) {
            System.out.println("Nenhum seminário cadastrado para o professor em questão.");
        }

        try {
            professor2.imprime();
        } catch (Exception e) {
            System.out.println("Nenhum seminário cadastrado para o professor em questão.");
        }

    }
}
