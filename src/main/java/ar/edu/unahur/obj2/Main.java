package ar.edu.unahur.obj2;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.testng.Assert;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
/*PRIMER EJERCICIO
        String radioInput = JOptionPane.showInputDialog("Ingrese el radio del circulo 1");
        Integer radio1 = Integer.parseInt(radioInput);
         Circulo circulo1 = new Circulo("azul",radio1);
        // JOptionPane.showMessageDialog(null, "Superficie: " + circulo1.area(),"Superficie",JOptionPane.INFORMATION_MESSAGE);
        System.out.println( circulo1.area());
        */
/*SEGUNDO EJERCICIO
        String radioInput = JOptionPane.showInputDialog("Ingrese el radio del circulo 1");
        Integer radio1 = Integer.parseInt(radioInput);
        SemiCirculo n1 = new SemiCirculo("verde",radio1);
        System.out.println(n1.area());
        */
/*TERCER EJERCICIO
        String radioInput = JOptionPane.showInputDialog("Ingrese la base del triangulo");
        Double base = Double.parseDouble(radioInput);
        String radioInput2 = JOptionPane.showInputDialog("Ingrese la altura del triangulo");
        Double altura = Double.parseDouble(radioInput2);
        Triangulo t1 = new Triangulo("azul",base,altura);
        System.out.println(t1.area());
        */
/*CUARTO EJERCICIO*/
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
        System.out.println(r2.area());
        //VERIFICACION
        Assert.assertEquals(r1, r2);

    }
}
