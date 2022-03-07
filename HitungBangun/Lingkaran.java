package HitungBangun;

public class Lingkaran implements MenghitungBidang{
    //atribut
    private double r;
    final double phi = 3.14;
    
    //constructor
    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    //method    
    double L(){
        return phi*r*r;
    }
    
    double K(){
        return 2*phi*r;
    }
    
    //overriding
    @Override
    public void Luas() {
        System.out.println(" ");
        System.out.println("Luas Lingkaran = " + L());
    }

    @Override
    public void Keliling() {
        System.out.println("Keliling Lingkaran = " + K());
    }
}
