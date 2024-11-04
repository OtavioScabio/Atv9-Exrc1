package com.example.atv9_exrc1.model;

import java.util.Date;
//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class atleta {

    String nome;
    String dataNasc;
    String bairro;

    public atleta(String nome, String dataNasc, String bairro) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.bairro = bairro;
    }
    public atleta(){
        super();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "atleta{" +
                "nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
