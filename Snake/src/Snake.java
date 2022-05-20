import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Snake extends JFrame implements KeyListener, ActionListener {

    private int SnakeWidth = 40;
    private int SnakeHeight = 40;
    public int StartX = 512;
    public int StartY = 512;
    private int RandomX = (int)(50 + Math.random() * 1871);
    private int RandomY = (int)(50 + Math.random() * 1031);

    Snake() {this.addKeyListener(this);}

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g.fillRect(StartX, StartY, SnakeWidth, SnakeHeight);
        g.setColor(Color.BLUE);
        g.fillRect(RandomX, RandomY, SnakeWidth, SnakeHeight);
        g.setColor(Color.black);
        Timer timer = new Timer(100,this);
        timer.start();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                StartY = StartY - 10;
                break;
            }
            case 's' : {
                StartY = StartY + 10;
                break;
            }
            case 'd' : {
                StartX = StartX + 10;
                break;
            }
            case 'a' : {
                StartX = StartX - 10;
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                StartY = StartY - 10;
                break;
            }
            case 40 : {
                StartY = StartY + 10;
                break;
            }
            case 39 : {
                StartX = StartX + 10;
                break;
            }
            case 37 : {
                StartX = StartX - 10;
                break;
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        StartY = StartY + 10;
        repaint();
    }
}
