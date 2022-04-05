package kuis;

import divisi.android;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double nik, tulis, coding, wawancara, hasil = 0;
        int pilih;
        String nama;
        boolean pilihan = true;
        System.out.println("FORM PENDAFTARAN PT.CACA");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilih = input.nextInt();
        
        if (pilih==1){
            System.out.println(" ");
            System.out.println("FORM PENDAFTARAN");
            System.out.println(" ");
            System.out.print("Input NIK  : ");
            nik = input.nextInt();
            System.out.print("Input Nama : ");
            nama = input.next();
            System.out.print("Input Nilai Tes Tulis     : ");
            tulis = input.nextDouble();
            System.out.print("Input Nilai Tes Coding    : ");
            coding = input.nextDouble();
            System.out.print("Input Nilai Tes Wawancara : ");
            wawancara = input.nextDouble();
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            if (pilih == 1) {
                System.out.println("FORM EDIT");
                System.out.print("Input Nilai Tes Tulis     : ");
                tulis = input.nextDouble();
                System.out.print("Input Nilai Tes Coding    : ");
                coding = input.nextDouble();
                System.out.print("Input Nilai Tes Wawancara : ");
                wawancara = input.nextDouble(); 
            }else if (pilih == 2) {
                android android = new android(tulis, coding, wawancara, hasil);
                System.out.println("Nilai Akhir : " + android.hasil);
                if (android.hasil < 85) {
                    System.out.println("Keterangan : GAGAL");
                    System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Android");
                }
                else if (android.hasil >= 85) {
                    System.out.println("Keterangan : BERHASIL");
                    System.out.println("Selamat kepada " + nama + " telah diterima sebagai Android");
                }
            }
        }
    }    
}
