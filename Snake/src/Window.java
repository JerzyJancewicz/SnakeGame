import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Window extends JFrame {

    Window() {
        this.setSize(1920, 1080);
        this.setVisible(true);
        this.setTitle("Snake");
        this.setLayout(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
