/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Fibonacci sayısına göre bir önceki ve bir sonraki Fibonacci sayısını bulan program
        Scanner input = new Scanner(System.in);
        System.out.println("Büyük değerli fibonacci sayısını gir");
        double n = input.nextDouble();
        double ao = (1+Math.pow(5,0.5));
        double f1 = n/ao;
        double f3 = n*ao;
        System.out.println(f1+"/"+n+"/"+f3);
       
    }
    
}
