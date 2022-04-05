package divisi;

public class android implements nilaiandro{
    //atribut
    public double tulis, coding, wawancara, hasil;
    
    //constructor
    public android(double tulis, double coding, double wawancara, double hasil) {
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
        this.hasil = hasil;
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

    @Override
    public double tulis() {
        tulis = tulis*20/100;
        return tulis;
    }

    @Override
    public double coding() {
        coding = coding*20/100;
        return coding;
    }

    @Override
    public double wawancara() {
        wawancara = wawancara*20/100;
        return wawancara;
    }

    @Override
    public void hasil() {
        hasil = tulis + coding + wawancara;
    }
    
}
