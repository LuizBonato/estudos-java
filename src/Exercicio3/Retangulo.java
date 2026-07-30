public class Retangulo implements FiguraGeometrica {
    protected double base;
    protected double altura;

    public Retangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}