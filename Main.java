// Hello and welcome to my Dice Rolling project!
// Were going to start off with importing
import java.util.Random;
import java.util.Scanner;


// Done with the imports! (Hopefully)
// Here's the main file
public class Main {
    public static void main(String[] args) {
        // Here are some objects
        Random rand = new Random();


        // Variables
        int roll = 0;


        // Creating the Scanner to ask the user deep intimate questions...
        // or just ask them what dice they want to roll
        Scanner askamatron = new Scanner(System.in);


        // Now we're going to ask the user what dice they will like to roll.
        System.out.println("What dice would you like to roll?");
        String answer = askamatron.nextLine();
        //askamatron.close();


        // This is where we will roll the dice.
        // This will use a "Random" object to "roll" the dice
        if (answer.equals("d4")) {
            roll = rand.nextInt((4 - 1) + 1);
            if (roll < 1)
                System.out.println("1");
            else if (roll > 4) {
                System.out.println("4");
            }
            else {
                System.out.println(roll);  // Rolling of the dice
            }
        }

        else if (answer.equals("d6")){
            roll = rand.nextInt((6 - 1) + 1);
            if (roll < 1)
                System.out.println("1");
            else if (roll > 6) {
                System.out.println("6");
            }
            else {
                System.out.println(roll);  // Rolling of the dice
            }
        }

        else if (answer.equals("d8")){
            roll = rand.nextInt((8 - 1) + 1);
            if (roll < 1)
                System.out.println("1");
            else if (roll > 8) {
                System.out.println("8");
            }
            else {
                System.out.println(roll);  // Rolling of the dice
            }
        }

        else if (answer.equals("d10")){
            roll = rand.nextInt((10 - 1) + 1);
            if (roll < 1)
                System.out.println("1");
            else if (roll > 10) {
                System.out.println("10");
            }
            else {
                System.out.println(roll);  // Rolling of the dice
            }
        }

        else if (answer.equals("d12")){
            roll = rand.nextInt((12 - 1) + 1);
            if (roll < 1)
                System.out.println("1");
            else if (roll > 12) {
                System.out.println("12");
            }
            else {
                System.out.println(roll);  // Rolling of the dice
            }
        }

        else if (answer.equals("d20")) {
            roll = rand.nextInt((20 - 1) + 1);
            if (roll <= 1 && answer.equals("d20")) {
                System.out.println("Critical Fail!");
                System.out.println("1");
            } else if (roll >= 20 && answer.equals("d20")) {
                System.out.println("Critical Success!");
                System.out.println("20");
            } else {
                System.out.println(roll);
            }
        }

        else {
            System.out.println("Please enter another dice.");
            main(null);
        }


        // Asks the user if they want to roll more dice.
        System.out.println("Do you wish to roll more dice? (y/n)");
            String answer2 = askamatron.nextLine();
            if (answer2.equals("y")) {
                main(null);
            }
            else {
                System.out.println("Peace out boyscout!");
            }
    }
}