package com.nttdata.microservices.reactive.rxjava;

public class OctalObservador extends Observador {
    public OctalObservador(Observable observable) {
        this.observable = observable;
        this.observable.inscribir(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Octal String: " + Integer.toOctalString(observable.getEstado()));
    }
}