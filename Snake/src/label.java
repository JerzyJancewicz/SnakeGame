import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class label extends Window implements KeyListener{

    /*private int RandomX = (int)(Math.random()*1921);
    private int RandomY = (int)(Math.random()*1081);*/

    //Snake snake = new Snake();

    /*

    JLabel RandomLabel;
    JLabel SnakeLabel;
    MyThread myThread;
*/

    label(){
        /*
        RandomLabel = new JLabel();
        RandomLabel.setBounds(RandomX, RandomY,snake.SnakeWidth,snake.SnakeHeight);
        RandomLabel.setBackground(Color.BLACK);
        RandomLabel.setOpaque(true);

        SnakeLabel = new JLabel();
        SnakeLabel.setBounds(snake.StartX,snake.StartY,snake.SnakeWidth,snake.SnakeHeight);
        SnakeLabel.setBackground(Color.BLUE);
        SnakeLabel.setOpaque(true);
        */
        /*this.addKeyListener(this);*/

        //myThread = new MyThread();
        //this.myThread.start();


    }

    /*public void paint(Graphics g){
        super.paint(g);
        g.fillRect(snake.StartX,snake.StartY,snake.SnakeWidth,snake.SnakeHeight);
        g.setColor(Color.BLUE);
        g.fillRect(RandomX,RandomY,snake.SnakeWidth,snake.SnakeHeight);
        g.setColor(Color.black);
    }*/

    /*@Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' : {
                snake.StartY = snake.StartY + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() - 10);
                break;
            }
            case 's' : {
                snake.StartY = snake.StartY - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 'd' : {
                snake.StartX = snake.StartX - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 'a' : {
                snake.StartX = snake.StartX + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 : {
                snake.StartY = snake.StartY + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() -10);

                break;
            }
            case 40 : {
                snake.StartY = snake.StartY - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX(), SnakeLabel.getY() +10);
                break;
            }
            case 39 : {
                snake.StartX = snake.StartX - 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() + 10, SnakeLabel.getY());
                break;
            }
            case 37 : {
                snake.StartX = snake.StartX + 10;
                //SnakeLabel.setLocation(SnakeLabel.getX() - 10, SnakeLabel.getY());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}*/


}
