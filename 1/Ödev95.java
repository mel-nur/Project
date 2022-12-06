/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ödev95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Leyland Sayıları
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x ve y tam sayılarını giriniz:");
        int x = input.nextInt();
        int y = input.nextInt();
        while (x>1 && y>1){
            for (int i = 2; i<=x; i++){
                for (int j = 2; j<=y; j++){
                    System.out.println("Leyland sayıları:" +(i^j+j^i));
                }
            }
            System.out.println();
            break;
        }
    }
    
}
