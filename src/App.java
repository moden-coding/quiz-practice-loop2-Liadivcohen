
/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int highestscore = 0;
        int lowestscore = 100;

        while (true) {
            System.out.println("Give a score:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1 ) {
                break;
           
            }
            if (number > highestscore) {
                highestscore = number;
                

            } else if (number < lowestscore) {
                lowestscore = number;
            }

           

        }
         System.out.println("The high score was " + highestscore);
        
         System.out.println("The lowest score was " + lowestscore);
    }
}