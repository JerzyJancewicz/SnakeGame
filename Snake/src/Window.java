import javax.swing.*;

public class Window extends JFrame{

    SnakePanel snakePanel = new SnakePanel();

    Body body = new Body();

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

    }
}