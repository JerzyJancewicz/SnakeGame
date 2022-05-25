import javax.swing.*;

public class Snake extends JFrame {

    private int SnakeWidth = 40;
    private int SnakeHeight = 40;
    private int SnakeVx = 40;
    private int SnakeVy = 40;
    private int StartX = 480;
    private int StartY = 480;
    private int RandomX = 45;
    private int RandomY = 45;
    private int Direction;

    public int getRandomX() {
        if(RandomX % 40 == 0){
            return RandomX;
        }else {
            while (RandomX % 40 != 0){
                RandomX = (int) (Math.random() * 1840);
            }
            return RandomX;
        }
    }
    public int getRandomY() {
        if(RandomY % 40 == 0){
            return RandomY;
        }else {
            while (RandomY % 40 != 0){
                RandomY = (int) (Math.random() * 1040);
            }
            return RandomY;
        }
    }
    public void setRandomX(int randomX) {
        RandomX = randomX;
    }
    public void setRandomY(int randomY) {
        RandomY = randomY;
    }

    public int getSnakeWidth() {
        return SnakeWidth;
    }

    public int getSnakeHeight() {
        return SnakeHeight;
    }

    public int getSnakeVx() {
        return SnakeVx;
    }

    public int getSnakeVy() {
        return SnakeVy;
    }

    public int getStartX() {
        return StartX;
    }

    public int getStartY() {
        return StartY;
    }

    public int getDirection() {
        return Direction;
    }

    public void setStartY(int startY) {
        StartY = startY;
    }

    public void setDirection(int direction) {
        Direction = direction;
    }

    public void setStartX(int startX) {
        StartX = startX;
    }

}


