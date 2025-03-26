abstract class Shape{

    private String type;
    private int bounding_area;
    
    public Shape(int area){
        this.bounding_area = area;
    }

    //setters and getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getBounding_area() {
        return bounding_area;
    }

    public void setBounding_area(int bounding_area) {
        this.bounding_area = bounding_area;
    }

    //methods
    public abstract double computeArea();

    public boolean sameType(Shape shape){
        return this.type.equals(shape.getType());
    }

    public boolean sameArea(Shape shape){
        return this.computeArea() == shape.computeArea(); 
    } 

    public double computePoints(){
        return computeArea();
    }

    @Override
    public String toString(){
        return this.type + ":" + String.valueOf(computeArea());
    }
}