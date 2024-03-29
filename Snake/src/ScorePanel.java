import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScorePanel extends JFrame implements ActionListener {

    SnakePanel snakePanel = new SnakePanel();
    Body body = new Body();

    JButton exitToMenuButton = new JButton("Main Menu");

    JPanel panel = new JPanel();
    JLabel jLabel = new JLabel();

    //Ustawia Panel poczatkowy i dodaje do niego funkcjonalne guziki

    ScorePanel(){
        this.setSize(snakePanel.PanelWidth, snakePanel.PanelHeight);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Snake");
        this.setIconImage(body.SnakeUp);

        jLabel.setBounds(snakePanel.PanelWidth/2 - 200,125,snakePanel.PanelWidth,100);
        jLabel.setFont(new Font("Word",Font.PLAIN,40));
        jLabel.setBackground(new Color(0,0,0));
        jLabel.setForeground(new Color(122, 173, 65, 255));
        jLabel.setText("The best Score : " + snakePanel.readHighScore());

        panel.add(jLabel);
        panel.setSize(new Dimension(snakePanel.PanelWidth, snakePanel.PanelHeight));
        panel.setBackground(new Color(30, 29, 29));
        panel.setLayout(null);

        exitToMenuButton.setBounds(snakePanel.PanelWidth/2 - 125,340,200,100);
        exitToMenuButton.addActionListener(this);
        exitToMenuButton.setBackground(new Color(1,1,1));
        exitToMenuButton.setForeground(new Color(255, 255, 255));
        panel.add(exitToMenuButton);

        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitToMenuButton){
            dispose();
            new StartPanel();
        }
    }
}