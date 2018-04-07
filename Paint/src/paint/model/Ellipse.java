package paint.model;


public class Ellipse extends AbstractShape {
   private int minordiagonal;
   private int majordiagonal;
    Ellipse(int x,int y,int minordiagonal,int majordiagonal)
    {
        super(x,y);
        this.minordiagonal=minordiagonal;
        this.majordiagonal=majordiagonal;
    }
    
}
