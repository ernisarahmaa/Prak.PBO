package divisi;

import java.util.Scanner;

public class android implements nilaiandro{
    //atribut
    Scanner input = new Scanner (System.in);
    String nama;
    public double nik, tulis, coding, wawancara, hasil;
    
    //constructor
    public android(String nama, double nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public android(double tulis, double coding, double wawancara, double hasil) {
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
        this.hasil = hasil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public double getTulis() {
        return tulis;
    }

    public void setTulis(double tulis) {
        this.tulis = tulis;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public double getWawancara() {
        return wawancara;
    }

    public void setWawancara(double wawancara) {
        this.wawancara = wawancara;
    }
    
    public void form(){
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
    }
    
    void keterangan(){
        System.out.println("Nilai Akhir : " + hasilakhir());     
        if(hasil < 85){
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Android");
        }else if(hasil >= 85){
            System.out.println("KETERANGAN : BERHASIL");
            System.out.println("Selamat kepada " + nama + " telah diterima sebagai Android");
        }
    }
    
    private double hasilakhir() {
        return hasil = (tulis() + coding() + wawancara());
    }

    @Override
    public double tulis() {
        return tulis = tulis*20/100;
    }

    @Override
    public double coding() {
        return coding = coding*50/100;
    }

    @Override
    public double wawancara() {
        return wawancara = wawancara*30/100;
    } 

    @Override
    public void hasil() {
        keterangan();
    }
}
