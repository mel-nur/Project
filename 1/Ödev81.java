/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //KLAVYEDEN GİRİLEN BÖLÜM sayısına göre 3^1/2 değerini hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t=1;
        for (int i = 1; i < n-1;) {
           t=1+1/2+1/t;
        }
        System.out.print("sonuç:"+(1+1/t));
        
    }
    
}
