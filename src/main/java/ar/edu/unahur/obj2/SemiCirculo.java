package ar.edu.unahur.obj2;

public class SemiCirculo extends Circulo {
    public SemiCirculo(String color, Integer radio) {
        super(color, radio);
    }
    @Override
    public Double area() {
        return  Math.PI*Math.pow(radio,2)/2;
    }
    @Override
    public Boolean regular() {
        return false;
    }
}
