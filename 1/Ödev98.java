/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class Ödev98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Armstrong Sayılar
        double sayi = 0;
        for (int a = 1; a<=9; ){
            for (int b = 0; b<=9; ){
                for (int c = 0; c<=9; ){
                    sayi = (100*a)+(10*b)+(c);
                    if (sayi==(a^3)+(b^3)+(c^3)){
                        System.out.println("Armstrong sayısı:" +sayi);
                    }
                                   
                }
                
            }
        }
        System.out.println(+sayi);
    }
    
}
