import javax.swing.*;
import java.awt.*;

public class Background extends JPanel {

    public void paintBackGround(Graphics g) {
        int i = 0;
        for (int z = 0; z < 28; z++) {
            while (i != 48) {
                if (z % 2 != 0) {
                    if (i % 2 == 0) {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("Kolor2"));
                        i++;
                    } else {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("Kolor1"));
                        i++;
                    }
                } else {
                    if (i % 2 != 0) {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("Kolor2"));
                        i++;
                    } else {
                        g.fillRect((i * 40) + 40, z * 40, 40, 40);
                        g.setColor(getColor("Kolor1"));
                        i++;
                    }
                }
            }
            i = 0;

            if (z % 2 != 0) {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("Kolor2"));
            } else {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("Kolor1"));
            }
        }
        g.fillRect(40, 0, 40, 40);
        g.setColor(getColor("Kolor1"));
        g.fillRect(0, 0, 40, 40);
        g.setColor(getColor("Kolor2"));
    }

    public Color getColor(String color) {
        Color color1;
        switch (color) {
            case "Kolor1":
                color1 = new Color(157, 173, 99);
                break;
            case "Kolor2":
                color1 = new Color(194, 180, 140);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
        return color1;
    }
}
