/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in) ;
        double N, x ;
        double T=1, F=1 ;  
        System.out.println("e^x iÃ§in x deÄŸeri giriniz");
        x = input.nextDouble();
        System.out.println("Terim sayÄ±sÄ± giriniz");
        N = input.nextDouble();
        for (double i = 1; i <= N-1; i++) { 
            F=F*i ; 
            T=T+ (Math.pow(x, i)/F) ; 
        }
        System.out.println(T);

    }
    
}
