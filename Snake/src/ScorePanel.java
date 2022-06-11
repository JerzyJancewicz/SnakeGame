import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JFrame {
    SnakePanel snakePanel = new SnakePanel();

    ScorePanel () {
        this.setSize(new Dimension(snakePanel.PanelWidth,snakePanel.PanelHeight));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
