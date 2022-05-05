import java.util.ArrayList;

public class XYList extends Coordinates{

    public ArrayList<Integer> Xlist(){
        Xlist().add(getX());
        return Xlist();
    }

    public ArrayList<Integer> Ylist(){
        Ylist().add(getY());
        return Ylist();
    }
}
