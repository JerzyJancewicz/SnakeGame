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
    Image Apple;
    Image BodyX;
    Image BodyY;

    Snake snake = new Snake();

    public int PanelWidth = 1920;
    public int PanelHeight = 1080;
    private int countApple = 1;
    private int countBody = 1;
    private int BodyPositionMinus = snake.getStartY() - (countApple * 40);
    private int BodyPositionPlus = snake.getStartY() + (countApple * 40);

    SnakePanel() {
        SnakeRight = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\head_right.png").getImage();
        SnakeLeft = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\head_left.png").getImage();
        SnakeUp = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\head_up.png").getImage();
        SnakeDown = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\head_down.png").getImage();
        Apple = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\apple.png").getImage();
        BodyX = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\body_horizontal.png").getImage();
        BodyY = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\body_vertical.png").getImage();

        this.setPreferredSize(new Dimension(PanelWidth, PanelHeight));
        this.setVisible(true);
        Timer timer = new Timer(80, this);
        timer.start();

        if (!isPlaying()){
            timer.stop();
        }
    }

    public void paint(Graphics g) {
        //super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());
        paintBackGround(g);

        paintApple(g);
        paintSnake(g);
        TakeApple(g);

    }

    public void paintSnake(Graphics g) {

        switch (snake.getDirection()) {
            case 0:
                g.drawImage(SnakeUp, snake.getStartX(), snake.getStartY(), null);

                if(snake.getRandomX() == snake.getStartX() && snake.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++){

                    g.drawImage(BodyY,snake.getStartX(),snake.getStartY() + ((countBody - i) * snake.getSnakeVy()),null);
                }
                break;

            case 1:
                g.drawImage(SnakeDown, snake.getStartX(), snake.getStartY(), null);

                if(snake.getRandomX() == snake.getStartX() && snake.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++){
                    g.drawImage(BodyY,snake.getStartX(),snake.getStartY() - ((countBody - i) * snake.getSnakeVy()),null);
                }
                break;

            case 2:
                g.drawImage(SnakeRight, snake.getStartX(), snake.getStartY(), null);

                if(snake.getRandomX() == snake.getStartX() && snake.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++) {
                    g.drawImage(BodyX, snake.getStartX() - ((countBody - i) * snake.getSnakeVx()), snake.getStartY(), null);
                }
                break;

            case 3:
                g.drawImage(SnakeLeft, snake.getStartX(), snake.getStartY(), null);

                if(snake.getRandomX() == snake.getStartX() && snake.getRandomY() == snake.getStartY()){
                    countBody++;
                    countApple++;
                }

                for(int i = 0; i < countBody; i++){
                    g.drawImage(BodyX,snake.getStartX() + ((countBody - i) * snake.getSnakeVx()),snake.getStartY(),null);
                }
                break;
        }
    }

    public void paintApple(Graphics g) {
        g.drawImage(Apple, snake.getRandomX(), snake.getRandomY(), null);
    }

    public void paintBackGround(Graphics g) {
        int i = 0;
        for (int z = 0; z < 28; z++) {
            while (i != 48) {
                if (z % 2 != 0) {
                    if (i % 2 == 0) {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyC"));
                        i++;
                    } else {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyJ"));
                        i++;
                    }
                } else {
                    if (i % 2 != 0) {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyC"));
                        i++;
                    } else {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyJ"));
                        i++;
                    }
                }
            }
            i = 0;

            if (z % 2 != 0) {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("brazowyC"));
            } else {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("brazowyJ"));
            }
        }
        g.fillRect(40, 0, 40, 40);
        g.setColor(getColor("brazowyJ"));
        g.fillRect(0, 0, 40, 40);
        g.setColor(getColor("brazowyC"));
    }

    public Color getColor(String color) {
        Color color1;
        switch (color) {
            case "brazowyJ":
                color1 = new Color(169, 122, 73);
                break;
            case "brazowyC":
                color1 = new Color(122, 89, 33);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
        return color1;
    }

    public void TakeApple(Graphics g) {
        if (snake.getRandomX() == snake.getStartX() && snake.getRandomY() == snake.getStartY()) {
            snake.setRandomX((int) (Math.random() * 1920));
            snake.setRandomY((int) (Math.random() * 1920));

        }
    }

    public boolean isPlaying (){
        boolean isPlaying = true;

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
                snake.setDirection(0);
                //System.out.println(snake.getDirection());
                //System.out.println("w");
                break;
            }
            case 's': {
                snake.setDirection(1);
                //System.out.println(snake.getDirection());
                //System.out.println("s");
                break;
            }
            case 'd': {
                snake.setDirection(2);
                //System.out.println(snake.getDirection());
                //System.out.println("d");
                break;
            }
            case 'a': {
                snake.setDirection(3);
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
            repaint();
    }
}