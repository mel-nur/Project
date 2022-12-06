/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Mükemmel Sayı
        int s,t = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Tamsayı:");
        s = input.nextInt();
        for (int i = 1; i<s; i++){
            if (s%1==0){
                t+=i;
            }
            if (s==t){
                System.out.println("Mükemmel sayı");
            }
            else {
                System.out.println("Mükemmel sayı değil");
            }
        }
    }
    
}
