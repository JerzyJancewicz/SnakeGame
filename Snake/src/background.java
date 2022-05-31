import javax.swing.*;
import java.awt.*;

public class background extends JPanel {

    public void paintBackGround(Graphics g) {
        int i = 0;
        for (int z = 0; z < 28; z++) {
            while (i != 48) {
                if (z % 2 != 0) {
                    if (i % 2 == 0) {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyC"));
                        i++;
                    } else {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyJ"));
                        i++;
                    }
                } else {
                    if (i % 2 != 0) {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyC"));
                        i++;
                    } else {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("brazowyJ"));
                        i++;
                    }
                }
            }
            i = 0;

            if (z % 2 != 0) {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("brazowyC"));
            } else {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("brazowyJ"));
            }
        }
        g.fillRect(40, 0, 40, 40);
        g.setColor(getColor("brazowyJ"));
        g.fillRect(0, 0, 40, 40);
        g.setColor(getColor("brazowyC"));
    }

    public Color getColor(String color) {
        Color color1;
        switch (color) {
            case "brazowyJ":
                color1 = new Color(158, 140, 122);
                break;
            case "brazowyC":
                color1 = new Color(211, 209, 204);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
        return color1;
    }
}
