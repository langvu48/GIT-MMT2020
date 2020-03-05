/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.mmt;

import java.util.Scanner;

/**
 *
 * @author ig.beooss
 */
public class lab2qesstion2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("a=");
        a = s.nextInt();
         System.out.println("b=");
        b = s.nextInt();
         System.out.println("c=");
        c = s.nextInt();
        
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("pt co vsn");
                }
                else
                {
                    System.out.println("pt vo nghiem")
                }
            }
            else{System.out.printf("pt co nghiem x= %.1f",(float)-c/b);}
        }
        else
        {
            int delta = b*b-4*a*c;
            if(delta<0)
            {
                System.out.println("pt vn");
            }
            else if(delta==0)
            {
                System.out.printf("pt co ngiem duy nhat x=%.1f",(float)((-b)/(2*a)))
            }
            else
            {
                float x1 = (float)(-b+Math.sqrt(delta))/2*a;
                float x2 = (float)(-b-Math.sqrt(delta))/2*a;
                 System.out.printf("x1=%.1f; x2=%.1f",x1,x2);
            }      
        }
    }
    
}
