package com.nttdata.microservices.reactive.rxjava;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        // Se instancia un Observable
        Observable observable = new Observable();

        // Se instancian los observadores pasandole el observable
        new HexaObservador(observable);
        new OctalObservador(observable);
        new BinaryObservador(observable);

        // Se comienzan los cambios de estados
        System.out.println("Cambio de estado: 15");
        observable.setEstado(15);
        System.out.println("Cambio de estado: 10");
        observable.setEstado(10);
    }
}