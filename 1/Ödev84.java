/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //klavyeden kısa kenarı girilen altın üçgenin tüm kenarlarını yazdıran program
         Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int a = scan.nextInt();
        int b =a*(1+5^(1/2))/2;
        System.out.println("a:"+a + "  " + "b:"+b);
    }
    
}
