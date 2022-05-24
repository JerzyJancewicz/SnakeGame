import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Snake extends JFrame implements ActionListener, KeyListener {

    private int SnakeWidth = 40;
    private int SnakeHeight = 40;
    private int SnakeVx = 40;
    private int SnakeVy = 40;
    public int StartX = 512;
    public int StartY = 512;
    private int RandomX = (int)(50 + Math.random() * 1871);
    private int RandomY = (int)(50 + Math.random() * 1031);
    private short direction;

    Image head;

    Snake(){
        head = new ImageIcon("J:\\SnakeGame\\SnakeGame\\Snake\\src\\snakeSmaller.png").getImage();
        Timer timer = new Timer(100, this);
        timer.start();
        this.addKeyListener(this);
        }

    public void paint(Graphics g) {
        g.clearRect(0,0,getWidth(),getHeight());
        //g.fillRect(StartX, StartY, SnakeWidth, SnakeHeight);
        //g.setColor(Color.BLUE);
        g.fillRect(RandomX, RandomY, SnakeWidth, SnakeHeight);
        g.setColor(Color.black);

        Graphics2D head2D = (Graphics2D) g;
        head2D.drawImage(head, StartX,StartY,null);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                direction = 0;
                break;
            }
            case 's' : {
                direction = 1;
                break;
            }
            case 'd' : {
                direction = 2;
                break;
            }
            case 'a' : {
                direction = 3;
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                direction = 0;
                break;
            }
            case 40 : {
                direction = 1;
                break;
            }
            case 39 : {
                direction = 2;
                break;
            }
            case 37 : {
                direction = 3;
                break;
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}


    @Override
    public void actionPerformed(ActionEvent e) {

        switch (direction){
            case 0 :if(direction != 1) {
                StartY = StartY - SnakeVy;
            }else break;
            case 1 :if(direction != 0) {
                StartY = StartY + SnakeVy;
            }else break;
            case 2 :if(direction != 3) {
                StartX = StartX + SnakeVx;
            }else break;
            case 3 :if(direction != 2) {
                StartX = StartX - SnakeVx;
            }else break;
        }
        repaint();
    }
}
