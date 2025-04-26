public class Program {
    public static void main(String[] args) {
        int bottleNums = 10;
        String word = " green bottles";

        while (bottleNums > 0) {

            if (bottleNums == 1) {
                word = " green bottle";
            }

            System.out.println(bottleNums + word + " hanging on the wall");
            System.out.println(bottleNums + word + " hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall");

            bottleNums--;

            if (bottleNums == 0) {
                System.out.println("There'll be no" + word + " hanging on the wall");
                System.out.println();
            } else {
                System.out.println("There'll be " + bottleNums + word + " hanging on the wall");
                System.out.println();
            }
        }

    }
}
