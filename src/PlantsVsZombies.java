import java.util.ArrayList;

//The class that is used to create objects of each level
public class PlantsVsZombies{
  private ArrayList<Zombie> zombies = new ArrayList<Zombie>();
  private Plants[][] Garden = {{new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), 
	  new Plants(), new Plants(), new Plants()}, {new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), 
		  new Plants(), new Plants(), new Plants()}, {new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), 
			  new Plants(), new Plants(), new Plants()}, {new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), 
				  new Plants(), new Plants(), new Plants()}, {new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), new Plants(), 
					  new Plants(), new Plants(), new Plants()}};
  
  private int sunlight = 50;

  public void addZombie(Zombie z) {
	  zombies.add(z);
  }
  
  public Plants[][] getGarden() {
	  return Garden;
  }
  
  public static void printGarden(Plants mat[][]) { 
	  System.out.print("p = peashooter" + "\n" + "s = sunflower" + "\n" + "w = wallnut" + "\n" + "c = cherrybomb" + "\n" + "f = frozen peashooter" + "\n" );
	  System.out.println("Garden:");
	  System.out.println("------------------");
	// Loop through all rows 
      for (int i = 0; i < mat.length; i++) {

          // Loop through all elements of current row 
          for (int j = 0; j < mat[i].length; j++) {
              System.out.print(mat[i][j].getName().charAt(0) + " "); 
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
	  for (Zombie z : zombies) {
		  str += z.toString() + "\n";
	  }
	  return str;
  }
  
}
