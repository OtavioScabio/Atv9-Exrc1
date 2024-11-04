package com.example.atv9_exrc1.model;
//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class atletaJuvenil extends atleta{

    String anosPratica;

    public atletaJuvenil(){
        super();
    }

    public String getAnosPratica() {
        return anosPratica;
    }

    public void setAnosPratica(String anosPratica) {
        this.anosPratica = anosPratica;
    }

    @Override
    public String toString() {
        return "atletaJuvenil{" +
                "nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", bairro='" + bairro + '\'' +
                ", anosPratica='" + anosPratica + '\'' +
                '}';
    }
}


