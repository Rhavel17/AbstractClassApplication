/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class ChildX01 extends ParentX01 {
    int resultX01;
    
    public ChildX01(int a, int b, int c, int d) {
        p1 = a;
        p2 = b;
        p3 = c;
        resultX01 = d;
    } //End constructor
    
    public ChildX01() {
        
    } //End empty constructor
    
    public void methdX01(int int1, int int2) {
        resultX01 += Math.pow(p1, int1) + int2;
    } //End methdX01
    
    @Override public String toString() {   
        return(this.getClass().getSimpleName() + "\nInherited p1 value is " + p1 + "\nInherited p2 value is " + p2 + "\nInherited p3 value is " + p3 + "\nSubclass resultX01 value is " + resultX01 + "\n");
    } //End toString
    public void nope() {}
    
} //End ChildX01
