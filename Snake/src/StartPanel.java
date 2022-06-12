
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class StartPanel extends JFrame implements ActionListener {

        SnakePanel snakePanel = new SnakePanel();
        JButton startButton = new JButton("Start Game");
        JButton statisticButton = new JButton("Chek the best score");
        JButton exitButton = new JButton("Exit Game");

        ImageIcon snakeStart;

        JPanel panel = new JPanel();
        JLabel jLabel = new JLabel();

        //Ustawia Panel poczatkowy i dodaje do niego funkcjonalne guziki

        StartPanel(){
            snakeStart = new ImageIcon("Snake/src/Photos/images.png");

            this.setSize(snakePanel.PanelWidth, snakePanel.PanelHeight);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setTitle("Snake");

            jLabel.setIcon(snakeStart);
            jLabel.setBounds(snakePanel.PanelWidth/2 - 215, 70,400,130);

            panel.setSize(new Dimension(snakePanel.PanelWidth, snakePanel.PanelHeight));
            panel.setBackground(new Color(30, 29, 29));
            panel.setLayout(null);
            panel.add(jLabel);

            startButton.setBounds(snakePanel.PanelWidth/2 - 125,250,200,100);
            startButton.addActionListener(this);
            startButton.setBackground(new Color(1,1,1));
            startButton.setForeground(new Color(255, 255, 255));
            panel.add(startButton);

            statisticButton.setBounds(snakePanel.PanelWidth/2 - 125,360,200,100);
            statisticButton.addActionListener(this);
            statisticButton.setBackground(new Color(1,1,1));
            statisticButton.setForeground(new Color(255, 255, 255));
            panel.add(statisticButton);

            exitButton.setBounds(snakePanel.PanelWidth/2 - 125,470,200,100);
            exitButton.addActionListener(this);
            exitButton.setBackground(new Color(1,1,1));
            exitButton.setForeground(new Color(255, 255, 255));
            panel.add(exitButton);

            this.add(panel);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == startButton){
                dispose();
                new Window();
            }
            if(e.getSource() == statisticButton){
                dispose();
                new ScorePanel();
            }
            if(e.getSource() == exitButton){
                System.exit(0);
            }
        }
    }

