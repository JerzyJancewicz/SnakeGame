import javax.swing.*;
import java.awt.*;

public class Body extends JPanel {

    Image SnakeRight;
    Image SnakeLeft;
    Image SnakeUp;
    Image SnakeDown;
    Image body_horizontal;
    Image body_vertical;
    Image body_topRight;
    Image body_topLeft;
    Image body_bottomRight;
    Image body_bottomLeft;
    Image tail_up;
    Image tail_down;
    Image tail_right;
    Image tail_left;

    Body(){

        SnakeRight = new ImageIcon("Snake/src/Photos/head_right.png").getImage();
        SnakeLeft = new ImageIcon("Snake/src/Photos/head_left.png").getImage();
        SnakeUp = new ImageIcon("Snake/src/Photos/head_up.png").getImage();
        SnakeDown = new ImageIcon("Snake/src/Photos/head_down.png").getImage();
        body_horizontal = new ImageIcon("Snake/src/Photos/body_horizontal.png").getImage();
        body_vertical = new ImageIcon("Snake/src/Photos/body_vertical.png").getImage();
        body_topLeft = new ImageIcon("Snake/src/Photos/body_topLeft.png").getImage();
        body_topRight = new ImageIcon("Snake/src/Photos/body_topRight.png").getImage();
        body_bottomLeft = new ImageIcon("Snake/src/Photos/body_bottomLeft.png").getImage();
        body_bottomRight = new ImageIcon("Snake/src/Photos/body_bottomRight.png").getImage();
        tail_up = new ImageIcon("Snake/src/Photos/tail_up.png").getImage();
        tail_down = new ImageIcon("Snake/src/Photos/tail_down.png").getImage();
        tail_left = new ImageIcon("Snake/src/Photos/tail_left.png").getImage();
        tail_right = new ImageIcon("Snake/src/Photos/tail_right.png").getImage();
    }
}