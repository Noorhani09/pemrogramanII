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
public class PRAK101_2110817120002_Noorhani {
    public static void main (String [] args) {
        Scanner keyboard =new Scanner(System.in);
     
        String nama,lahir,tanggal, namaBulan = null;
        int bulanLahir, tahun,tinggi, berat;
       
        System.out.print("Masukan Nama Lengkap: ");
        nama=keyboard.nextLine();
        
        System.out.print("Masukan Tempat Lahir: ");
        lahir=keyboard.nextLine();
        
        System.out.print("Masukan Tanggal Lahir: ");
        tanggal=keyboard.nextLine();
       
        System.out.print("Masukan Bulan Lahir: ");
        bulanLahir=keyboard.nextInt();
        
        if (bulanLahir == 1) namaBulan ="Januari";
        else if (bulanLahir == 2) namaBulan ="Februari";
        else if (bulanLahir == 3) namaBulan ="Maret"; 
        else if (bulanLahir == 4) namaBulan ="April";
        else if (bulanLahir == 5) namaBulan ="Mei";
        else if (bulanLahir == 6) namaBulan ="Juni";
        else if (bulanLahir == 7) namaBulan ="Juli";
        else if (bulanLahir == 8) namaBulan ="Agustus";
        else if (bulanLahir == 9) namaBulan ="September";
        else if (bulanLahir == 10) namaBulan ="Oktober";
        else if (bulanLahir == 11) namaBulan ="November";
        else if (bulanLahir == 12) namaBulan ="Desember";

       
        System.out.print("Masukan Tahun Lahir: ");
        tahun=keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        tinggi=keyboard.nextInt();
        
        System.out.print("Masukan Berat Badan: ");
        berat=keyboard.nextInt();

        System.out.println();
        System.out.println("Data Telah Ditambahkan,");
        System.out.print("Nama Lengkap "+nama+",");
        System.out.println(" Lahir di "+lahir+" pada tanggal "+tanggal+" "+namaBulan+" "+tahun);
        System.out.println("Tinggi Badan "+tinggi+" cm dan Berat Badan "+berat+" kilogram");
    }
}
