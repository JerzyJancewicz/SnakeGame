import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndPanel extends JFrame implements ActionListener {

    SnakePanel snakePanel = new SnakePanel();
    JButton exitButton = new JButton("Exit Game");
    JButton statisticButton = new JButton("Chek the best score");
    JButton restartButton = new JButton("Restart Game");

    // ustawia panel koncowy i funkcjonalne guziki
    EndPanel(){
        this.setBackground(new Color(68, 66, 66));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setLayout(null);
        this.add(statisticButton);
        this.add(exitButton);
        this.add(restartButton);

        exitButton.setBounds(600,240,200,100);
        exitButton.addActionListener(this);
        statisticButton.setBounds(600,340,200,100);
        statisticButton.addActionListener(this);
        restartButton.setBounds(600,440,200,100);
        restartButton.addActionListener(this);

        statisticButton.setFocusable(false);
        exitButton.setFocusable(false);
        restartButton.setFocusable(false);
    }


    // sprawia, ze guziki sa funkcjonalne
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitButton){
            System.exit(0);
        }
        if(e.getSource() == statisticButton){

        }
        if(e.getSource() == restartButton){
            Window window = new Window();
        }
    }
}