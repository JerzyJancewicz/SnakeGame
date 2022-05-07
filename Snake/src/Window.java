import javax.swing.*;

public class Window extends label {

    Window() {
        this.setSize(1920, 1080);
        this.setVisible(true);
        this.setTitle("Snake");
        this.setLayout(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.add(RandomLabel);
        this.add(SnakeLabel);
    }
}
