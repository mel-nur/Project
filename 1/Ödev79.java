/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Klavyeden girilen pozitif tamsayıya göre π(pi)sayısını "Monte Carlo yöntemi"yle hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int m=0;
        for (int i = 1; i < n; i++) {
            int x=2*Rastgele(max)/(max-1);
            int y=2*Rastgele(max)/(max-1);
               if((x^2)+(y^2)<1){
               m=m+1;               
               }
        }
        System.out.print("sonuç:"+4*m/n);
        
    }
    
}
