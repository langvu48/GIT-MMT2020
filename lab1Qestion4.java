/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.mmt;

import java.util.Scanner;

/**
 *
 * @author ig.beooss
 */
public class lab1Qestion4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("nhap he so a=");
        int a = s.nextInt();
        System.out.println("nhap he so b=");
        int b = s.nextInt();
        System.out.println("nhap he so c=");
        int c = s.nextInt();
        
        int delta =b*b-4*a*c;
        float canDelta = (float) Math.sqrt(delta);
        System.out.printf("can delta la: *.1f",canDelta);
    }
    
}
