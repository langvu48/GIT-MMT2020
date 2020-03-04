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
public class lab1Qestion1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        
        System.out.printf("%s %.2f DIEM", hoTen,diemTB);
    }
  
    
}
