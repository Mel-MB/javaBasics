package miniGames.diceRoller;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    private Random random;
    private int number;

    DiceRoller(){
        this.random = new Random();
        roll();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to roll again ? [yes/no]");
        String response = scanner.next().toLowerCase();

        switch (response){
            case "yes":
                new DiceRoller();
            break;
            case "no":
                System.out.println("Ok have fun !");
            break;
            default:
                System.out.println("Please enter yes or no.");
        }
    }

    void roll() {
        this.number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
