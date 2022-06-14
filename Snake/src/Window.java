import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    SnakePanel snakePanel = new SnakePanel();

    Body body = new Body();
    Timer timer;
    // dodaje KeyListener do Windowa i calego snakepanela
    Window(){
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setTitle("Snake");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(body.SnakeUp);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.add(snakePanel);
        this.addKeyListener(snakePanel);
        timer = new Timer(80,this);
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!snakePanel.isPlaying()){
            timer.stop();
            dispose();
            new EndPanel();
        }
    }
}