import javax.swing.*;

public class Window extends Snake{

    SnakePanel snakePanel = new SnakePanel();
    //MyThread myThread;
    Window(){
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);

        this.setVisible(true);
        this.setTitle("Snake");
        //this.setLayout(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(snakePanel);
        this.addKeyListener(new SnakePanel());


    }
}