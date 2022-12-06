/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Pisagor Üçlemesi
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        for (int a = 1; a<=n-1; a++){
            for (int b = a; b<=n-a; b++){
                double c = n-(a+b);
                if (a*a+b*b==c*c){
                    System.out.println("a"+a);
                    System.out.println("b"+b);
                    System.out.println("c"+c);
                    System.out.println(a*b*c);
                }
                }
            }
        }
    }
    

