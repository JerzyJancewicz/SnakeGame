import javax.swing.*;

public class Window extends JFrame{

    SnakePanel snakePanel = new SnakePanel();

    // dodaje KeyListener do Windowa i calego snakepanela
    Window(){
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setTitle("Snake");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.add(new StartPanel());

        this.addKeyListener(snakePanel);


    }
}