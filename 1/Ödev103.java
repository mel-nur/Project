/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Ore Sayısı
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n ;
        double s = 0 , t = 0 ; 
        System.out.println("Bir tam sayı girin");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i==0)  {  
                s++ ; 
                t = t + (double)1/i ;  
            }
        }
         double ho = s/t ;   
               if (ho - (int)ho == 0 ) { 
                    System.out.println( n+ " Ore sayısıdır");
                }
                  else {
                       System.out.println(n+ " Ore sayısı değil");
                  }
    }
    
}
