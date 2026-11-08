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
