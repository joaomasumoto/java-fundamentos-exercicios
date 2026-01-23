package masumoto.joao.study.student.v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName;
        int studentAge;
        int studentClass;
        int totalClasses;

        System.out.println("===========STUDENT SIGN UP===========");
        System.out.print("Name: ");
        studentName = sc.nextLine();
        System.out.print("Age: ");
        studentAge = sc.nextInt();
        System.out.print("Class: ");
        studentClass = sc.nextInt();
        System.out.print("Number of classes: ");
        totalClasses = sc.nextInt();


        System.out.printf("""
                ==========STUDENT REGISTERED=============
                Name: %s
                Age: %d
                Class: %dº grade
                =========================================
                """, studentName, studentAge, studentClass);

        System.out.println("==========STUDENT DATA=============");

        System.out.print("Grade 1: ");
        double grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        double grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        double grade3 = sc.nextDouble();
        System.out.print("Number of absences: ");
        int studentAbsences = sc.nextInt();


        double average = averageCalculator(grade1, grade2, grade3);

        System.out.printf("""
                Student %s
                Average grade: %.2f
                """, studentName, average);

        ageBasedAccessControl(studentAge);

        absencesCalculator(totalClasses, studentAbsences);

        sc.close();

    }

    public static double averageCalculator(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    public static void ageBasedAccessControl(int age) {
        if (age < 18) {
            System.out.println("Access denied. Age under 18y.");
            return;
        }
        System.out.println("Access granted. Age over 18y");
    }

    public static void absencesCalculator(int totalClasses, int studentAbsences) {
        String isRegular;
        double frequency = 100 - (((double) studentAbsences /totalClasses)*100);

        if (frequency>=0.75) {
            isRegular = "The student has satisfactory attendance.";
        } else {
            isRegular = "The student does not meet the attendance requirement. Attendance is below 75%.";
        }
        System.out.printf("""
                Student frequency percentage: %.2f%%
                %s
                """, frequency, isRegular);
    }
}
