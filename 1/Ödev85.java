/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //klavyeden girilen doğru parçasını gümüş orana uygun bölerek yazdıran program
        Scanner scan = new Scanner(System.in);
        System.out.println("U sayısı girin");
        int u = scan.nextInt();
        int b = u / (2 + 2 ^ 5);
        int a = u - b;
        System.out.println("a:" + a + "  " + "b:" + b);
    }
    
}
