package br.com.dio.desafio.dominio.entity;

public abstract class Processor {
    private String nome;
    private double capacidadeDeProcessamento;

    public abstract String processar();

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getCapacidadeDeProcessamento() {return capacidadeDeProcessamento;}
    public void setCapacidadeDeProcessamento(double capacidadeDeProcessamento) {this.capacidadeDeProcessamento = capacidadeDeProcessamento;}
}
