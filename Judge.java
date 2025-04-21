public class Judge {
    private int secretNumber;

    public Judge(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public String checkGuess(int guess) {
        if (guess < secretNumber) {
            return "Too low. Try again.";
        } else if (guess > secretNumber) {
            return "Too high. Try again.";
        } else {
            return "Congratulations! You guessed the correct number.";
        }
    }
}