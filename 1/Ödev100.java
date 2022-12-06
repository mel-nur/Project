/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Eksik Sayı
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir s sayısı giriniz:");
        int s = input.nextInt();
        int t = 0;
        for (int i = 1; i<=s; i++){
        if (s%i==0){
            t = t+1;
        }
    }
        if (t<2*s){
            System.out.println("Eksik sayıdır ve eksiklik miktarı=" + (2*s-t));  
        }
        else {
            System.out.println("Eksik sayı değildir");
        }
    }
    
}
