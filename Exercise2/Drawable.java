package Exercise2;

/**
 * Created by LoriPena on 10/3/18.
 * Lorianne Pena
 */
interface Drawable {
    int RED=1;
    int GREEN=2;
    int BLUE=3;
    int BLACK=4;
    int WHITE=5;
    void draw(int color);
    void line(int color);
}

class Circle implements Drawable{
    private double x,y,radius;
    Circle(double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override
    public void draw(int color) {
        System.out.println ("Circle2 drawn at ("+ x+ " , " + y+ "), with radius "+ radius + ", and color" );
    }

    @Override
    public void line(int color) {

    }


    double getRadius(){
        return radius;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
}
class Test2{
    public static void main(String[] args) {

    }
}
