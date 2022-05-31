import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Apple extends JPanel {

    Snake snake = new Snake();
    Image Apple;
    //RandomNumber Random = new RandomNumber();
    Random randomX = new Random();
    Random randomY = new Random();

    private int RandomX;
    private int RandomY;

    Apple(){
        Apple = new ImageIcon("Snake/src/Photos/apple.png").getImage();
    }

    public void paintApple(Graphics g) {
        g.drawImage(Apple, RandomX, RandomY, null);

    }

    public boolean isAppleTaken() {
            if (RandomX == snake.getStartX() && RandomY == snake.getStartY()) {
                   return true;
            }
            return false;
    }

    /*public int getRandomX() {
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
    }*/
}

/*while (randomX.nextInt(1880) % 40 != 0){
        randomX.nextInt(1880);
        }
        RandomX = randomX.nextInt();
        while (randomY.nextInt(1880) % 40 != 0){
        randomY.nextInt(1880);
        }
        RandomY = randomY.nextInt();
        RandomX = randomX.nextInt(1880);
        RandomY = randomY.nextInt(1000);
        System.out.println(RandomY+" "+ RandomX);*/
