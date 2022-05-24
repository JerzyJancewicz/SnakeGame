import javax.swing.*;


public class Snake extends JFrame{

    private int SnakeWidth = 40;
    private int SnakeHeight = 40;
    private int SnakeVx = 40;
    private int SnakeVy = 40;
    private int StartX = 512;
    private int StartY = 512;
    private int RandomX = (int)(50 + Math.random() * 1871);
    private int RandomY = (int)(50 + Math.random() * 1031);
    private int Direction;

    public void setStartX(int startX) {
        StartX = startX;
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

    public void setStartY(int startY) {
        StartY = startY;
    }

    public int getRandomX() {
        return RandomX;
    }

    public int getRandomY() {
        return RandomY;
    }

    public int getDirection() {
        return Direction;
    }

    public void setDirection(int direction) {
        Direction = direction;
    }
}
