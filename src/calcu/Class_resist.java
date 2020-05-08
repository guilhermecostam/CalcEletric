package calcu;

public class Class_resist {
    private String n1;
    private String n2;
    private double n3;
    private String n4;

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }
    
    public Class_resist(){
        n1 = "";
        n2 = "";
        n3 = 0.0;
        n4 = "";
    }
    
    public String valorResist(){
        String value = n1+n2;
        double i = Integer.parseInt(value);
        i = i * n3;
        
        String str = Double.toString(i);
        str = str + " +/- " + n4 + "%";
        
        return str;       
    }
    
}
