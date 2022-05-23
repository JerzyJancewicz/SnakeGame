import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Snake extends JFrame implements ActionListener, KeyListener {

    private int SnakeWidth = 40;
    private int SnakeHeight = 40;
    private int SnakeVx = 5;
    private int SnakeVy = 1;
    public int StartX = 512;
    public int StartY = 512;
    private int RandomX = (int)(50 + Math.random() * 1871);
    private int RandomY = (int)(50 + Math.random() * 1031);
    boolean ChangeDirectionUP = false;
    boolean ChangeDirectionDOWN = false;
    boolean ChangeDirectionRIGHT = false;
    boolean ChangeDirectionLEFT = false;
    private short direction;

    Image head;

    Snake() {
        head = new ImageIcon("snake.png").getImage();
        Timer timer = new Timer(20, this);
        timer.start();
        this.addKeyListener(this);
        }

    public void paint(Graphics g) {
        g.clearRect(0,0,getWidth(),getHeight());
        g.fillRect(StartX, StartY, SnakeWidth, SnakeHeight);
        g.setColor(Color.BLUE);
        g.fillRect(RandomX, RandomY, SnakeWidth, SnakeHeight);
        g.setColor(Color.black);


        /*Graphics2D head2D = (Graphics2D) g;
        head2D.drawImage(head, StartX,StartY,null);*/
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                ChangeDirectionUP = true;
                ChangeDirectionDOWN = false;
                ChangeDirectionLEFT = false;
                ChangeDirectionRIGHT = false;
                break;
            }
            case 's' : {
                ChangeDirectionUP = false;
                ChangeDirectionDOWN = true;
                ChangeDirectionLEFT = false;
                ChangeDirectionRIGHT = false;
                break;
            }
            case 'd' : {
                ChangeDirectionUP = false;
                ChangeDirectionDOWN = false;
                ChangeDirectionLEFT = false;
                ChangeDirectionRIGHT = true;
                break;
            }
            case 'a' : {
                ChangeDirectionUP = false;
                ChangeDirectionDOWN = false;
                ChangeDirectionLEFT = true;
                ChangeDirectionRIGHT = false;
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


        if(ChangeDirectionUP == true){
            StartX = StartX + SnakeVx;
        } else if(ChangeDirectionDOWN = true){
            StartX = StartX - SnakeVx;
        }
        if(ChangeDirectionLEFT == true){
            StartY = StartY + SnakeVy;
        }else {
            StartY = StartY - SnakeVy;
        }
        repaint();
    }
}
