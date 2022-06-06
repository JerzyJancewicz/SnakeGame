
public class Snake {

    // klasa przechowuje infrmacje o snake

    private final int SnakeVx = 40; // predkosc po X
    private final int SnakeVy = 40; // predkosc po Y
    private int StartX = 480;
    private int StartY = 480;
    private int Direction;

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


