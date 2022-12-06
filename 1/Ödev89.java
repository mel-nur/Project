/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Chen Asalı 
        Scanner input = new Scanner (System.in);
           int s = 0 ;
        System.out.println("Bir n sayısı giriniz");
           int n = input.nextInt();
           int x = n+2 ;  
         for (int i = 2 ; i<n ; i++) 
        {
           if (x % i == 0)  
               {
            s++ ; 
        }
        }
            if (s==0)  {
                System.out.println("Girdiğiniz sayı Chen asalıdır.");
            }
            else {
            System.out.println("Girdiğiniz sayı Chen asalı değildir.");
    }
    }
    
}
