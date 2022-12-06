/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Tau Sayısı
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı giriniz:");
        int N = input.nextInt();
        for (int i = 1; i<=N; i++){
           int s=0;
            for(int j = 1; j<=i; j++){
                if (i%j==0){
                    s=s+1;
                }
               
            }
            if (i%s==0){
                System.out.println("tau sayısı="+i);
            }
        }
    }
    
}
