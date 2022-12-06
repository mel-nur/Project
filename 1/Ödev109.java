/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Üçgensel Sayılar
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        for (int i = 1 ; i<=n; i++){
            double u = (i*(i+1))/2;
            System.out.println(u);
        }
    }
    
}
