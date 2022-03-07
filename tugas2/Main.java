package tugas2;

import HitungBangun.Balok;
import HitungBangun.Lingkaran;
import HitungBangun.PersegiPanjang;
import HitungBangun.Tabung;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t, r, p, l;
        int pilih;
        int pilihan;
        
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih   : ");
            pilih = input.nextInt();
            
            if(pilih==1){
                System.out.println(" ");
                System.out.print("Input Panjang = ");
                p = input.nextDouble();
                System.out.print("Input Lebar = ");
                l = input.nextDouble();
                System.out.print("Input Tinggi = ");
                t = input.nextDouble();
                
                //instansiasi
                PersegiPanjang persegipjg = new PersegiPanjang(p, l);
                Balok balok = new Balok(t, p, l);
                
                //interface
                persegipjg.Luas();
                persegipjg.Keliling();
                
                //inheritance
                balok.Volume();
                balok.LuasPermukaan();
            }else if(pilih==2){
                System.out.println(" ");
                System.out.print("Input Tinggi = ");
                t = input.nextDouble();
                System.out.print("Input Jari-jari = ");
                r = input.nextDouble();
                
                //instansiasi
                Lingkaran lingkaran = new Lingkaran(r);
                Tabung tabung = new Tabung(t, r);
                
                //interface
                lingkaran.Luas();
                lingkaran.Keliling();
                
                //inheritance
                tabung.Volume();
                tabung.LuasPermukaan();
            }else if(pilih==0){
                System.exit(0);
            }else{
                System.out.println("Pilihan tidak ada!");
            }
            System.out.println(" ");
            System.out.println("Ulangi? (Ya : 1 || Tidak : 0)");
            System.out.print("Piihan anda (1/0) : ");
            pilihan = input.nextInt();
            System.out.println(" ");
        }while(pilihan==1);
    }
}
