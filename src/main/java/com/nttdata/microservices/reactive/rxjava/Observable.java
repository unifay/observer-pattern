package com.nttdata.microservices.reactive.rxjava;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observador> observadors = new ArrayList<>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public void inscribir(Observador observador) {
        observadors.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadors) {
            observador.actualizar();
        }
    }
}