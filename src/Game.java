import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void run() {
        Random random = new Random();
        int randomNum = random.nextInt(1,4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nstone - scissors - paper: ");
        System.out.println("Intellij IDEA: " + randomNum);
        System.out.print("you: ");
        String choice = scanner.nextLine();
        System.out.println("Winner: " + checkWin(randomNum, choice));

    }

    private static String checkWin(int randomNum, String choice) {
        // 1
        String stone = "stone";
        // 2
        String scissors = "scissors";
        // 3
        String paper = "paper";
        if ((randomNum == 1 && choice.equals(scissors)) || (randomNum == 2 && choice.equals(paper)) || (randomNum == 3 && choice.equals(stone))) {
            return "Intellij IDEA";
        } else if ((choice.equals(paper) && randomNum == 1) || (choice.equals(scissors) && randomNum == 3) || (choice.equals(stone) && randomNum == 2)) {
            return "you";
        } else {
            return "Not winner";
        }
    }
}
