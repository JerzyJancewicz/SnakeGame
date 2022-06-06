import javax.swing.*;
import java.awt.*;

public class Apple extends JPanel {

    Image Apple;

    private int RandomX = (int) (Math.random() * 1180);
    private int RandomY = (int) (Math.random() * 640);

    Apple(){
        Apple = new ImageIcon("Snake/src/Photos/apple.png").getImage();
    }

    // rysuje jablko
    public void paintApple(Graphics g) {
        g.drawImage(Apple, getRandomX(), getRandomY(), null);

    }

    //daje randomowy X taki, zeby byl podzielny przez 40,
    //zeby jablko malowalo sie w kwadracikach
    public int getRandomX() {
        if (RandomX % 40 != 0) {
            while (RandomX % 40 != 0) {
                RandomX = (int) (Math.random() * 1180);
            }
        }
        return RandomX;
    }

    //daje randomowy Y taki, zeby byl podzielny przez 40,
    //zeby jablko malowalo sie w kwadracikach
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