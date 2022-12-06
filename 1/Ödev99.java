/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Bağdaşık Sayılar
        Scanner input = new Scanner (System.in);
        int x, y ;
        System.out.println("İlk sayıyı girin");
        x = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        y = input.nextInt();
        int a = x%10 ;  
        int b = y%10 ;  
        int c = x/10 ;  
        int d = y/10 ;  
        if (a+b==10 && c==d) {  
            System.out.println(x+ " ve " +y+ " Bağdaşık sayılardır.");
        }
        else {
            System.out.println(x+ " ve " +y+ "Bağdaşık sayılar değildir.");
        }
    }
    
}
