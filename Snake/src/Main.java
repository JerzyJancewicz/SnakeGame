
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Snake snake = new Snake();
            while(true) {
                String move = scanner.nextLine();
                snake.Move(move);
            }
        }

}
