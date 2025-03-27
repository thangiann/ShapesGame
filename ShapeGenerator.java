import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ShapeGenerator{

    private Shape[] shapes;
    private String[] types = {"Square", "Triangle", "Pentagon", "Circle"};
    private int[] bounding_area_valus = {1,2,3,4,8,12,16};

    HashMap<String, Class<? extends Shape>> shapeMap = new HashMap<>();
    shapeMap.put("Square", Square.class);
    shapeMap.put("Triangle", Triangle.class);
    shapeMap.put("Pentagon", Pentagon.class);
    shapeMap.put("Circle", Circle.class);
    
    Random random = new Random();

    public ShapeGenerator(int number){
        
        shapes = new Shape[4 * number];

        for (String type:types){
            
            for (int i = 0; i < number; i++){
                
               Class<?> clas = Class.forName(type);
               
               java.lang.reflect.Constructor<?> constructor = clas.getConstructor(int.class);

               //Shape shape = (Shape) constructor.newInstance(bounding_area)

                
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
