public class Circulo extends Figura {
    private double raio;

    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public Circulo(double x, double y) {
        super(x, y);
    }

    public Circulo() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "} " + super.toString();
    }

    public double calculaArea() {
        // return Math.pow(raio, 2) * Math.PI;
        return 3.14 * raio * raio;
    }
}
