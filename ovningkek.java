import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class ovningkek {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int randomnumb = (int ) (Math.random() * 100 + 1);
	int gissning;
	int peng = 0;
	int fram = 0;
	String snart;

	while (peng != 1) {
		//1 - 100 övning kod, och skillnaden mellan de.
		System.out.println(" Guess a number 1 - 100");
		gissning = input.nextInt();
		if (gissning < randomnumb) {
			int low = randomnumb - gissning;
			System.out.println("You were wrong! Your guess was lower by " + low);
		} else if (gissning > randomnumb) {
			int high = gissning - randomnumb;
			System.out.println("You were wrong! Your guess was higher by " + high);
		} else {
			System.out.println("Congratulations! You guessed right.");
			peng = 1;
		}
	}

	System.out.println("You gained access to the next level!\n");

	while (fram != 1) {

		System.out.println("Are we there yet?");
		snart = input.next();
		if (snart.equalsIgnoreCase("yes")) {
			System.out.println("Well, that's good to know.\n");
			fram = 1;
		} else if (snart.equalsIgnoreCase("no")) {
			System.out.println("Imma whopp yo ass bitch!");
		} else if (snart.equalsIgnoreCase("illuminati")) {
			System.out.println("The moonlanding was real!\nBush did 9/11!\nJet fuel can't melt steel beams!\n");

		} else if (snart.equalsIgnoreCase("cancel")) {
			System.out.println("Canceling program...\n");
			fram = 1;
		} else {
			System.out.println("Please enter a valid answer.\n");
		}
	}

	}
}
