import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class label extends JFrame implements KeyListener {

    private int RandomX = (int)(Math.random()*1920);
    private int RandomY = (int)(Math.random()*1080);

    Snake snake = new Snake();

    JLabel RandomLabel;
    JLabel SnakeLabel;

    label(){

        RandomLabel = new JLabel();
        RandomLabel.setBounds(RandomX, RandomY,snake.SnakeWidth,snake.SnakeHeight);
        RandomLabel.setBackground(Color.CYAN);
        RandomLabel.setOpaque(true);

        SnakeLabel = new JLabel();
        SnakeLabel.setBounds(512,512,snake.SnakeWidth,snake.SnakeHeight);
        SnakeLabel.setBackground(Color.BLUE);
        SnakeLabel.setOpaque(true);

        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() - 10);
                break;
            }
            case 's' : {
                SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 'd' : {
                SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 'a' : {
                SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() -10);
                break;
            }
            case 40 : {
                SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 39 : {
                SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 37 : {
                SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
