/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class TestParentX01 {
    public static void main(String[] args) {
        ChildX01 myChild1 = new ChildX01(3,2,8,3); 
        ChildX02 myChild2 = new ChildX02(3,4,5,6,7); 
        
        myChild1.methdX01(4,10); 
        myChild2.methdX01(4,10); 
        
        System.out.println(myChild1);
        System.out.println(myChild2);
        
        myChild1.methdP01(10);
        myChild2.methdP01(100);
        
        System.out.println();
        System.out.println(myChild1);
        System.out.println(myChild2);
    } //End main
} //End class TestParentX01
