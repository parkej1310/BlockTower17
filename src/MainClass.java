import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		PlantsVsZombies level1 = new PlantsVsZombies();
		Scanner keyboard = new Scanner(System.in);
		char play = 'y';
		while (play != 'n') {
			level1.printGarden(level1.getGarden());
			System.out.println("Play game?: 'y' or 'n'");
			play = keyboard.next().charAt(0);
			if (play == 'n') {
				break;
			}
			if (play != 'n' && play != 'y') {
				continue;
			}
			System.out.println("What kind of plant would you like to add?");
			char plant = keyboard.next().charAt(0);
			System.out.println("Which row?");
			int row = keyboard.nextInt();
			System.out.println("Which column?");
			int column = keyboard.nextInt();
			level1.getGarden()[row][column] = plant;
		}
	}
}
