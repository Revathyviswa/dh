/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		int a=str.length();
		a--;
		char str1[]=str.toCharArray();
		char temp;
		for(int i=0;i<str1.length/2;i++){
			temp=str1[i];
			str1[i]=str1[a];
			str1[a]=temp;
			a--;
		}
		str=new String(str1);
		System.out.println(str);
    }
}
