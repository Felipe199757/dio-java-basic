package edu.felipe.tema.tiposVariaveis;

public class tiposVariaveis {
    public static void main(String [] args) throws Exception {
        double salarioMinimo = 2500.34;

        String meuNome = "Felipe Soares";


        //exemplo de casting em variaveis - não recomendado usar com frequência
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // exemplo de constantes 
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10; -> Nessa linha ocorreria um erro, pois, a palavra reservada final
        // faz com que a variavel se torne imutavel
        

    }
}
