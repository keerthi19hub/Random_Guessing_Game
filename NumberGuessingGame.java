import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int secretNumber;
    private Player user;
    private GuessReader GuessReaderHandler;
    private History guessHistory;
    private Judge checker;
    private Over gameExiter;

    public NumberGuessingGame() {
        Random random = new Random();
        this.secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        this.user = new Player();
        this.GuessReaderHandler = new GuessReader();
        this.guessHistory = new History();
        this.checker = new Judge(secretNumber);
        this.gameExiter = new Over();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Random Guessing Game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        user.setName(playerName);
        System.out.println("Hello, " + user.getName() + "! Try to guess the number between 1 and 100.");

        int guess;
        do {
            guess = GuessReaderHandler.getUserGuess(scanner);
            user.incrementAttempts();
            guessHistory.addGuess(guess);

            String result = checker.checkGuess(guess);
            System.out.println(result);
            guessHistory.displayHistory();

            if (result.equals("Congratulations! You guessed the correct number.")) {
                System.out.println("You guessed it in " + user.getAttempts() + " attempts.");
                break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                gameExiter.exitGame();
                break;
            }

        } while (true);

        scanner.close();
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.playGame();
    }
}