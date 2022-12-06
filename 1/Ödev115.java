/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Tribonacci Serisi
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı giriniz");
        int N = input.nextInt();
        int T1 = 1; 
        int T2 = 1;
        int T3 = 2;
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
        for (int i = 1; i<=N; i++){
            int T4=T1+T2+T3;
            System.out.println(T4);
            T1=T2;
            T2=T3;
            T3=T4;
        }
    }
    
}
