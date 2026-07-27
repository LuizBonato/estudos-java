package Exercicio2.src;

public class Main {
    public static void main(String[] args) {

        Alimentacao arroz = new Alimentacao(100.0);
        Saude vitamina = new Saude(100.0);
        Vestuario camisa = new Vestuario(100.0);
        Cultura livro = new Cultura(100.0);


        Tributavel[] produtos = { arroz, vitamina, camisa, livro };
        for (Tributavel s : produtos){
            System.out.println("Imposto: " + s.calcularImposto());
        }
        }
    }