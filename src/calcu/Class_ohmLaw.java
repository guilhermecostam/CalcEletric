package calcu;

public class Class_ohmLaw {
    private double p;
    private double v;
    private double i;
    private double r;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public Class_ohmLaw(){
        this.p = 0.0;
        this.v = 0.0;
        this.i = 0.0;
        this.r = 0.0;   
    }
    
    public double calcTen(){
        return this.i * this.r;
    }
    public double calcPot(){
        return this.v * this.i;   
    }
    public double calcCor(){
        return this.v / this.r;
    }
    public double calcRes(){
        return this.v / this.i;
    }
    
}
