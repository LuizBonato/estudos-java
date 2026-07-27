package Exercicio2.src;

public class Alimentacao extends Produto implements Tributavel {
public Alimentacao(double preco){
    super(preco);
}

    @Override
    public double calcularImposto(){
    return preco * 0.01;
    }

}