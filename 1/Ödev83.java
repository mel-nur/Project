/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           //AB doğru parçası uzunluğunu altın orana uygun bölerek AC ve CB uzunluklarını yazdıran program 
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int ab = scan.nextInt();
        double cb=2*ab/(1+Math.pow(5, 0.5));
        double ac=ab-cb;
        System.out.print("ac:"+ac +"    "+"cb:"+cb);
    }
    
}
