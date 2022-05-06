import javax.swing.*;
import java.awt.*;


public class Snake extends JFrame {

    protected int SnakeWidth = 40;
    protected int SnakeHeight = 40;

    private int x = 512;
    private int y = 512;

    public int getSnakeWidth() {
        return SnakeWidth;
    }

    public int getSnakeHeight() {
        return SnakeHeight;
    }

    Snake() {
        this.setSize(1920, 1080);
        this.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void Move(String move){
        switch (move) {
            case "w" : {
                y += 45;
            }
            case "s" : {
                y -= 45;
            }
            case "d" : {
                x += 45;
            }
            case "a" : {
                x -= 45;
            }
        }
    }

    public void paint(Graphics g){
            super.paint(g);
            g.setColor(new Color(75, 120, 43));
            g.fillRect(x,y,SnakeWidth,SnakeHeight);
    }
}
