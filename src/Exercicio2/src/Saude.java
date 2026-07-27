package Exercicio2.src;

public class Saude extends Produto implements Tributavel {
    public Saude(double preco){
        super(preco);
    }

    @Override
    public double calcularImposto(){
        return preco * 0.015;
    }

}