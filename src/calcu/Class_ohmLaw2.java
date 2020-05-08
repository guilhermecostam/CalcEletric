package calcu;

public class Class_ohmLaw2 {
    private double resis;
    private double resMa;
    private double comp;
    private double areaTra;

    public double getResis() {
        return resis;
    }

    public void setResis(double resis) {
        this.resis = resis;
    }

    public double getResMa() {
        return resMa;
    }

    public void setResMa(double resMa) {
        this.resMa = resMa;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double getAreaTra() {
        return areaTra;
    }

    public void setAreaTra(double areaTra) {
        this.areaTra = areaTra;
    }
    
    
    public Class_ohmLaw2(){
        resis = 0.0;
        resMa = 0.0;
        comp = 0.0;
        areaTra = 0.0;
    }
    
    public double ohmLaw2(){
        resis = (resMa * comp) / areaTra;
        
        return resis;
    }
    
}
