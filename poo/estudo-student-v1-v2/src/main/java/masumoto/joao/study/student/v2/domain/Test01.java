package masumoto.joao.study.student.v2.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> students = new ArrayList<>();
        students.add("Naruto");
        students.add("Sasuke");
        students.add("Sakura");
        students.add("Kakashi");
        students.add("Sai");

        System.out.println(students);

        System.out.print("SEARCH BY NAME: ");
        String nameSearch = sc.nextLine();
        isNameInList(students.contains(nameSearch));


        sc.close();
    }

    public static void isNameInList(boolean exists) {
        if (exists) {
            System.out.println("List 'Students' contains this name.");
            return;
        }
        System.out.println("Name not found.");
    }




}
