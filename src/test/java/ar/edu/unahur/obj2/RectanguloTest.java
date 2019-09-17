package ar.edu.unahur.obj2;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import javax.swing.*;

public class RectanguloTest {
    String radioInput = JOptionPane.showInputDialog("Ingrese la base del rectangulo");
    Double base = Double.parseDouble(radioInput);
    String radioInput2 = JOptionPane.showInputDialog("Ingrese la altura del rectangulo");
    Double altura = Double.parseDouble(radioInput2);
    Rectangulo r1 = new Rectangulo("violeta",base,altura);
        System.out.println(r1.area());
    //SEGUNDO RECTANGULO
    String segundoRectangulo = JOptionPane.showInputDialog("Ingrese la base del rectangulo 2");
    Double base2 = Double.parseDouble(segundoRectangulo);
    String segundoRectangulo1 = JOptionPane.showInputDialog("Ingrese la altura del rectangulo 2");
    Double altura2 = Double.parseDouble(segundoRectangulo1);
    Rectangulo r2 = new Rectangulo("violeta",base2,altura2);

    Assert.assertEquals(r1.area(), r2.area());
}
