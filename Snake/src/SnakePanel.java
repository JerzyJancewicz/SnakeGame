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
    private int countApple = 0;
    private String highScore;
    private int countBody = 3;
    private boolean play = true;
    int[] Xtab = new int[1175]; // 1175 jest to maksymalna liczba narysowania sanke w 1920/1080
    int[] Ytab = new int[1175];

    Timer timer = new Timer(80, this);

    // ustawia caly panel i uruchamia gre
    SnakePanel() {
        this.setPreferredSize(new Dimension(PanelWidth, PanelHeight));
        this.setVisible(true);

        timer.start();
        Xtab[0] = snake.getStartX();
        Ytab[0] = snake.getStartY();
    }

    // gromadzi wszystkie metody i je wyswietla
    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());

        background.paintBackGround(g);
        paintSnake(g);
        apple.paintApple(g);
        drawScore(g);
//        highScore = this.readHighScore();
    }

    // wyswietla snakea z koordynatow X i Y z Xtab i Ytab
    // Xtab[0] to jest glowa, reszta to jest cialo
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

    // sprawdza, czy snake nie wyjedzie za plansze i jesli tak to play = false
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

    // sprawdza, czy snake uderzyl w samego siebie
    public void checkCollisions(){
        for(int i = countBody; i > 0; i--) {
            if (Xtab[0] == Xtab[i] && Ytab[0] == Ytab[i]){
                play = false;
            }
        }
    }

    // wyswietla wynik w prawym gornym rogu
    public void drawScore(Graphics g){
        g.setColor(new Color(0,0,0));
        g.drawString("Your score : " + countApple,PanelWidth - 140,  40);
        g.drawString("High Score : " + highScore, PanelWidth - 140, 65);
    }

    // zapisuje do pliku wynik, o ile jest najlepszy
    public void writeHighScore(){
        BufferedWriter bufferedWriter = null;
        File file = new File("highestScore.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
            try {
                bufferedWriter = new BufferedWriter(new FileWriter("highestScore.txt"));
                bufferedWriter.write(this.highScore);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    // odczytuje z pliku najlepszy wynik
    public String readHighScore(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("highestScore.txt"));
            return bufferedReader.readLine();
        } catch (IOException e) {
           return "";
        }
        finally {
            try {
                if(bufferedReader != null)
                bufferedReader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    // sprawdza, czy uzyskany wynik jest najlepszy
    public void checkScore(){
        if(countApple > Integer.parseInt(highScore)){
           highScore = Integer.toString(countApple);
        }
    }

    // po nacisnieciu przycikow w,s,d,a, zmienia kierunek snake
    // i nie pozwala mu isc w druga strone po tej samej linii
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w': {
                if(snake.getDirection() != 1){
                    snake.setDirection(0);
                }
                break;
            }
            case 's': {
                if(snake.getDirection() != 0) {
                    snake.setDirection(1);
                }
                break;
            }
            case 'd': {
                if(snake.getDirection() != 3) {
                    snake.setDirection(2);
                }
                break;
            }
            case 'a': {
                if(snake.getDirection() != 2) {
                    snake.setDirection(3);
                }
                break;
            }
        }
    }

    // dziala na podobnej zasadzie tylko zamiast w,s,d,a sa strzalki
    // dodatkowa opcja gry
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38: {
                if(snake.getDirection() != 1) {
                    snake.setDirection(0);
                }
                    break;

            }
            case 40: {
                if(snake.getDirection() != 0) {
                    snake.setDirection(1);
                }
                    break;

            }
            case 39: {
                if(snake.getDirection() != 3) {
                    snake.setDirection(2);
                }
                    break;

            }
            case 37: {
                if(snake.getDirection() != 2) {
                    snake.setDirection(3);
                }
                    break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    // pozwala na przemieszczanie sie snake (po tablicy) i przemieszcanie sie ciala
    // sprawdza czy czy gracz zebral jablko
    // sprawdza czy mozna grac
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
            apple.setRandomX((int) (Math.random() * 1180));
            apple.setRandomY((int) (Math.random() * 640));
            countBody++;
            countApple++;
        }
        highScore = this.readHighScore();
        repaint();
        checkCollisions();
        if(!isPlaying()){
            checkScore();
            writeHighScore();
            timer.stop();
        }
    }
}