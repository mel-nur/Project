/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //x-x^3/3!+x^5/5!-x^7/7!...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        System.out.println("x sayısı girin");
        int x = scan.nextInt();
        double fakt = 1;
        double toplam=0;
        for (int i = 1; i < n; i++) {          
            for (int j = 1; j < 2*i-1; j++) {
                fakt=j;
               toplam=toplam+((-1)^(i-1))*(x^(2*i-1))/fakt; 
            }                        
        }
        System.out.println(toplam);
        
    }
    
}
