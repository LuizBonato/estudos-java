package Exercicio2.src;

public class Vestuario extends Produto implements Tributavel {
    public Vestuario(double preco){
        super(preco);
    }

    @Override
    public double calcularImposto(){
        return preco * 0.025;
    }

}