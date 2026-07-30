public class Quadrado implements FiguraGeometrica {
    protected double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}