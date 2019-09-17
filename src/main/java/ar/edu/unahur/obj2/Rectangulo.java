package ar.edu.unahur.obj2;

public class Rectangulo extends Triangulo {
    public Rectangulo(String color, Double base, Double altura) {
        super(color, base, altura);
    }

    @Override
    public Boolean regular() {
        return true;
    }

    @Override
    public Double area() {
        return base * altura;
    }
}
