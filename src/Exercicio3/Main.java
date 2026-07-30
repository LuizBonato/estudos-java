import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> formas = new ArrayList<>();
        formas.add(new Quadrado(5.0));
        formas.add(new Retangulo(5.0, 3.0));
        formas.add(new Circulo(5.0));
        for (FiguraGeometrica s :formas ) {
            System.out.println(s.calcularArea());
        }
    }
}