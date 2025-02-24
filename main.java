public class Main {
    public static void main(String[] args) {

        g2d.drawLine(50, 50, 200, 50);
        g2d.drawOval(100, 100, 50, 50);
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(15, 20);
        Punto centro = new Punto(10, 15);

        Linea linea = new Linea(p1, p2);

        Circulo circulo = new Circulo(centro, 5.0f);

        System.out.println("=== informacion de los puntos ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(centro);
        System.out.println();

        System.out.println("=== informacion de la linea ===");
        System.out.println(linea);
        linea.dibujaLinea();
        System.out.println();

        System.out.println("=== informaciin del circulo ===");
        System.out.println(circulo);
        circulo.dibujaCirculo();
        System.out.println();

        System.out.println("=== coordenadas del punto p2 ===");
        System.out.println(p2.coord_cartesianas());
        System.out.println(p2.coord_polares());
    }
}
