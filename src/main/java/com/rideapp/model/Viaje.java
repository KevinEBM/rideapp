
package model;

import observer.*;
import state.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Viaje implements Observable {

    protected boolean wifi;
    protected boolean mascota;
    protected boolean equipaje;

    protected EstadoViaje estado;

    private List<Observador> observadores = new ArrayList<>();

    public Viaje() {
        estado = new EstadoSolicitado();
    }

    public void setEstado(EstadoViaje estado) {
        this.estado = estado;
        System.out.println("[State] Estado actual: " + estado.getNombreEstado());
    }

    public EstadoViaje getEstado() {
        return estado;
    }

    public String getNombreEstado() {
        return estado.getNombreEstado();
    }

    public void solicitar() {
        estado.solicitar(this);
    }

    public void asignar() {
        estado.asignar(this);
    }

    public void iniciar() {
        estado.iniciar(this);
    }

    public void finalizar() {
        estado.finalizar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void notificar(String mensaje) {
        for(Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setMascota(boolean mascota) {
        this.mascota = mascota;
    }

    public void setEquipaje(boolean equipaje) {
        this.equipaje = equipaje;
    }
}