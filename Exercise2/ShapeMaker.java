package Exercise2;

/**
 * Created by LoriPena on 11/5/18.
 * Lorianne Pena
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle= new Circle2 ();
        rectangle= new Rectangle ();
        square= new Square();
    }
    public void drawCircle(){
        circle.draw ();
    }
    public void drawRectangle(){
        rectangle.draw ();
    }
    public void drawSquare(){
        square.draw ();
    }
}
