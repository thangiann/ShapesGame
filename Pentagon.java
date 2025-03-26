public class Pentagon extends Shape{
    
    public Pentagon(int bounding_area){
        super(bounding_area);
    }

    public double computeArea(){
        
        return 3/4 * super.getBounding_area();

    }
}
