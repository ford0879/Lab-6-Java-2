
public class Rectangle extends Polygon {

	/**
	 * Variables holding side lengths of Rectangle
	 */
	private double height;
	private double width;
	
	/**
	 * Constructs Rectangle by updating side lengths
	 * @param id The shapes id name
	 * @param height Length of sides from top to bottom
	 * @param width Length of sides from left to right
	 */
	public Rectangle(String id, double height, double width)
	{
		super(id);
		this.height = height;
		this.width = width;
		
	}

	/**
	 * Calculates area of rectangle using given side lengths
	 * @return Area of Rectangle
	 */
	public double getArea()
	{
		return height * width;
	}
	
	/**
	 * Gets type of shape
	 * @return Name of Shape "Rectangle"
	 */
	public String getShapeType()
	{
		return "Rectangle";
	}
}
