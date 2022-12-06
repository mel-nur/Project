/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Floyd Üçgeni
        int n,s=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısı:");
        n = input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.printf("%d\t",s);
                s++;
            }
            System.out.println();
        }
    }
    
}
