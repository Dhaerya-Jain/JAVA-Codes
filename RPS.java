import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Gather User Information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = 0;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Age must be a positive integer.");
            System.out.println("Game ended.");
            return;
        }
        if (age <= 0) {
            System.out.println("Age must be a positive integer.");
            System.out.println("Game ended.");
            return;
        }

        // Step 3: Explain Game Rules
        System.out.println("Available choices:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("Winner based on the game's rules: Rock beats Scissors, Paper beats Rock, and Scissors beats Paper.");

        // Gather User's Choice
        System.out.print("Enter your choice (1-3): ");
        int userChoice = 0;
        if (scanner.hasNextInt()) {
            userChoice = scanner.nextInt();
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            System.out.println("Game ended.");
            return;
        }
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            System.out.println("Game ended.");
            return;
        }

        // Step 4: Generate the Computer's Choice
        int computerChoice = (int)(Math.random() * 3) + 1;

        // Step 5: Display Choices
        System.out.print("You chose: ");
        switch(userChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
        }

        System.out.print("Computer chose: ");
        switch(computerChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
        }

        // Step 5 & 6: Determine Winner and Display Final Scores
        int userScore = 0, computerScore = 0;
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println(name + " wins this round!");
            userScore++;
        } else {
            System.out.println("Computer wins this round!");
            computerScore++;
        }

        // Step 6: Display Final Score and Winner
        System.out.println("Final Score - " + name + ": " + userScore + ", Computer: " + computerScore);
        if (userScore > computerScore) {
            System.out.println(name + " wins the game!");
        } else if (computerScore > userScore) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("It's a tie game!");
        }

        scanner.close();
    }
}
