package Exercicio2.src;

public class Cultura extends Produto implements Tributavel {
    public Cultura(double preco){
        super(preco);
    }

    @Override
    public double calcularImposto(){
        return preco * 0.04;
    }

}