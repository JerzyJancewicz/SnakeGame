import javax.swing.*;
import java.awt.*;

public class Apple extends JPanel {

    Image Apple;
    Image GoldenApple;

    private int RandomX = (int) (Math.random() * 1180);
    private int RandomY = (int) (Math.random() * 640);
    private int RandomX2 = (int) (Math.random() * 1180);
    private int RandomY2 = (int) (Math.random() * 640);
    private double RandomNumber = (Math.random());

    Apple(){
        GoldenApple = new ImageIcon("Snake/src/Photos/applegold.png").getImage();
        Apple = new ImageIcon("Snake/src/Photos/apple.png").getImage();
    }

    // rysuje jablko
    public void paintApple(Graphics g) {
        if(RandomNumber < 0.1 && getRandomX() != getRandomX2() && getRandomY() != getRandomY2()){
            g.drawImage(GoldenApple, getRandomX2(), getRandomY2(), null);
            g.drawImage(Apple, getRandomX(), getRandomY(), null);
        }else {
            g.drawImage(Apple, getRandomX(), getRandomY(), null);
        }
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

    public int getRandomX2() {
        if (RandomX2 % 40 != 0) {
            while (RandomX2 % 40 != 0) {
                RandomX2 = (int) (Math.random() * 1180);
            }
        }
        return RandomX2;
    }

    public int getRandomY2() {
        if (RandomY2 % 40 != 0) {
            while (RandomY2 % 40 != 0) {
                RandomY2 = (int) (Math.random() * 640);
            }
        }
        return RandomY2;
    }

    public void setRandomNumber(double randomNumber) {
        RandomNumber = randomNumber;
        setRandomX2((int) (Math.random() * 1180));
        setRandomY2((int) (Math.random() * 640));
    }

    public void setRandomX(int randomX) {
        RandomX = randomX;
    }

    public void setRandomY(int randomY) {
        RandomY = randomY;
    }

    public void setRandomX2(int randomX2) {
        RandomX2 = randomX2;
    }

    public void setRandomY2(int randomY2) {
        RandomY2 = randomY2;
    }

    public double getRandomNumber() {
        return RandomNumber;
    }
}