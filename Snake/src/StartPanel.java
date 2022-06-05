import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JFrame implements ActionListener {

    SnakePanel snakePanel = new SnakePanel();
    JButton startButton = new JButton("Start Game");
    JButton statisticButton = new JButton("Chek the best score");

    StartPanel(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setLayout(null);
        this.add(statisticButton);
        this.add(startButton);


        startButton.setBounds(600,240,200,100);
        startButton.addActionListener(this);
        statisticButton.setBounds(600,340,200,100);
        statisticButton.addActionListener(this);

        statisticButton.setFocusable(false);
        startButton.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton){
            Window window = new Window();
        }
        if(e.getSource() == statisticButton){
        }
    }
}
