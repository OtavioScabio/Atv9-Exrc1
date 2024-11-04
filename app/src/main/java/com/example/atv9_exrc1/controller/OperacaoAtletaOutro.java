package com.example.atv9_exrc1.controller;

import com.example.atv9_exrc1.model.atletaOutro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class OperacaoAtletaOutro implements IOperacao<atletaOutro>{

    private List<atletaOutro> lista;

    public OperacaoAtletaOutro() {
        this.lista = new ArrayList<>();
    }


    @Override
    public void cadastrar(atletaOutro atletaOutro) {
        lista.add(atletaOutro);
    }

    @Override
    public List<atletaOutro> listar() {
        return this.lista;
    }
}
