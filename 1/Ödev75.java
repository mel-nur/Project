/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //e^=lim(1+x/n)^n limit n den sonsuza kadar           
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        System.out.println("x sayısı girin");
        int x = scan.nextInt();
        int sonuc = (1 + x / n) ^ n;
        System.out.println("sonuç:"+ sonuc);
    }
    
}
