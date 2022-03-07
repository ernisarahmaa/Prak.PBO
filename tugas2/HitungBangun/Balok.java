package HitungBangun;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    //atribut
    private double t;
    
    //constructor    
    public Balok(double t, double p, double l) {
        super(p, l);
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
        return (L()+(getP()*t+getL()*t))*2;
    }

    //overriding
    @Override
    public void Volume() {
        System.out.println("Volume Balok = " + V());
    }

    @Override
    public void LuasPermukaan() {
        System.out.println("Luas Permukaan Balok = " + LP());
    }
    
}
