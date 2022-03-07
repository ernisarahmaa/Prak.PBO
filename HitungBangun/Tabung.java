package HitungBangun;

public class Tabung extends Lingkaran implements MenghitungRuang{
    //atribut
    private double t;
    
    //constructor
    public Tabung(double t, double r) {
        super(r);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    //method
    double V(){
        return L()*t;
    }
    
    double LP(){
        return (2*L())+(K()*t);
    }
    
    //overriding
    @Override
    public void Volume() {
        System.out.println("Volume Tabung = " + V());
    }

    @Override
    public void LuasPermukaan() {
        System.out.println("Luas Permukaan Tabung = " + LP());
    }
    
}
