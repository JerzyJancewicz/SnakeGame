import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Move extends Snake implements KeyListener{

    public Move() {
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {

                label.setLocation(label.getX(), label.getY() -10);
                    break;
            }
            case 's' : {
                label.setLocation(label.getX(), label.getY() +10);
                    break;
            }
            case 'd' : {
                label.setLocation(label.getX() + 10, label.getY());
                    break;
            }
            case 'a' : {
                label.setLocation(label.getX() - 10, label.getY());
                    break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
