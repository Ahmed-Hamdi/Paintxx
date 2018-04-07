/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

/**
 *
 * @author dell-pc
 */
public class Rectangle extends AbstractShape {
    private int length;
    private int width;
    
    public Rectangle(int x, int y,int length,int width) {
        super(x, y);
        this.length=length;
        this.width=width;
    }
    
}
