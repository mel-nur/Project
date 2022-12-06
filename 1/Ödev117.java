/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Pell Sayıları
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı giriniz:");
        int N = input.nextInt();
        int P1=0; 
        int P2 = 1;
        System.out.println(P1);
        System.out.println(P2);
        for (int k=1; k<=N-2; k++){
            int P3=2*P2+P1;
            System.out.println(P3);
            P1=P2;
            P2=P3;
        }
        
    }
    
}
