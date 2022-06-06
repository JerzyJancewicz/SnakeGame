import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel implements ActionListener {

    SnakePanel snakePanel = new SnakePanel();
    JButton startButton = new JButton("Start Game");
    JButton statisticButton = new JButton("Chek the best score");
    JButton exitButton = new JButton("Exit Game");

    //Ustawia Panel poczatkowy i dodaje do niego funkcjonalne guziki
    StartPanel(){
        this.setBackground(new Color(68, 66, 66));
        this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
        this.setVisible(true);
        this.setLayout(null);
        this.add(statisticButton);
        this.add(startButton);
        this.add(exitButton);


        startButton.setBounds(600,240,200,100);
        startButton.addActionListener(this);
        statisticButton.setBounds(600,340,200,100);
        statisticButton.addActionListener(this);
        exitButton.setBounds(600,440,200,100);
        exitButton.addActionListener(this);

        /*statisticButton.setFocusable(false);
        startButton.setFocusable(false);*/
    }

    // jesli nacisniemy na guzik, otworzy sie okno z gra
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton){
            this.add(snakePanel);
        }
        if(e.getSource() == statisticButton){
        }
        if(e.getSource() == exitButton){
            System.exit(0);
        }
    }
}
