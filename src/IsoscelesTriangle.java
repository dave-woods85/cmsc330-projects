/*
David Woods
CMSC 330
Project1
Prof Suciu
5 Nov 2026

This class gives the drawing calculations for an isosceles triangle using a top vertex, width and height.
*/
import java.awt.*;

public class IsoscelesTriangle extends SolidPolygon{

    public IsoscelesTriangle(Color color, Point topVertex, int height, int width){
        super(color, 3);
        int[] x_points = {topVertex.x, topVertex.x - (width / 2), topVertex.x + (width / 2)};
        int[] y_points = {topVertex.y, topVertex.y + height, topVertex.y + height};
        createPolygon(x_points, y_points);

    }


}
