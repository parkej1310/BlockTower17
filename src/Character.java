
abstract class Character {
	private int health;
	private String name;
	private int attack;

	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	public int getAttack() {
		return attack;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void loseHealth(int damage) {
		health -= damage;
	}
	public String toString(){
		return name + " , Health: " + health + " , Attack: " + attack;
	}

}
