import javax.swing.*;
import java.awt.*;

// Clase Punto
class Punto {
    int x, y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Clase Circulo 
class Circulo extends JPanel {
    Punto centro;
    int radio;
    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
        setPreferredSize(new Dimension(400, 400)); 
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawOval(centro.x*10, centro.y*10, 2 * radio * 10, 2 * radio * 10);
    }

    // el crculo en una ventana
    public void mostrar() {
        JFrame frame = new JFrame("dibujar circulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
}

// Clase Punto
class Punto {
    int x, y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Linea extends JPanel {
    Punto p1, p2;
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(p1.x*10, p1.y*10, p2.x*10, p2.y*10);
    }
    public void mostrar() {
        JFrame frame = new JFrame("dibujar linea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); 
        frame.pack(); 
        frame.setVisible(true);
    }
}

public class LineaCirculo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(50, 50, 200, 50);

        g2d.drawOval(100, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("linea y ccirculo en Java");
        LineaCirculo panel = new LineaCirculo();

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
