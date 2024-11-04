package com.example.atv9_exrc1.model;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class atletaSenior extends atleta{

    boolean problemaCardiaco;

    public atletaSenior(){
        super();
    }

    public boolean isProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(boolean problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    @Override
    public String toString() {
        return "atletaSenior{" +
                "nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", bairro='" + bairro + '\'' +
                ", problemaCardiaco=" + problemaCardiaco +
                '}';
    }
}
