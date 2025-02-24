public class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio;
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro en " + centro + " y radio " + radio);
    }
}
