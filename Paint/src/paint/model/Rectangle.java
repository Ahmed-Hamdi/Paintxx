
package paint.model;

public class Rectangle extends AbstractShape {
    private int length;
    private int width;
    
    public Rectangle(int x, int y,int length,int width) {
        super(x, y);
        this.length=length;
        this.width=width;
    }
    
}


