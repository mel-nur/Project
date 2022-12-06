/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Ödev106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Palindrom Sayılar
        for (int i = 1; i<=9; i++){
            for (int j = 0; j<=9; j++){
                System.out.println(100*i+10*j+i);
            }
        }
        for (int i = 1; i<=9; i++){
            for (int j = 1; j<=9; j++){
                System.out.println(1000*i+100*j+10*j+i);
            }
        }
    }
    
}
