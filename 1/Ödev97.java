/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Dost Sayılar
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen a ve b tam sayılarını giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();
        int ta = 0;
        int tb = 0;
        for (int i = 1; i<=a-1; i++){
            if (a%i==0){
                ta=ta+i;
            }
            else {
            }
        }
        for (int i = 1; i<=b-1; i++){
            if (b%i==0){
                tb = tb+i;
            }
            else {
                
            }
        }
        if (ta==b && tb==a){
            System.out.println("Dost sayılar");
        }
        else{
            System.out.println("Dost sayılar değil");
        }
    }
    
}
