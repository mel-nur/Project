/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1-x^2/2!+x^4/4

        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int sayi = scan.nextInt();
        double fakt = 1;
        double toplam = 0;
        for (int i = 0; i < sayi - 1; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                fakt *= j;
                toplam = toplam + ((-1) ^ i) * (sayi ^ (2 * i)) / fakt;
            }
        }
        System.out.print(toplam);
        
    }
    
}
