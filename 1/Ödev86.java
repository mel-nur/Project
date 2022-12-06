/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int s ;
        Scanner input = new Scanner(System.in);
        System.out.println("Belirtilen aralıktaki Asal Sayılar");
        System.out.print("\nÜst sınır =");
         int N = input.nextInt();
        System.out.println("\n+++ ASAL SAYILAR +++\n");
         for (int i=2; i<=N; i++){
             s =0 ; 
             for(int j=1; j<=i; j++) {
                 if (i%j == 0) 
                     s++;
             }
        if ( s ==2)
            System.out.print(i+ "\t");
         }
         
    }
    
}
