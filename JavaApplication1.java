/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, d,rev=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(n>0)
          
      {
          d=n%10;
           rev=rev*10+d;
          n=n/10;
      }
        System.out.println("thse value is" +rev);
    }
}
