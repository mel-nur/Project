/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NegaFibonacci Sayıları
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        int f1 = 1; 
        int f2 = -1;
        System.out.println(f1);
        System.out.print(f2);
        for (int i = 1; i<=n-2; i++){
            int f3 = f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    
}
