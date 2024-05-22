package br.com.dio.desafio.dominio.entity;

public class PlacaMae extends Processor {
    public String tipo = "sou placa mãe";
    @Override
    public String processar(){
        return this.getNome() + this.getCapacidadeDeProcessamento() + tipo;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}