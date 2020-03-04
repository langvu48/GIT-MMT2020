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
public class lab1qesstion3 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap canh: ");
        float canh = s.nextFloat();
        float thetich = canh * canh  *canh;
        System.out.printf("the tich la %.1f",thetich);
    
    }
    
}
