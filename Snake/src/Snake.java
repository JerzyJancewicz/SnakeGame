import javax.swing.*;
import java.awt.*;


public class Snake extends JFrame {

    protected int SnakeWidth = 40;
    protected int SnakeHeight = 40;

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

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(75, 120, 43));
        g.fillRect(512,512,SnakeWidth,SnakeHeight);

    }
}
