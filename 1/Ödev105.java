/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz:");
        int n = input.nextInt();
        int s = 0;
        int t = 0;
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                t+=1;
                s++;
            }
        }
        if (t%s==0){
            System.out.println("Aritmetik sayı:");
        }
        else {
            System.out.println("Aritmetik sayı değil:");
        }
             
    }
    
}
