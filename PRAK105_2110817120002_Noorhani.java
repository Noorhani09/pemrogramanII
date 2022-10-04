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
public class PRAK105_2110817120002_Noorhani {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double volume, r, t;
       
        System.out.print("Masukkan jari-jari : ");
             r = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
             t = input.nextDouble();
     
         volume = (phi * r*r * t);
       
        System.out.println("Volume tabung dengan jari "+r+" cm dan tinggi "+t+" cm adalah "+volume+ " m3");
    }
    
}