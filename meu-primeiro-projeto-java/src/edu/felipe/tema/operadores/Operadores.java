package edu.felipe.tema.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Concatenação com o operador "+"
        String nomeCompleto = "Felipe " + "Soares";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        // Incrementação e decrementação

        int numero = 5;
        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        System.out.println(--numero);
        System.out.println(++numero);

        // negação de valores booleanos
        boolean variavel = true;

        variavel = !true;
        System.out.println(variavel);

        // operador ternario

        int a = 6;
        int b = 6;

        /*
         * // modo convencional do if
         * String resultado = "";
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */
        // modo ternario
        String resultado = a == b ? resultado = "verdadeiro" : "falso";
        System.out.println(resultado);

        // operadores aritmeticos, relacionais e logicos

        String nomeUm = "Felipe";
        String nomeDois = new String("Felipe");
        /*
        nesse caso o comparativo normal do sinal de igual resultaria em erro, pois numero2 está criando
        um novo objeto
        System.out.println(nomeUm == nomeDois);
        nesse caso para relacionar corretamente seria o exemplo abaixo
         */

         System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual de numero2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2 ? " + simNao);

        if (numero1 < numero2) {
            System.out.println("numero1 é menor que numero2");
        } else if (numero1 > numero2) {
            System.out.println("numero1 é maior que numero2");
        }

        boolean condicao1 = false;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
        System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
        System.out.println("uma das condições é verdadeira");
        }
    }
}
