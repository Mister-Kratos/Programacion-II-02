// Clase principal1
public class GraficoCirculo {
    public static void main(String[] args) {
        Punto centro = new Punto(2, 2);
        int radio = 5;
        Circulo circulo = new Circulo(centro, radio);
        circulo.mostrar(); // Muestra la ventana con el círculo
    }
}
import javax.swing.*;
import java.awt.*;


// Clase principal2
public class GraficoLinea {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 5);
        Punto p2 = new Punto(3, 3);
        Linea linea = new Linea(p1, p2);
        linea.mostrar(); // Muestra la ventana con la línea
    }
}
import javax.swing.*;
import java.awt.*;
