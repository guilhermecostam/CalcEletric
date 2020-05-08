package calcu;

public class Class_conv {
    private Double dec;
    private String bin;
    private String hexa;

    public double getDec() {
        return dec;
    }

    public void setDec(double dec) {
        this.dec = dec;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }
    
    
    public Class_conv(){
        this.dec = 0.0;
        this.bin = "";
        this.hexa = "";
    }
    
    public String DecToBin(){
        int i = 0;
        i = (int) Math.round(dec);
        bin = Integer.toBinaryString(i);
        return bin;
    }
    
    public String DecToHexa(){
        int o = 0;
        o = (int) Math.round(dec);
        hexa = Integer.toString(o, 16);
        return hexa;
    }
    
    public double BinToDec(){
        for (int p = 0; p < bin.length(); p++)
            if( bin.charAt( bin.length() - 1 - p) == '1' )
                dec += Math.pow(2, p);
        return dec;       
    }
    
    public String BinToHexa(){
        hexa = Integer.toString(Integer.parseInt(bin, 2), 16);
        return hexa;
    }
    
    public String HexaToBin(){
        bin = Integer.toString(Integer.parseInt(hexa, 16), 2);
        return bin;
    }
    
}
