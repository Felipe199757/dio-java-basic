package edu.felipe.tema.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(16);
        System.out.println("Canal atual " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual " + smartTv.canal);
        smartTv.diminuirCanal();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("TV ligada ? " + smartTv.ligada);

    }
}
