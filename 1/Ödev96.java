/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Hilbert Sayıları
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir S sayısı giriniz:");
        int S = input.nextInt();
        if ((S-1)%4==0){
            System.out.println("Hilbert sayısıdır:" +S);
        }
        else {
            System.out.println("Hİlbert sayısı değildir" +S);
        }
    }
    
}
