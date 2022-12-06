/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Ödev104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Markov Sayılar
        for (int x = 1; x<=50; x++){
            for (int y = x; y<=50; y++){
                for (int z = y; z<=50; z++){
                    if((x*x)+(y*y)+(z*z)==3*x*y*z){
                        System.out.println("x=" +x+ "Y="+y +"Z="+z);
                    }
                }
            }
        }
    }
    
}
