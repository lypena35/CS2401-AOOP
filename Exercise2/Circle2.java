package Exercise2;

/**
 * Created by LoriPena on 11/5/18.
 * Lorianne Pena
 */
public class Circle2 implements Shape {

    @Override
    public void draw() {
        System.out.println ("Circle2::draw()" );
    }
}
 class FacadePatternDemo{
    public static void main(String[] args) {
        ShapeMaker shapeMaker= new ShapeMaker ();

        shapeMaker.drawCircle ();
        shapeMaker.drawRectangle ();
        shapeMaker.drawSquare ();
    }
}