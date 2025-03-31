import java.util.Scanner;
import java.util.Stack;

public class Player {
    private Stack<Shape> playerShapes;
    private double playerPoints;
    private int size;

    Scanner in = new Scanner(System.in);

    public Player(int size){

        this.playerShapes = new Stack<>();
        this.playerPoints = 0;
        this.size = size;
    }

    public double getPoints(){
        return this.playerPoints;
    }

    public void playerShape(Shape shape){

        System.out.println(shape.toString());
        System.out.println("Do you want to accept? (y/n)");

        boolean input = true;

        while (input) {
            try {
                String answer = in.nextLine();
                if (answer.equals("y") || answer.equals("n"))  {
                    input = false;
                }
            } catch (Exception e) {
                continue;
            }
        }
    }
    
    public boolean isStackFull(){
        return playerShapes.isEmpty();
    }

    public void printStack(){

        int i = 0;

        System.out.println("Current stack: ");
        for (Shape shape:playerShapes){
            System.out.println("        " + String.valueOf(playerShapes.size() - i)+ ":" + shape.toString());
            i++;
        }
 
    }
}
