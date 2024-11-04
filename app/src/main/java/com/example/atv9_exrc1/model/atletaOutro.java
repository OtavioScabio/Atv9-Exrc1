package com.example.atv9_exrc1.model;
//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class atletaOutro extends atleta{

    String academia;
    Double recorde;

    public atletaOutro (){
        super();
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public Double getRecorde() {
        return recorde;
    }

    public void setRecorde(Double recorde) {
        this.recorde = recorde;
    }

    @Override
    public String toString() {
        return "atletaOutro{" +
                "nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", bairro='" + bairro + '\'' +
                ", academia='" + academia + '\'' +
                ", recorde=" + recorde +
                '}';
    }
}
