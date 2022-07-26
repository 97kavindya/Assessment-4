package Square;
import static Square.KUnit.*;

public class TestSimple {
	
	void checkConstructorAndAccess() {
		Square s = new Square (6, 6);
		checkEquals(s.getLength(),6);
		checkEquals(s.getWidth(),6);
		checkNotEquals(s.getLength(),5);
		checkNotEquals(s.getWidth(),5);

	}

	void checkgetArea() {
		Square s=new Square(6,6);
		s.getArea();
		checkNotEquals(s.getArea(),6);
		checkEquals(s.getArea(),36);
		
	}
	
	public static void main(String[] args) {
		TestSimple ts=new TestSimple();
		ts.checkConstructorAndAccess();
		ts.checkgetArea();
		report();
		
	}

}
