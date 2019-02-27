import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);
		String expected = "EquilateralTriangle ID = test2 area = 6.928 perimeter = 12.000, "
				+ "Circle ID = test4 area = 7.069 perimeter = 9.425, "
				+ "Rectangle ID = test area = 9.000 perimeter = 12.000, "
				+ "Square ID = test3 area = 9.000 perimeter = 12.000, ";
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();
		String actual = sorter.toString();
		
		Assert.assertEquals("Shapes sorted incorrectly...", expected, actual);
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapeAreaComparator());
		
		String expected = "EquilateralTriangle ID = test2 area = 6.928 perimeter = 12.000, "
				+ "Circle ID = test4 area = 7.069 perimeter = 9.425, "
				+ "Rectangle ID = test area = 9.000 perimeter = 12.000, "
				+ "Square ID = test3 area = 9.000 perimeter = 12.000, ";
		String actual = sorter.toString();
		
		Assert.assertEquals("Shapes sorted incorrectly...", expected, actual);
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
        ShapeSorter sorter = new ShapeSorter();
		
        Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 2);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 2);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapePerimeterComparator());
		
		String expected = "EquilateralTriangle ID = test2 area = 1.732 perimeter = 6.000, "
				+ "Rectangle ID = test area = 9.000 perimeter = 12.000, "
				+ "Square ID = test3 area = 9.000 perimeter = 12.000, " 
				+ "Circle ID = test4 area = 12.566 perimeter = 12.566, ";
		String actual = sorter.toString();
		d.getArea();
		d.getPerimeter();
		
		Assert.assertEquals("Shapes sorted incorrectly...", expected, actual);
		
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		String expectedString = "Rectangle ID = test1 area = 9.000 perimeter = 12.000, ";
        Shape a = new Rectangle("test1", 3.0, 3.0);
        
        ShapeSorter sorter = new ShapeSorter();
        
        sorter.addShape(a);
        String actual = sorter.toString();
        
        Assert.assertEquals(expectedString, actual);
	}
}
