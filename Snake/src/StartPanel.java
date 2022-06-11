
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class StartPanel extends JFrame implements ActionListener {

        SnakePanel snakePanel = new SnakePanel();
        JButton startButton = new JButton("Start Game");
        JButton statisticButton = new JButton("Chek the best score");
        JButton exitButton = new JButton("Exit Game");

        //Ustawia Panel poczatkowy i dodaje do niego funkcjonalne guziki

        JPanel panel = new JPanel();

        StartPanel(){
            this.setSize(snakePanel.PanelWidth,snakePanel.PanelHeight);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLayout(null);
            this.setLocationRelativeTo(null);

            panel.setSize(new Dimension(snakePanel.PanelWidth,snakePanel.PanelHeight));
            panel.setBackground(new Color(30, 29, 29));
            //panel.setLayout();

            startButton.setBounds(600,240,200,100);
            startButton.addActionListener(this);
            startButton.setBackground(new Color(1,1,1));
            startButton.setForeground(new Color(255, 255, 255));
            panel.add(startButton);

            statisticButton.setBounds(600,340,200,100);
            statisticButton.addActionListener(this);
            statisticButton.setBackground(new Color(1,1,1));
            statisticButton.setForeground(new Color(255, 255, 255));
            panel.add(statisticButton);

            exitButton.setBounds(600,440,200,100);
            exitButton.addActionListener(this);
            exitButton.setBackground(new Color(1,1,1));
            exitButton.setForeground(new Color(255, 255, 255));
            panel.add(exitButton);

            this.add(panel);
        /*statisticButton.setFocusable(false);
        startButton.setFocusable(false);*/
        }

        // jesli nacisniemy na guzik, otworzy sie okno z gra
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == startButton){
                dispose();
                new Window();
            }
            if(e.getSource() == statisticButton){

            }
            if(e.getSource() == exitButton){
                System.exit(0);
            }
        }
    }

