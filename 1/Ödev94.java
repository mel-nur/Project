/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Fermat Sayıları
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        for (int i=0; i<=n-1; i++){
            System.out.println("Fermat sayıları:" +(2^(2^i)+1));
        }
    }
    
}
