

import java.util.Scanner;

public class ReverseFactorial {

    public static void main(String[] args) {

            /*Scanner that takes user integer input as variable i
            * variable j set to 2 to start of modulus operation*/
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please input a number.");
            int i = userInput.nextInt();
            int j = 2;

            //While loop that checks modulus of i and j and compares to 0
            //If it is 0 then it may have a factorial so divides i and j and repeats the operation
            //Finally adds 1 to j
            while (i%j==0){
                //System.out.println(i); //test
                i = i/j;
                j++;
            }
            //Checks if final answer is 1 - if 1 then number has factorial. If not it prints none.
            if (i==1){
                System.out.println(j -1 +"!");
            } else {
                System.out.println("NONE");
            }
    }
}
