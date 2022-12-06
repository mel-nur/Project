/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Heterometrik Sayılar
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        for (int a = 1; a<=n; a++){
            System.out.println("Heterometrik sayılar:" +a*(a+1));
        }
    }
    
}
