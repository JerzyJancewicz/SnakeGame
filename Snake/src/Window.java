import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends Background implements KeyListener {
    Snake snake = new Snake();
    private int RandomX = (int)(Math.random()*1921);
    private int RandomY = (int)(Math.random()*1001);

    Window() {

        this.addKeyListener(this);

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(snake.StartX, snake.StartY, snake.SnakeWidth, snake.SnakeHeight);
        g.setColor(Color.BLUE);
        g.fillRect(RandomX, RandomY, snake.SnakeWidth, snake.SnakeHeight);
        g.setColor(Color.black);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                snake.StartY = snake.StartY - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() - 10);
                break;
            }
            case 's' : {
                snake.StartY = snake.StartY + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 'd' : {
                snake.StartX = snake.StartX + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 'a' : {
                snake.StartX = snake.StartX - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                snake.StartY = snake.StartY - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() -10);

                break;
            }
            case 40 : {
                snake.StartY = snake.StartY + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 39 : {
                snake.StartX = snake.StartX + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 37 : {
                snake.StartX = snake.StartX - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
