import java.util.Stack;

public class Player {
    Stack<Shape> playerShapes;
    double playerPoints;

    public Player(int size){

        this.playerShapes = new Stack<>();
        this.playerPoints = 0;
    }
}
