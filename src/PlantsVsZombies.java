import java.util.ArrayList;

public class PlantsVsZombies{
  private ArrayList<GameCharacter> characters = new ArrayList<GameCharacter>();
  public int sunlight = 50;
  //ArrayList<Lawnmower> lawnmowers = new ArrayList<Lawnmower>;
  

  public void addCharacter(GameCharacter character) {
	  characters.add(character);
  }
  
  public void addSunlight(int amount) {
	  sunlight += amount;
  }
  public String toString() {
	  String str = "";
	  for (GameCharacter c : characters) {
		  str += c.toString() + "\n";
	  }
	  return str;
  }
  
}
