/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //KLAVYEDEN GİRİLEN BÖLÜM sayısına göre 5^1/2 değerini hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t=1;
        for (int i = 1; i < n;) {
           t=4+1/t;
        }
        System.out.print("sonuç:"+(2+1/t));
        
    }
    
}
