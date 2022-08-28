import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	private static List<Integer> winningNumbers;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		winningNumbers = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 6; i++) { // go through loop 6x 
			while (true) {
				int winningNumber = random.nextInt(49) + 1;
				if (!winningNumbers.contains(winningNumbers)) {
					winningNumbers.add(winningNumber);
					break;
				}	
			}
		}
		//GOD MODE
		//System.out.println(winningNumbers);

		System.out.println("Please enter your 6 numbers between 1 and 49:");
		Scanner scanner = new Scanner(System.in);

		List<Integer> guessedNumbers = new ArrayList<>();
		for (int i = 0; i <6; i++) {
			System.out.println("Your current numbers are " + guessedNumbers);
			System.out.println("Please enter a number (1-49): ");
			while (true) {
				try {
					String numberString = scanner.nextLine();
					int number = Integer.parseInt(numberString);
					if (number >= 1 && number <= 49) {
						guessedNumbers.add(number);
						break;
					}
					else {
						System.out.println(number + " is not between 1 and 49. Please try again.");
					}
				}
				catch (NumberFormatException nfe) {
					System.out.println("That's not a number, fucktard...");
				}
			}
		}

		System.out.println("The winning numbers were: " + winningNumbers);
		System.out.println("Your numbers are: " + guessedNumbers);

		guessedNumbers.retainAll(winningNumbers);
		System.out.println("Your matched numbers are: " + guessedNumbers);

		if (guessedNumbers.containsAll(winningNumbers)) {
			System.out.println("YOU WON THE LOTTERY!!!!!");
		} else {
			System.out.println("You lose. Shocking...");
		}
		scanner.close();
	}
}
