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
public class Square extends AbstractShape {
    private int side;
    public Square(int x, int y,int side) {
        super(x, y);
        this.side=side;
    }
    
    
}
