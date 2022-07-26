package Square;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareTest {
	
	@Test
	public void testLength() {
		Square r = new Square(6,6);	
		assertEquals(3,r.getLength());
	}
	
	@Test
	public void testWidth() {
		Square r = new Square(6,6);	
		assertEquals(6,r.getWidth());
	}
	
	@Test
	public void testArea() {
		Square r = new Square(6,6);
		assertEquals(23,r.getArea());
	}
	

}
