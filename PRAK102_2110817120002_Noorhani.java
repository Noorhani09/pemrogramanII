/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PRAK102_2110817120002_Noorhani {  
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("INPUT: ");
        int i = 0;
        int input = keyboard.nextInt();
        while (i <= 6) {
            int t;
            if (input % 2 == 0) {
                t = (input / 2) -1;
                System.out.print(" " + t + " " );
            } else {
                System.out.print(input);
            }
            input++;
            i++;
        }
       keyboard.close();
    }
    
}