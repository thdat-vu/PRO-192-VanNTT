
/**
 *
 * @author LENOVO
 */
public class Tester {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        a.inputCircle();
        b.inputCircle();
        a.outputCircle();
        b.outputCircle();
        a.getDistance(b.x, b.y);
        b.getDistance(a.x, a.y);
    }
    
}
