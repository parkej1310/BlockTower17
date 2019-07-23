
public class Plants extends GameCharacter{
	private int price;
	private int row;
	private int column;
	public String getLocation(){
		return "(" + row + ", " + column + ")";
	}
	public void setRow(int row){
		this.row = row;
	}
	public void setColumn(int column){
		this.column = column;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
