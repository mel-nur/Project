/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //π=12^1/2{1-1/(3*3)+1/(5*3^2)-1/(7*3^3)....}
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t = 0;
        for (int i = 0; i < n - 1; i++) {
            t = t + (-1) ^ i / ((2 * i + 1) * 3 ^ i);
        }
        System.out.print("sonuç:"+((12) ^ (1 / 2) * t));
        
    }
    
}
