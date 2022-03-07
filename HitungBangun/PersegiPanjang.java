package HitungBangun;

public class PersegiPanjang implements MenghitungBidang{
    //atribut
    private double p, l;
    
    //constructor
    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
    
    //method
    double L(){
        return p*l;
    }
    
    double K(){
        return 2*(p+l);
    }
    
    //overriding
    @Override
    public void Luas() {
        System.out.println(" ");
        System.out.println("Luas Persegi Panjang = " + L());
    }

    @Override
    public void Keliling() {
        System.out.println("Keliling Persegi Panjang = " + K());
    } 
}
