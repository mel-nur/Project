/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Fibonacci Serisinin ilk N terimi
        int i,N,T1,T2,T3;
        System.out.print("Fibonacci Serisi \n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Terim sayısı:");
        N = input.nextInt();
        T1 = 1;
        T2 = 1;
        System.out.print("\n"+T1+"\t"+T2+"\t");
        for (i = 1; i<=N-2; i++){
           T3=T1+T2;
            System.out.print(T3+"\t");
            T1=T2;
            T2=T3;
        }
        
    }
    
}
