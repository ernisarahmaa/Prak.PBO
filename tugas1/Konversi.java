/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author asus
 */
public class Konversi {
    double c; //variabel
    //constructor
    public Konversi(double c){
        this.c = c;
    }
    
    void afterKonversi(){
        System.out.println(" ");
        System.out.println("Suhu Dalam Celcius    : " + c + "Â°C");
        System.out.println("Dalam Fahreinheit     : " + CtoF() + "Â°F");
        System.out.println("Dalam Reamur          : " + CtoR() + "Â°R");
        System.out.println("Dalam Kelvin          : " + CtoK() + "K");
        
        if(c <= 0){
            System.out.println("Kondisi air beku");
        }else if(c > 0 && c < 100){
            System.out.println("Kondisi air normal");
        }else if(c >= 100){
            System.out.println("Kondisi air mendidih");
        }
    }
    
    //method
    //Celcius to Fahrenheit
    double CtoF(){
        return ((9 * c)/ 5) + 32;
    }
    
    //Celcius to Reamur
    double CtoR(){
        return (4 * c) / 5;
    }
    
    //Celcius to Kelvin
    double CtoK(){
        return c + 273.15;
    }
}
