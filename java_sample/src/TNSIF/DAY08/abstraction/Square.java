package TNSIF.DAY08.abstraction;

public class Square {
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	} 	

}
