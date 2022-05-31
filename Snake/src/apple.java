import javax.swing.*;
import java.awt.*;

public class apple extends JPanel {

    Snake snake = new Snake();
    Image Apple;

    private int RandomX = 45;
    private int RandomY = 45;

    apple(){
        Apple = new ImageIcon("Snake/src/Photos/apple.png").getImage();
    }

    public void paintApple(Graphics g) {
        g.drawImage(Apple, RandomX, RandomY, null);
    }

    public void TakeApple() {
        if (RandomX == snake.getStartX() && RandomX == snake.getStartY()) {
                RandomX = ((int) (Math.random() * 1920));
                RandomY = ((int) (Math.random() * 1920));
        }
    }

    public int getRandomX() {
        if (RandomX % 40 != 0) {
            while (RandomX % 40 != 0) {
                RandomX = (int) (Math.random() * 1880);
            }
        }
        return RandomX;
    }
    public int getRandomY() {
        if (RandomY % 40 != 0) {
            while (RandomY % 40 != 0) {
                RandomY = (int) (Math.random() * 1000);
            }
        }
        return RandomY;
    }
}
