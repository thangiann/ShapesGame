import java.util.Random;

public class ShapeGenerator{

    private Shape[] shapes;
    //private String[] types = {"Square", "Triangle", "Pentagon", "Circle"};
    private int[] bounding_area_valus = {1,2,3,4,8,12,16};

    public ShapeGenerator(int number){
        
        shapes = new Shape[4 * number];

        
    }
    
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
