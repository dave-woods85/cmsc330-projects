/*
David Woods
CMSC 330
Project1
Prof Suciu
5 Nov 2026

This class serves as the superclass for all the new shape classes.
This is mostly the same as the HollowPolygon class save for how the shape
is drawn with fillPolygon().
*/
import java.awt.*;

public class SolidPolygon extends Polygon_{
    private int vertices;
    private Color color;

    // Constructor to call the super constructor
    public SolidPolygon(Color color, int vertices){
        super(color, vertices);
    }

    // Overrides the Polygon_ method for drawing
    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.fillPolygon(polygon);
    }


}
