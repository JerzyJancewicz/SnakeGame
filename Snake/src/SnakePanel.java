import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakePanel extends JPanel implements ActionListener, KeyListener {

    Image SnakeHead;
    Snake snake = new Snake();
    public int PanelWidth = 1920;
    public int PanelHeight = 1080;

    SnakePanel() {
        SnakeHead = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\snakeSmaller.png").getImage();
        this.setPreferredSize(new Dimension(PanelWidth,PanelHeight));
        this.setVisible(true);
        this.setBackground(Color.black);
//        this.addKeyListener(this);
        Timer timer = new Timer(1000, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0,0,getWidth(),getHeight());
        /*Graphics2D head2D = (Graphics2D) g;
        head2D.drawImage(SnakeHead, snake.StartX,snake.StartY,null);*/
        paintSnake(g);
        paintApple(g);
    }

    public void paintSnake(Graphics g){
        g.fillRect(snake.getStartX(), snake.getStartY(), snake.getSnakeWidth(), snake.getSnakeHeight());
        g.drawImage(SnakeHead,snake.getStartX(),snake.getStartY(),null);
        g.setColor(Color.BLUE);
    }

    public void paintApple(Graphics g){
        g.fillRect(snake.getRandomX(), snake.getRandomY(), snake.getSnakeWidth(), snake.getSnakeHeight());
        g.setColor(Color.black);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                snake.setDirection(0);
                System.out.println("w");
                break;
            }
            case 's' : {
                snake.setDirection(1);
                System.out.println("s");
                break;
            }
            case 'd' : {
                snake.setDirection(2);
                System.out.println("d");
                break;
            }
            case 'a' : {
                snake.setDirection(3);
                System.out.println("a");
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                snake.setDirection(0);
                break;
            }
            case 40 : {
                snake.setDirection(1);
                break;
            }
            case 39 : {
                snake.setDirection(2);
                break;
            }
            case 37 : {
                snake.setDirection(3);
                break;
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}


    @Override
    public void actionPerformed(ActionEvent e) {

        switch (snake.getDirection()){
            case 0 :if(snake.getDirection() != 1) {
                snake.setStartY(snake.getStartY() - snake.getSnakeVy());
            }else break;
            case 1 :if(snake.getDirection() != 0) {
                snake.setStartY(snake.getStartY() + snake.getSnakeVy());
            }else break;
            case 2 :if(snake.getDirection() != 3) {
                snake.setStartX(snake.getStartX() - snake.getSnakeVx());
            }else break;
            case 3 :if(snake.getDirection() != 2) {
                snake.setStartX(snake.getStartX() + snake.getSnakeVx());
            }else break;
        }
        repaint();
    }
}
