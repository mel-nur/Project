/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("m ve n değerlerini giriniz:");
        double m = input.nextDouble();
        double n = input.nextDouble();
        double t = Math.pow((n+1), m);
        for (int i = 1; i<=n; i++){
            int f1=1, f2=1, f3=1;
            for (int k=1; k<=m+1; k++){
                f1*=k;
            }
            for (int k = 1; k<=i; k++){
                f2*=k;
            }
            for (int k = 1; k<=m+1; k++){
                f3*=k;
            }
            int c=f1/(f2*f3);
            t*=Math.pow((-1), i)*c*Math.pow((n+1-i), m);
        }
        System.out.println(t);
    }
    
}
