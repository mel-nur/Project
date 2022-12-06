/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //π/2=4/3,16/15,36/35,64/63...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int c = 1;
        for (int i = 1; i < n; i++) {
            int c1 = 4 * i * i;
            c = c * c1 / (c1 - 1);
        }
        System.out.print("sonuç:" + (2 * c));
    }
    
}
