import javax.swing.*;
import java.awt.*;

public class Apple extends JPanel {

    Image Apple;

    private int RandomX = (int) (41 + (Math.random() * 1180));
    private int RandomY = (int) (41 + (Math.random() * 640) );

    Apple(){
        Apple = new ImageIcon("Snake/src/Photos/apple.png").getImage();
    }

    public void paintApple(Graphics g) {
        g.drawImage(Apple, getRandomX(), getRandomY(), null);

    }

    public int getRandomX() {
        if (RandomX % 40 != 0) {
            while (RandomX % 40 != 0) {
                RandomX = (int) (Math.random() * 1180);
            }
        }
        return RandomX;
    }

    public int getRandomY() {
        if (RandomY % 40 != 0) {
            while (RandomY % 40 != 0) {
                RandomY = (int) (Math.random() * 640);
            }
        }
        return RandomY;
    }

    public void setRandomX(int randomX) {
        RandomX = randomX;
    }

    public void setRandomY(int randomY) {
        RandomY = randomY;
    }

}