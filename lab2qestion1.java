
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ig.beooss
 */
public class lab2qestion1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap he so a = ");
        int a = s.nextInt();
        System.out.println("nhap he so b = ");
        int b = s.nextInt();
       
        if(a==0)
        {
            if(b=0)
            {
                System.out.println("phuong trinh co vsn");
            }
            else
            {
                System.out.println("phuong trinh co nghiem: %.1f",(float)-b/a);
            }
        }
        
    }
    
}
