package masumoto.joao.study.student.v2.domain;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costs = 0;


        System.out.println("COSTS SUM CALCULATOR (ENTER 0 TO STOP)");
        double option;
        do {
            System.out.print("Value to add (in US$): ");
            option = sc.nextDouble();
            costs += option;
        } while (!(option == 0));

        System.out.printf("Total costs value: %.2f US$", costs);

        sc.close();
    }


}
