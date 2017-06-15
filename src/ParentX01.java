/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public abstract class ParentX01 {
    int p1;
    int p2;
    int p3;
    
    public ParentX01(int a, int b, int c) {
        p1 = a;
        p2 = b;
        p3 = c;
    } //End constructor
    
    public ParentX01() {
        
    } //End empty constructor
    
    public void methdP01(int myInt) {
        p1 *= myInt;
        p2 *= myInt;
        p3 *= myInt;
    } //End methdP01
    
    public abstract void methdX01(int a, int b);
}

