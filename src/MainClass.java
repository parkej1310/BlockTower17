import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		PlantsVsZombies level1 = new PlantsVsZombies();
		
		Scanner keyboard = new Scanner(System.in);
		char play = 'y';
		Plants p = new Plants();
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
			System.out.println("Peashooter(P) Sunflower(S) Wallnut(W) FrozenPeaShooter(F) CherryBomb(C)");
			char plant = keyboard.next().charAt(0);
			if (plant == 'P'){
				p = new PeaShooter();
			}
			else if (plant == 'S'){
				p = new Sunflower();
			}
			else if (plant == 'W'){
				p = new Wallnut();
			}
			else if (plant == 'F'){
				p = new FrozenPeaShooter();
			}
			else if (plant == 'C'){
				p = new CherryBomb();
			}
			else{ continue; }
			System.out.println("Which row?");
			int row = keyboard.nextInt();
			System.out.println("Which column?");
			int column = keyboard.nextInt();
			level1.getGarden()[row][column] = p; 
		}
		
	}
}
