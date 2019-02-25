
public class Square extends Rectangle {

	/**
	 * Uses Rectangle class to construct a Square
	 * @param id
	 * @param size
	 */
	public Square(String id, double size)
	{
		super(id, size, size);
		
	}
	
	/**
	 * @return type of shape "Square"
	 */
	public String getShapeType()
	{
		return "Square";
	}
}
