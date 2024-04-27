package pack;

public class WhileLoopExample {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 10) + 1; // Generate a random number between 1 and 10
        int guess = 0;

        System.out.println("Welcome to the Guessing Game! "+secretNumber);
        System.out.println("Try to guess the secret number between 1 and 10.");

        // While loop for the guessing game
        while (guess != secretNumber) {
            guess = (int) (Math.random() * 10) + 1; // Generate a random guess between 1 and 10
            System.out.println("Guess: " + guess);

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the secret number.");
            } else {
                System.out.println("Try again!");
            }
        }

        System.out.println("Game over!");
    }

}
class Operations
{
    public int add(int x, int y) {
        return x + y;
    }
    public int subtract(int x, int y) {
        return x-y;
    }
}
