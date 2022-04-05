package kuis;

import divisi.android;
import divisi.web;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double nik, tulis = 0, coding = 0, wawancara = 0, hasil = 0;
        int pilih;
        String nama;
        boolean pilihan = true;
        System.out.println("FORM PENDAFTARAN PT.CACA");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilih = input.nextInt();
        
        if (pilih==1){
            android android = new android(tulis, coding, wawancara, hasil);
            android.form();
            do{
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilih = input.nextInt();
            
                if (pilih == 1) {
                    System.out.println(" ");
                    System.out.println("FORM EDIT");
                    System.out.print("Input Nilai Tes Tulis     : ");
                    android.tulis = input.nextDouble();
                    System.out.print("Input Nilai Tes Coding    : ");
                    android.coding = input.nextDouble();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    android.wawancara = input.nextDouble();
                }else if (pilih == 2) {
                    android.hasil();
                    System.out.println(" ");
                }else if(pilih==3){
                    System.exit(0);
                }else{
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar.");
                }
            }while(pilihan = true);       
        }if (pilih==2){
            web web = new web(tulis, coding, wawancara, hasil);
            web.form();
            do{
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilih = input.nextInt();
            
                if (pilih == 1) {
                    System.out.println(" ");
                    System.out.println("FORM EDIT");
                    System.out.print("Input Nilai Tes Tulis     : ");
                    web.tulis = input.nextDouble();
                    System.out.print("Input Nilai Tes Coding    : ");
                    web.coding = input.nextDouble();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    web.wawancara = input.nextDouble();
                }else if (pilih == 2) {
                    web.hasil();
                    System.out.println(" ");
                }else if(pilih==3){
                    System.exit(0);
                }else{
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar.");
                }
            }while(pilihan = true);
        }
    }    
}
