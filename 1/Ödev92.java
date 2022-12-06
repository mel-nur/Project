/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Mükemmel Sayı
        Scanner input = new Scanner(System.in);
        int n , s = 0 ;
        double a = 1;
        double b = 1 ; 
        System.out.println("Üst sınır girin");
        n = input.nextInt();
        System.out.println("Mükemmel Sayılar:");
        for (int i = 1; i <= n; i++) {  
            a = Math.pow(2, i) ; 
            b = Math.pow(2, i+1) - 1 ;  
             for (int j = 2 ; j<b ; j++)  
        {
            if (b % i == 0)    
        {
            s++ ;
        }
        }
            if (s==0)  {
                
            }
            System.out.println(a*b);  
        }
    }
    
}
