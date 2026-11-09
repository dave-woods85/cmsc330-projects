/*
David Woods
CMSC 330
Project1
Prof Suciu
5 Nov 2026

This class gives the drawing calculations for a parallelogram defined
by the upperLeft vertex, bottomRight vertex, and an offset.
*/
import java.awt.*;

public class Parallelogram extends SolidPolygon {

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset){
        super(color, 4);
        // Add coords to the x/y_points lists by using the given vertices and offset
        int[] x_points = {upperLeft.x, lowerRight.x + offset, lowerRight.x, upperLeft.x - offset};
        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y };
        createPolygon(x_points, y_points);
    }
}
