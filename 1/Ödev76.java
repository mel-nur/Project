/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //e=2k+2/(2k+1)!  k=0 dan başlıyor sonsuza kadar gidiyor
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double t=2;
        for (int i = 1; i < n;) {
            int fakt=(2*i+1);
            t=t+(2*i+2)/fakt;
        }
         System.out.print("sonuç:"+t);
        
    }
    
}
