/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n  ,r,rev=0;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
    
        System.out.println("enter the number");
    while(n>0)
    {
         r=n%10;
         rev=rev*10+r;
         n=n/10;
    }

        System.out.println("the num is"+rev);
    }
}
