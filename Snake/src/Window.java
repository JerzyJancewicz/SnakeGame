import javax.swing.*;

public class Window extends Snake{

    SnakePanel snakePanel = new SnakePanel();

    Window(){
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setTitle("Snake");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(snakePanel);
        this.addKeyListener(snakePanel);


    }
}