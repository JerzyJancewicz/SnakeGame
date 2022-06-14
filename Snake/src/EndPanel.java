import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndPanel extends JFrame implements ActionListener {

    SnakePanel snakePanel = new SnakePanel();
    Body body = new Body();
    JButton restartButton = new JButton("Restart Game");
    JButton MainMenu = new JButton("Main menu");
    JButton exitButton = new JButton("Exit Game");

    JPanel panel = new JPanel();
    JLabel jLabel = new JLabel();

    //Ustawia Panel końcowy i dodaje do niego funkcjonalne guziki

    EndPanel(){

        this.setSize(snakePanel.PanelWidth, snakePanel.PanelHeight);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Snake");
        this.setIconImage(body.SnakeUp);

        jLabel.setBounds(snakePanel.PanelWidth/2 - 140,100,snakePanel.PanelWidth,100);
        jLabel.setFont(new Font("Word",Font.PLAIN,40));
        jLabel.setBackground(new Color(0,0,0));
        jLabel.setForeground(new Color(122, 173, 65, 255));
        jLabel.setText("YOU LOST!!");

        panel.setSize(new Dimension(snakePanel.PanelWidth, snakePanel.PanelHeight));
        panel.setBackground(new Color(30, 29, 29));
        panel.setLayout(null);
        panel.add(jLabel);

        restartButton.setBounds(snakePanel.PanelWidth/2 - 125,250,200,100);
        restartButton.addActionListener(this);
        restartButton.setBackground(new Color(1,1,1));
        restartButton.setForeground(new Color(255, 255, 255));
        panel.add(restartButton);

        MainMenu.setBounds(snakePanel.PanelWidth/2 - 125,360,200,100);
        MainMenu.addActionListener(this);
        MainMenu.setBackground(new Color(1,1,1));
        MainMenu.setForeground(new Color(255, 255, 255));
        panel.add(MainMenu);

        exitButton.setBounds(snakePanel.PanelWidth/2 - 125,470,200,100);
        exitButton.addActionListener(this);
        exitButton.setBackground(new Color(1,1,1));
        exitButton.setForeground(new Color(255, 255, 255));
        panel.add(exitButton);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == restartButton){
            dispose();
            new Window();
        }
        if(e.getSource() == MainMenu){
            dispose();
            new StartPanel();
        }
        if(e.getSource() == exitButton){
            System.exit(0);
        }
    }
}

