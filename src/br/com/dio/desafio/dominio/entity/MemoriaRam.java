package br.com.dio.desafio.dominio.entity;

public class MemoriaRam extends Processor {
    public String tipo = "sou memoria ram";
    @Override
    public String processar() {
        return this.getNome() + this.getCapacidadeDeProcessamento() + tipo;
    }

    @Override
    public String toString() {
        return "MemoriaRam{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
