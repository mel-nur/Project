/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //1/2+1/12+1/30+1/56+1/90...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double toplam = 0;
        for (int i = 0; i < n - 1; i++) {
            toplam = toplam + 1 / ((2 * i + 1) * (2 * i + 2));
        }
        System.out.println(toplam);
        
    }
    
}
