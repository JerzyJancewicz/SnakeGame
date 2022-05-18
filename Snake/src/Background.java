import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Background extends JFrame implements KeyListener {

    private int SnakeWidth = 40;
    private int SnakeHeight = 40;
    public int StartX = 512;
    public int StartY = 512;
    private int RandomX = (int)(Math.random()*1921);
    private int RandomY = (int)(Math.random()*1001);

    public int getStartX() {
        return StartX;
    }

    public int getStartY() {
        return StartY;
    }

    Background() {this.addKeyListener(this);}

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(StartX, StartY, SnakeWidth, SnakeHeight);
        g.setColor(Color.BLUE);
        g.fillRect(RandomX, RandomY, SnakeWidth, SnakeHeight);
        g.setColor(Color.black);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                StartY = StartY - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() - 10);
                break;
            }
            case 's' : {
                StartY = StartY + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 'd' : {
                StartX = StartX + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 'a' : {
                StartX = StartX - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                StartY = StartY - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() -10);

                break;
            }
            case 40 : {
                StartY = StartY + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 39 : {
                StartX = StartX + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 37 : {
                StartX = StartX - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
