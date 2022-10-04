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
public class PRAK103_2110817120002_Noorhani {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("INPUT: ");
        int input = keyboard.nextInt();
        int i = 1;
        do {
            if (input % 7 == 0){
                continue;
            }
            if (i == 5) System.out.print("outpot"+input);
            else System.out.print(input+",");
            i++;
            input--;
        } while (i<=5);
        
      
    } 
}
    
