import javax.swing.*;
import java.awt.*;

public class PaintSnake extends JPanel {

    Snake snake = new Snake();
    Apple apple = new Apple();

    private int countApple = 1;
    private int countBody = 1;

    Image SnakeRight;
    Image SnakeLeft;
    Image SnakeUp;
    Image SnakeDown;
    Image BodyX;
    Image BodyY;

    PaintSnake(){
        SnakeRight = new ImageIcon("Snake/src/Photos/head_right.png").getImage();
        SnakeLeft = new ImageIcon("Snake/src/Photos/head_left.png").getImage();
        SnakeUp = new ImageIcon("Snake/src/Photos/head_up.png").getImage();
        SnakeDown = new ImageIcon("Snake/src/Photos/head_down.png").getImage();
        BodyX = new ImageIcon("Snake/src/Photos/body_horizontal.png").getImage();
        BodyY = new ImageIcon("Snake/src/Photos/body_vertical.png").getImage();
    }

    public void paintSnake(Graphics g) {

        switch (snake.getDirection()) {
            case 0:

                g.drawImage(SnakeUp, snake.getStartX(), snake.getStartY(), null);

                if(apple.getRandomX() == snake.getStartX() && apple.getRandomY() == snake.getStartY()){
                    apple.setRandomX((int) (Math.random() * 1880));
                    apple.setRandomY((int) (Math.random() * 1000));
                    countBody++;
                    countApple++;
                }

                for (int i = 0; i < countBody; i++) {
                    g.drawImage(BodyY, snake.getStartX(), snake.getStartY() + ((countBody - i) * snake.getSnakeVy()), null);
                }
                break;

            case 1:

                g.drawImage(SnakeDown, snake.getStartX(), snake.getStartY(), null);

                if(apple.getRandomX() == snake.getStartX() && apple.getRandomY() == snake.getStartY()){
                    apple.setRandomX((int) (Math.random() * 1880));
                    apple.setRandomY((int) (Math.random() * 1000));
                    countBody++;
                    countApple++;
                }

                for (int i = 0; i < countBody; i++) {
                    g.drawImage(BodyY, snake.getStartX(), snake.getStartY() - ((countBody - i) * snake.getSnakeVy()), null);
                }
                break;

            case 2:

                g.drawImage(SnakeRight, snake.getStartX(), snake.getStartY(), null);

                if(apple.getRandomX() == snake.getStartX() && apple.getRandomY() == snake.getStartY()){
                    apple.setRandomX((int) (Math.random() * 1880));
                    apple.setRandomY((int) (Math.random() * 1000));
                    countBody++;
                    countApple++;
                }

                for (int i = 0; i < countBody; i++) {
                    g.drawImage(BodyX, snake.getStartX() - ((countBody - i) * snake.getSnakeVx()), snake.getStartY(), null);
                }
                break;

            case 3:

                g.drawImage(SnakeLeft, snake.getStartX(), snake.getStartY(), null);

                if(apple.getRandomX() == snake.getStartX() && apple.getRandomY() == snake.getStartY()){
                    apple.setRandomX((int) (Math.random() * 1880));
                    apple.setRandomY((int) (Math.random() * 1000));
                    countBody++;
                    countApple++;
                }

                for (int i = 0; i < countBody; i++) {
                    g.drawImage(BodyX, snake.getStartX() + ((countBody - i) * snake.getSnakeVx()), snake.getStartY(), null);
                }
                break;
        }
    }
}
