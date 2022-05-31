
public class Snake {

    /*private int SnakeWidth = 40;
    private int SnakeHeight = 40;*/
    private final int SnakeVx = 40;
    private final int SnakeVy = 40;
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


