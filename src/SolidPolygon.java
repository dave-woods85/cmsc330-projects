/*
David Woods
CMSC330
Project1
Prof Suciu
5 Nov 2026

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
