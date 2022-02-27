/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
public static void main(String[] args) {
        double c, f, r, k; //variabel
        int pilih;
        boolean pilihan = true;
        Scanner input = new Scanner(System.in); //buat input
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius : ");
        c = input.nextDouble(); //input suhu celcius
        Konversi convert = new Konversi(c); //instansiasi
        
        do{
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            pilih = input.nextInt();
            
            if(pilih==1){
                convert.afterKonversi();
            }else if(pilih==2){
                System.out.println(" ");
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius : ");
                convert.c = input.nextDouble();
            }else if(pilih==3){
                System.exit(0);
            }else{
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar.");
            }
        }while(pilihan = true);
    }
}
