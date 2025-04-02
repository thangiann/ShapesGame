import java.util.Scanner;

public class ShapeGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the number of shapes per type ");
        int numberPerShape = scanner.nextInt();

        System.out.println("Give the size of the stack for the player ");
        int playerStackSize = scanner.nextInt();

        ShapeGenerator generator = new ShapeGenerator(numberPerShape);
        Player player = new Player(playerStackSize);

        while (generator.hasShapes() && !player.isStackFull()) {
            
            player.printStack();
            System.out.println();

            Shape shape = generator.nextShape();
            player.playerShape(shape);

            System.out.println(String.format("Player has %s points", player.getPoints()));
            System.out.println();
        }

        scanner.close();

        System.out.println("GAME OVER");
    }
}
