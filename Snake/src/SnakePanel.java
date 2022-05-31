import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakePanel extends JPanel implements KeyListener, ActionListener {

    Image SnakeRight;
    Image SnakeLeft;
    Image SnakeUp;
    Image SnakeDown;
//    Image Apple;
    Image BodyX;
    Image BodyY;

    Snake snake = new Snake();
    background Background = new background();
    apple Apple = new apple();

    public int PanelWidth = 1920;
    public int PanelHeight = 1080;
    private int countApple = 1;
    private int countBody = 1;
    //private int BodyPositionMinus = snake.getStartY() - (countApple * 40);
    //private int BodyPositionPlus = snake.getStartY() + (countApple * 40);
    private boolean isPlaying = true;

    SnakePanel() {
        SnakeRight = new ImageIcon("Snake/src/Photos/head_right.png").getImage();
        SnakeLeft = new ImageIcon("Snake/src/Photos/head_left.png").getImage();
        SnakeUp = new ImageIcon("Snake/src/Photos/head_up.png").getImage();
        SnakeDown = new ImageIcon("Snake/src/Photos/head_down.png").getImage();
//        Apple = new ImageIcon("Snake/src/apple.png").getImage();
        BodyX = new ImageIcon("Snake/src/Photos/body_horizontal.png").getImage();
        BodyY = new ImageIcon("Snake/src/Photos/body_vertical.png").getImage();

        this.setPreferredSize(new Dimension(PanelWidth, PanelHeight));
        this.setVisible(true);

        Timer timer = new Timer(80, this);
        timer.start();

        Apple.TakeApple();
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());

        Background.paintBackGround(g);
        paintSnake(g);
        Apple.paintApple(g);

    }

    public void paintSnake(Graphics g) {

        switch (snake.getDirection()) {
            case 0:
                g.drawImage(SnakeUp, snake.getStartX(), snake.getStartY(), null);

                if(Apple.getRandomX() == snake.getStartX() && Apple.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++){
                    g.drawImage(BodyY,snake.getStartX(),snake.getStartY() + ((countBody - i) * snake.getSnakeVy()),null);
                }
                break;

            case 1:
                g.drawImage(SnakeDown, snake.getStartX(), snake.getStartY(), null);

                if(Apple.getRandomX() == snake.getStartX() && Apple.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++){
                    g.drawImage(BodyY,snake.getStartX(),snake.getStartY() - ((countBody - i) * snake.getSnakeVy()),null);
                }
                break;

            case 2:
                g.drawImage(SnakeRight, snake.getStartX(), snake.getStartY(), null);

                if(Apple.getRandomX() == snake.getStartX() && Apple.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++) {
                    g.drawImage(BodyX, snake.getStartX() - ((countBody - i) * snake.getSnakeVx()), snake.getStartY(), null);
                }
                break;

            case 3:
                g.drawImage(SnakeLeft, snake.getStartX(), snake.getStartY(), null);

                if(Apple.getRandomX() == snake.getStartX() && Apple.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++){
                    g.drawImage(BodyX,snake.getStartX() + ((countBody - i) * snake.getSnakeVx()),snake.getStartY(),null);
                }
                break;
        }
    }

    /*public void paintApple(Graphics g) {
        g.drawImage(Apple, snake.getRandomX(), snake.getRandomY(), null);
    }

    public void TakeApple() {
        if (snake.getRandomX() == snake.getStartX() && snake.getRandomY() == snake.getStartY()) {
            snake.setRandomX((int) (Math.random() * 1920));
            snake.setRandomY((int) (Math.random() * 1920));

        }
    }*/

    public boolean isPlaying (){

            if(snake.getStartX() > PanelWidth){
                isPlaying = false;
            }
            if(snake.getStartX() < 0){
                isPlaying = false;
            }
            if(snake.getStartY() > PanelHeight){
                isPlaying = false;
            }
            if(snake.getStartY() < 0){
                isPlaying = false;
            }

        return isPlaying;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w': {
                if(snake.getDirection() != 1){
                    snake.setDirection(0);
                }
                //System.out.println(snake.getDirection());
                //System.out.println("w");
                break;
            }
            case 's': {
                if(snake.getDirection() != 0) {
                    snake.setDirection(1);
                }
                //System.out.println(snake.getDirection());
                //System.out.println("s");
                break;
            }
            case 'd': {
                if(snake.getDirection() != 3)
                snake.setDirection(2);
                //System.out.println(snake.getDirection());
                //System.out.println("d");
                break;
            }
            case 'a': {
                if(snake.getDirection() != 2) {
                    snake.setDirection(3);
                }
                //System.out.println(snake.getDirection());
                //System.out.println("a");
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38: {
                snake.setDirection(0);
                break;
            }
            case 40: {
                snake.setDirection(1);
                break;
            }
            case 39: {
                snake.setDirection(2);
                break;
            }
            case 37: {
                snake.setDirection(3);
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


    @Override
    public void actionPerformed(ActionEvent e) {

            switch (snake.getDirection()) {
                case 0:
                    snake.setStartY(snake.getStartY() - snake.getSnakeVy());
                    break;

                case 1:
                    snake.setStartY(snake.getStartY() + snake.getSnakeVy());
                    break;

                case 2:
                    snake.setStartX(snake.getStartX() + snake.getSnakeVx());
                    break;

                case 3:
                    snake.setStartX(snake.getStartX() - snake.getSnakeVx());
                    break;
            }
            isPlaying();
            repaint();
    }
}