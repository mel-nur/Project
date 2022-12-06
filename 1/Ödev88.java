/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a,b = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif tamsayı:");
        a = input.nextInt();
        System.out.println();
        while (a>1){
            if (a%b==0){
              System.out.print("b:" +b);
            a/=b;   
            }
            else {
                b++;
            }
                 
        }
    }
    
}
