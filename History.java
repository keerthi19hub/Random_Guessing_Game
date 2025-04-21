import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Integer> guessHistory;

    public History() {
        this.guessHistory = new ArrayList<>();
    }

    public void addGuess(int guess) {
        this.guessHistory.add(guess);
    }

    public void displayHistory() {
        if (!guessHistory.isEmpty()) {
            System.out.print("Your previous guesses: ");
            for (int i = 0; i < guessHistory.size(); i++) {
                System.out.print(guessHistory.get(i));
                if (i < guessHistory.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}