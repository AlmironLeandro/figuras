package ar.edu.unahur.obj2;

public class Triangulo extends Figura {
    Double base;
    Double altura;

    public Triangulo(String color, Double  base, Double altura) {
        super(color);
        this.base = base;
        this.altura=altura;
    }

    @Override
    public Boolean regular() {
        return super.regular();
    }

    @Override
    public Double area() {

        return (base * altura)/2;
        //Double.valueOf()
    }

}
