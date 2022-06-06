import javax.swing.*;
import java.awt.*;

public class Background extends JPanel {

    // ciekawy algorytm na robienie kratki do snake
    public void paintBackGround(Graphics g) {
        int i = 0;
        for (int z = 0; z < 28; z++) { // 28 - liczba kratek mieszczaca sie w 1080 po Y
            while (i != 48) { // 48 liczba kratek mieszczacych sie w 1920 po X
                if (z % 2 != 0) { // Nieparzyste z
                    if (i % 2 == 0) { // Nieparzyste i
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
            i = 0; // zresetowanie i

            // Naprawa bledu wynikajacego z powyzszego kodu
            if (z % 2 != 0) {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("Kolor2"));
            } else {
                g.fillRect(0, z * 40 + 40, 40, 40);
                g.setColor(getColor("Kolor1"));
            }
        }
        // rysowanie 2 kratek na pozycji (40,0) i (0,0)
        g.fillRect(40, 0, 40, 40);
        g.setColor(getColor("Kolor1"));
        g.fillRect(0, 0, 40, 40);
        g.setColor(getColor("Kolor2"));
    }

    // zwraca kolor zainicjalizowany case
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
                return color1 = new Color(0,0,0);
        }
        return color1;
    }
}
