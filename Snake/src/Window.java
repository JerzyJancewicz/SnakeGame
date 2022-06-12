import javax.swing.*;

public class Window extends JFrame{

    SnakePanel snakePanel = new SnakePanel();

    // dodaje KeyListener do Windowa i calego snakepanela
    Window(){
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setTitle("Snake");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.add(snakePanel);
        this.addKeyListener(snakePanel);
    }
}