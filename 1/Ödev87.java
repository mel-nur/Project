/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Ödev87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //her iki basamağıda asal sayı olan iki basamaklı pozitif tamsayıları listeleyen program
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++) {
                if ((i == 2) || (i == 3) || (i == 5) || (i == 7) && (j == 2) || (j == 3) || (j == 5) || (j == 7)) {
                    System.out.println("sonuç:" + 10 * i + j);
                }
                    }
        }
    }
    
}
