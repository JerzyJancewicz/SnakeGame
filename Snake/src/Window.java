import javax.swing.*;
import java.awt.*;

public class Window extends Snake{

    Window() {

        this.setSize(1920, 1080);
        this.setVisible(true);
        this.setTitle("Snake");
//        this.setLayout(null);

        this.setLayout(new BorderLayout());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panelN = new JPanel();
        JPanel panelE = new JPanel();
        JPanel panelS = new JPanel();
        JPanel panelW = new JPanel();
        JPanel panelF = new JPanel();

        Color colorN = new Color(154, 113, 43);
        Color colorE = new Color(154, 113, 43);
        Color colorS = new Color(103, 72, 13);
        Color colorW = new Color(103, 72, 13);
        Color colorF = new Color(145, 141, 137);

        panelN.setBackground(colorN);
        panelE.setBackground(colorE);
        panelS.setBackground(colorS);
        panelW.setBackground(colorW);
        panelF.setBackground(colorF);

        panelN.setPreferredSize(new Dimension(100, 50));
        panelE.setPreferredSize(new Dimension(50, 100));
        panelS.setPreferredSize(new Dimension(100, 50));
        panelW.setPreferredSize(new Dimension(50, 100));
        panelF.setPreferredSize(new Dimension(100, 100));

        //panelF.setLayout(new BorderLayout());

        this.add(panelN, BorderLayout.NORTH);
        this.add(panelE, BorderLayout.EAST);
        this.add(panelS, BorderLayout.SOUTH);
        this.add(panelW, BorderLayout.WEST);
        this.add(panelF, BorderLayout.CENTER);
    }
}