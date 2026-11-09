/*
David Woods
CMSC 330
Project1
Prof Suciu
5 Nov 2026

This class gives the drawing instructions for a block of text using a string, color, and location.
*/

import java.awt.*;

public class Text extends Image{
    private Color color;
    private int[] location;
    private String text;


    public Text(Color color, int[] location, String text) {
        super(color);
        this.location = location;
        this.text = text;

    }

    @Override
    public void draw(Graphics graphics){
        colorDrawing(graphics);
        graphics.drawString(text, location[0], location[1]);
    }
}
