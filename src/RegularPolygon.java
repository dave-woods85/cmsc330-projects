/*
David Woods
CMSC 330
Project1
Prof Suciu
5 Nov 2026

This class gives the drawing calculations for a regular polygon defined
by the number of sides (or vertices).
*/
import java.awt.*;

public class RegularPolygon extends SolidPolygon{
    public RegularPolygon(Color color, int sides, Point center, int radius){
        super(color, sides);
        // Create arrays equal to the number of vertices(sides)
        int[] x_points = new int[sides];
        int[] y_points = new int[sides];
        for (int i = 0; i < sides; i++) {
            // Calculate the angle for each vertex
            double angle = (2 * Math.PI * i / sides);

            // Calculate coords and add to the x/y_points lists
            x_points[i] = (int) Math.round(center.x + radius * Math.cos(angle));
            y_points[i] = (int) Math.round(center.y + radius * Math.sin(angle));
        }

        createPolygon(x_points, y_points);
    }
}
