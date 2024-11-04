package com.example.atv9_exrc1.controller;

import com.example.atv9_exrc1.model.atletaSenior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class OperacaoAtletaSenior implements IOperacao<atletaSenior>{

    private List<atletaSenior> lista;

    public OperacaoAtletaSenior() {
        this.lista = new ArrayList<>();
    }


    @Override
    public void cadastrar(atletaSenior atletaSenior) {
        lista.add(atletaSenior);
    }

    @Override
    public List<atletaSenior> listar() {
        return this.lista;
    }

}
