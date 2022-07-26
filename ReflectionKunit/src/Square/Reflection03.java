package Square;

public class Reflection03 {

  public static void main(String[] args) {
	Square s = new Square(0,0);
    System.out.println("class =" + s.getClass());
    System.out.println("class name =" + s.getClass().getName());
}
}
