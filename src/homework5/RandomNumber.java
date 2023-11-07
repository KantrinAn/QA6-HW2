package homework5;

import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Hello! Type your name.");
        String name = scanner.nextLine();
        System.out.println(name + " Let the game begin!");
       int randomNumber = random.nextInt(100);
        while (true) {
            System.out.println("Type number from 0 to 100");
          int  first = scanner.nextInt();
            if (first > randomNumber) {
                System.out.println(" Your number is too big. Please, try again");

            } else if (first < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
                           }
            else {
                System.out.println("Congratulations " + name);
                break;
            }

        }

    }
}

