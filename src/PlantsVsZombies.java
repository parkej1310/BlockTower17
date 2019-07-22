import java.util.ArrayList;

public class PlantsVsZombies{
  private ArrayList<GameCharacter> characters = new ArrayList<GameCharacter>();
  private char[][] Garden = new char[5][9];
  private int sunlight = 50;
  //ArrayList<Lawnmower> lawnmowers = new ArrayList<Lawnmower>;
  

  public void addZombie(GameCharacter character) {
	  characters.add(character);
  }
  
  public char[][] getGarden() {
	  return Garden;
  }
  
  public static void printGarden(char mat[][]) { 
	  System.out.print("p = peashooter" + "\n" + "s = sunflower" + "\n" + "w = wallnut" + "\n" + "c = cherrybomb" + "\n" + "f = frozen peashooter" + "\n" );
	  System.out.println("Garden:");
	  System.out.println("------------------");
	// Loop through all rows 
      for (int i = 0; i < mat.length; i++) {

          // Loop through all elements of current row 
          for (int j = 0; j < mat[i].length; j++) {
              System.out.print(mat[i][j] + " "); 
          }
          System.out.print("\n");
      }	
      System.out.println("------------------");
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
