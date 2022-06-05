import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class SnakePanel extends JPanel implements KeyListener, ActionListener{

    Snake snake = new Snake();
    Background background = new Background();
    Apple apple = new Apple();
    Body body = new Body();

    public int PanelWidth = 1220;
    public int PanelHeight = 680;
    private int countApple = 1;
    private int highScore;
    private int ReadHighScore;
    private int countBody = 3;
    private boolean play = true;
    int[] Xtab = new int[1175];
    int[] Ytab = new int[1175];

    Timer timer = new Timer(80, this);

    SnakePanel() {
        this.setPreferredSize(new Dimension(PanelWidth, PanelHeight));
        this.setVisible(true);

        timer.start();
        Xtab[0] = snake.getStartX();
        Ytab[0] = snake.getStartY();
        readHighScore();
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());

        background.paintBackGround(g);
        paintSnake(g);
        apple.paintApple(g);
        drawScore(g);

    }

    public void paintSnake(Graphics g) {

        for (int j = 0; j < countBody; j++) {
            if (j == 0) {
                switch (snake.getDirection()) {
                    case 0:
                        g.drawImage(body.SnakeUp, snake.getStartX(), snake.getStartY(), null);
                        break;
                    case 1:
                        g.drawImage(body.SnakeDown, snake.getStartX(), snake.getStartY(), null);
                        break;
                    case 2:
                        g.drawImage(body.SnakeRight, snake.getStartX(), snake.getStartY(), null);
                        break;
                    case 3:
                        g.drawImage(body.SnakeLeft, snake.getStartX(), snake.getStartY(), null);
                        break;
                }
            } else {
                if (Xtab[j] == Xtab[j - 1]) {
                    g.drawImage(body.body_vertical, Xtab[j], Ytab[j], null);
                } else {
                    g.drawImage(body.body_horizontal, Xtab[j], Ytab[j], null);
                }
            }
        }
    }

    public boolean isPlaying() {

        if (snake.getStartX() >= PanelWidth - 40) {
            play = false;
        }
        if (snake.getStartX() <= -40) {
            play = false;
        }
        if (snake.getStartY() >= PanelHeight - 40) {
            play = false;
        }
        if (snake.getStartY() <= -40) {
            play = false;
        }

        return play;
    }

    public void checkCollisions(){
        for(int i = countBody; i > 0; i--) {
            if (Xtab[0] == Xtab[i] && Ytab[0] == Ytab[i]){
                play = false;
            }
        }
    }

    public void drawScore(Graphics g){
        g.drawString("Your score : " + countApple,40,PanelHeight - 40);
        g.drawString("High Score : " +highScore, 40,PanelHeight - 80);
    }

    public void writeHighScore(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("score.txt"));
            if(countApple > highScore) {
                countApple = highScore;
                bufferedWriter.write(highScore);
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readHighScore(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("score.txt"));
            highScore = Integer.parseInt(bufferedReader.readLine());
                bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w': {
                if(snake.getDirection() != 1){
                    snake.setDirection(0);
                }
                //System.out.println(snake.getDirection());
                //System.out.println("w");
                break;
            }
            case 's': {
                if(snake.getDirection() != 0) {
                    snake.setDirection(1);
                }
                //System.out.println(snake.getDirection());
                //System.out.println("s");
                break;
            }
            case 'd': {
                if(snake.getDirection() != 3)
                snake.setDirection(2);
                //System.out.println(snake.getDirection());
                //System.out.println("d");
                break;
            }
            case 'a': {
                if(snake.getDirection() != 2) {
                    snake.setDirection(3);
                }
                //System.out.println(snake.getDirection());
                //System.out.println("a");
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38: {
                snake.setDirection(0);
                break;
            }
            case 40: {
                snake.setDirection(1);
                break;
            }
            case 39: {
                snake.setDirection(2);
                break;
            }
            case 37: {
                snake.setDirection(3);
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = countBody; i > 0; i--){
            Xtab[i] = Xtab[i - 1];
            Ytab[i] = Ytab[i - 1];
        }

        switch (snake.getDirection()) {
            case 0:
                snake.setDirection(0);
                snake.setStartY(snake.getStartY() - snake.getSnakeVy());
                Ytab[0] = snake.getStartY();
                break;

            case 1:
                snake.setDirection(1);
                snake.setStartY(snake.getStartY() + snake.getSnakeVy());
                Ytab[0] = snake.getStartY();
                break;

            case 2:
                snake.setDirection(2);
                snake.setStartX(snake.getStartX() + snake.getSnakeVx());
                Xtab[0] = snake.getStartX();
                break;

            case 3:
                snake.setDirection(3);
                snake.setStartX(snake.getStartX() - snake.getSnakeVx());
                Xtab[0] = snake.getStartX();
                break;
        }

        if(apple.getRandomX() == snake.getStartX() && apple.getRandomY() == snake.getStartY()){
            apple.setRandomX((int) (Math.random() * 1880));
            apple.setRandomY((int) (Math.random() * 1000));
            countBody++;
            countApple++;
        }
        repaint();
        checkCollisions();
        if(!isPlaying()){
            writeHighScore();
            timer.stop();
            /*while (!isPlaying()){
                EndPanel endPanel = new EndPanel();
                        break;
            }*/
        }
    }
}