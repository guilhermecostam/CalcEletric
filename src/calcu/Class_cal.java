package calcu;

public class Class_cal {
    private double n1;
    private double n2;

    public void Setn1(double n1){
        this.n1=n1;
    }
    public double Getn1(){
        return this.n1;
    }

     public void Setn2(double n2){
        this.n2=n2;
    }
    public double Getn2(){
        return this.n2;
    }

    public Class_cal(){
        this.n1=0;
        this.n2=0;
    }

    public double Sumar(){
        return this.n1+this.n2;
    }

    public double Restar(){
        return this.n1-this.n2;
    }
    
    public double Multiplicar(){
        return this.n1*this.n2;
    }
    public double Dividir(){     
        return this.n1/this.n2;
    }
    
    public double seno(){  
        n1= Math.sin(n1);
        return this.n1 ;              
    }
    public double coseno(){
        n1= Math.cos(n1);
        return this.n1 ;
    }
    public double tangente()
    {
        n1= Math.tan(n1);
        return this.n1 ;
}
    public double cotangente()
    {
        n1= 1/Math.tan(n1);
        return this.n1 ;
}
    public double Raiz()
    {
        n1= Math.sqrt(n1);
        return this.n1 ;
}
    public double factorial(){
         double i,fact,cont;
        cont=1;
        fact=n1;
        for(i=1;i<=fact;i++){
           cont=cont*i;
        }
        n1=cont;
        return this.n1 ;
    }
    
    public double cuadrado(){
        double i,cuadrado,cont;
        cont=0;
        cuadrado=n1;
        for(i=1;i<=2;i++){
           cont=cuadrado*cuadrado;
        }
        n1=cont;
        return this.n1 ;
    }
    
    public double cubo(){
        double i,cubo,cont;
        cont=0;
        cubo=n1;
        for(i=1;i<=2;i++){
           cont=cubo*cubo*cubo;
        }
        n1=cont;
        return this.n1 ;
    }

}
