
abstract class Plants extends Character{
	private PlantLocation location;
	private int price;
	public PlantLocation getLocation(){
		return location;
	}
	public void setLocation(PlantLocation location){
		this.location = location;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
