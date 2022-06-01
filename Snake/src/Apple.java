import javax.swing.*;
import java.awt.*;


public class Apple extends JPanel {

    Image Apple;


    private int RandomX = (int) (Math.random() * 1880);
    private int RandomY = (int) (Math.random() * 1000);

    Apple(){
        Apple = new ImageIcon("Snake/src/Photos/apple.png").getImage();
    }

    public void paintApple(Graphics g) {
        g.drawImage(Apple, getRandomX(), getRandomY(), null);

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

    public void setRandomX(int randomX) {
        RandomX = randomX;
    }

    public void setRandomY(int randomY) {
        RandomY = randomY;
    }

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
