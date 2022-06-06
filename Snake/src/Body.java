import javax.swing.*;
import java.awt.*;

public class Body extends JPanel {

    Image SnakeRight;
    Image SnakeLeft;
    Image SnakeUp;
    Image SnakeDown;
    Image body_horizontal;
    Image body_vertical;

    // inicjalizuje obrazki glowy i ciala snake
    Body(){
        SnakeRight = new ImageIcon("Snake/src/Photos/head_right.png").getImage();
        SnakeLeft = new ImageIcon("Snake/src/Photos/head_left.png").getImage();
        SnakeUp = new ImageIcon("Snake/src/Photos/head_up.png").getImage();
        SnakeDown = new ImageIcon("Snake/src/Photos/head_down.png").getImage();
        body_horizontal = new ImageIcon("Snake/src/Photos/body_horizontal.png").getImage();
        body_vertical = new ImageIcon("Snake/src/Photos/body_vertical.png").getImage();
    }
}