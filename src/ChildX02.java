/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class ChildX02 extends ParentX01 {
    int resultX01;
    double resultX02;
    public ChildX02(int a, int b, int c, int d, int e) {
        p1 = a;
        p2 = b;
        p3 = c;
        resultX01 = d;
        resultX02 = e;
    } //End constructor
    public ChildX02() {
        
    } //End empty constructor
    
    public void methdX01(int a, int b) {

        resultX01 += (int) Math.pow(p2, a) /b;
        
        resultX02 += Math.pow(p3, a)/(double) b;
    } //End methdX01
    
    @Override public String toString() {
        return(this.getClass().getSimpleName() + "\nInherited p1 value is " + p1 + "\nInherited p2 value is " + p2 + "\nInherited p3 value is " + p3 + "\nSubclass resultX01 value is " + resultX01 + "\nSubclass resultX02 value is " + resultX02);
    } //End toString
}
