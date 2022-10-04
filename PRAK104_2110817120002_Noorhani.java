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
public class PRAK104_2110817120002_Noorhani {
    public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
       
       int andiPertama, budiPertama, andiKedua, budiKedua, andiKetiga, budiKetiga;
       int pointAndi = 0, pointBudi= 0;
       
       System.out.print("Kartu Andi: ");
       andiPertama = keyboard.nextInt();
       andiKedua = keyboard.nextInt();
       andiKetiga = keyboard.nextInt();
       keyboard.nextLine();
       int [] andi = {andiPertama, andiKedua, andiKetiga};
       
       System.out.print("Kartu Budi : ");
       budiPertama = keyboard.nextInt();
       budiKedua = keyboard.nextInt();
       budiKetiga = keyboard.nextInt();
       keyboard.nextLine();
       int [] budi = {budiPertama, budiKedua, budiKetiga};
       
       if ((budiPertama >= 2 && budiPertama <= 10) && (budiKedua >= 2 && budiKedua <= 10)&& (budiKetiga >= 2 && budiKetiga <= 10)&&
               (andiPertama >= 2 && andiPertama <= 10) && (andiKedua >= 2 && andiKedua <= 10)&& (andiKetiga >= 2 && andiKetiga <= 10)) {
           int i = 0;
           while (i <= 2) {
               if (andi[i]>budi[i]) {
                   pointAndi++;
               } else if (budi[i]>andi[i]) {
                   pointBudi++;
               }
               i++;
           }
           System.out.println("PEMENANG:");
           if (pointAndi>pointBudi) {
               System.out.println("Andi");
               }
           if (pointAndi<pointBudi) {
               System.out.println("Budi");
               }
           if (pointAndi==pointBudi) {
               System.out.println("Seri");
               }
                   
               }
           }
     
    }
    