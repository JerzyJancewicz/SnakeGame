import javax.swing.*;

public class Window extends JFrame{

    SnakePanel snakePanel = new SnakePanel();
    //StartPanel startPanel;
    // dodaje KeyListener do Windowa i calego snakepanela
    Window(){
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setTitle("Snake");
        this.setResizable(false);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //this.startPanel = new StartPanel(this);
        //this.add(startPanel);
        this.add(snakePanel);
        this.addKeyListener(snakePanel);
    }
}