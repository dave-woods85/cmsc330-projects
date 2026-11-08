import java.awt.*;

public class Parallelogram extends SolidPolygon {

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset){
        super(color, 4);
        int[] x_points = {upperLeft.x, upperLeft.x};
        int[] y_points = {lowerRight.y};
        createPolygon(x_points, y_points);
    }
}
