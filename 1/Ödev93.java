/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Cullen Sayıları
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz.");
        int n = input.nextInt();
        for (int i = 1; i<=n ; i++){
            System.out.println("Cullen sayılar " +(i*(2^i)+1));
        }
    }
    
}
