/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

/**
 *
 * @author Ahmed Bahey
 */
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
