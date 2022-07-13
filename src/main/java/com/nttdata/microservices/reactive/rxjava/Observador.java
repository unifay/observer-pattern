package com.nttdata.microservices.reactive.rxjava;

public abstract class Observador {
    protected Observable observable;

    public abstract void actualizar();
}
