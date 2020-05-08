package calcu;

public class Class_jouleEffect {
    private double quantCal;
    private double cor;
    private double resist;
    private double intTemp;

    public double getQuantCal() {
        return quantCal;
    }

    public void setQuantCal(double quantCal) {
        this.quantCal = quantCal;
    }

    public double getCor() {
        return cor;
    }

    public void setCor(double cor) {
        this.cor = cor;
    }

    public double getResist() {
        return resist;
    }

    public void setResist(double resist) {
        this.resist = resist;
    }

    public double getIntTemp() {
        return intTemp;
    }

    public void setIntTemp(double intTemp) {
        this.intTemp = intTemp;
    }
    
    public Class_jouleEffect(){
        quantCal = 0.0;
        cor = 0.0;
        resist = 0.0;
        intTemp = 0.0;
    }
    
    public double calc_jouleEffect(){
        double corAlt = Math.pow(cor,2);
        quantCal = corAlt * resist * intTemp;
        
        return quantCal;       
    }
    
}
