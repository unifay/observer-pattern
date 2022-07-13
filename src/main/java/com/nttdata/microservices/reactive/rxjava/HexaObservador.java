package com.nttdata.microservices.reactive.rxjava;

public class HexaObservador extends Observador {
    public HexaObservador(Observable observable) {
        this.observable = observable;
        this.observable.inscribir(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Hex String: " + Integer.toHexString(observable.getEstado()).toUpperCase());
    }
}