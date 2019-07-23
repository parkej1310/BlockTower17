

public class Zombie extends GameCharacter{
	private int speed = 50;
	private int row; //Which row the zombie will start walking down from
	private double position = 50.0; //50.0 is the very right side of the garden
	
	//Gets the row that the zombie spawns from to be random
	
	public Zombie() {
		setName("Zombie");
		setHealth(200);
		setRow();
	}
	public void setRow() {
		row = (int)(Math.random() * 5 + 1);
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public int getRow() {
		return row;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void move(int speed) {
		
	}
	
}
