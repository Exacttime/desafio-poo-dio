package br.com.dio.desafio.dominio.entity;

import java.util.HashSet;
import java.util.Set;

public class Computador {
    Set<Processor> procesadores;
    public Computador() {
        procesadores = new HashSet<>();
    }
    public void colocarProcessamento(Processor processor){
        this.procesadores.add(processor);
    }

    public Set<Processor> getProcesadores() {
        return procesadores;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "procesadores=" + procesadores +
                '}';
    }
    public void setProcesadores(Set<Processor> procesadores) {
        this.procesadores = procesadores;
    }
}
