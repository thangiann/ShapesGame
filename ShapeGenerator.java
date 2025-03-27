import java.util.ArrayList;
import java.util.Random;

public class ShapeGenerator{

    private ArrayList<Shape> shapes;
    private int[] bounding_area_values = {1,2,3,4,8,12,16};

    Random random = new Random();

    public ShapeGenerator(int number){
        
        shapes = new ArrayList<>();

        for (int i = 0; i < number; i++){
            
            int index = random.nextInt(bounding_area_values.length - 1);
            
            Square square = new Square(bounding_area_values[index]);
            shapes.add(square);
        }

        for (int i = 0; i < number; i++){
            
            int index = random.nextInt(bounding_area_values.length - 1);
            
            Triangle triangle = new Triangle(bounding_area_values[index]);
            shapes.add(triangle);
        }

        for (int i = 0; i < number; i++){
            
            int index = random.nextInt(bounding_area_values.length - 1);
            int bonus = random.nextInt(11);

            BonusCircle circle = new BonusCircle(bounding_area_values[index], bonus);
            shapes.add(circle);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
