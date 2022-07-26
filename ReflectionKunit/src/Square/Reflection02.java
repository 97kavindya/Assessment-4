package Square;

public class Reflection02 {
  public static void main(String[] args) {
    Square s = new Square(6,6);
    s.setLength(16);
    
    short l = s.l;
    
  
    System.out.println("s=" + s);
  }
}
