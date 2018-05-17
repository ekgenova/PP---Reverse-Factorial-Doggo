import java.util.Scanner;

public class DoggoCompetition {
    public static void main(String[] args) {


        //initialize dog position and scanner to take the dog position
        int dogPosition;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Where did your dog place?");
        dogPosition = userInput.nextInt();

        //ending for each position - st/nd/rd/th
        String ending;


        if (dogPosition < 100 && dogPosition >= 1) {

            System.out.println("Dog competition placements:");
            for (int i = 1; i <= 100; i++) {
                if (i == dogPosition) {
                    continue;
                }
                if (i == 1 || i == 21 || i == 31 || i == 41 || i == 51 || i == 61 || i == 71 || i == 81 || i == 91) {
                    ending = "st";
                } else if (i == 2 || i == 22 || i == 32 || i == 42 || i == 52 || i == 62 || i == 72 || i == 82 || i == 92) {
                    ending = "nd";
                } else if (i == 3 || i == 23 || i == 33 || i == 43 || i == 53 || i == 63 || i == 73 || i == 83 || i == 93) {
                    ending = "rd";
                } else {
                    ending = "th";
                }

                if (i < 100) {
                    System.out.print(i + ending + " ,");
                } else {
                    System.out.println(i + ending);
                }
            }
        }else if (dogPosition < 1){
            System.out.println("Your dog didn't participate!");
        } else {
            System.out.println("Your dog didn't place in the top 100!");
        }
    }
}
