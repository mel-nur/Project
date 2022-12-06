/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dobinski Formülü
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        for (int i = 1; i<=n; i++){
            int t = 0;
            int f = 1;
            for (int j = 1; j<=100; j++){
                f = f*j;
                t = t+j^(i/f);
            }
            double e =2.71828;
            System.out.println("sonuç:"+(t/e));
        }
    }
    
}
