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
public  abstract class AbstractShape implements Shape {
    protected int x,y;
     AbstractShape(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
}
