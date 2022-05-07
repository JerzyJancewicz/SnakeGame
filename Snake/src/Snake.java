import javax.swing.*;
import java.awt.*;


public class Snake extends Window{

    protected int SnakeWidth = 40;
    protected int SnakeHeight = 40;

    JLabel label;

    public Snake() {

        label = new JLabel();
        label.setBounds(512,512,SnakeWidth,SnakeHeight);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        this.add(label);
    }





}
