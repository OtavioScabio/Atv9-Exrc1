package com.example.atv9_exrc1.controller;

import com.example.atv9_exrc1.model.atletaJuvenil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class OperacaoAtletaJuvenil implements IOperacao<atletaJuvenil>{

    private List<atletaJuvenil> lista;

    public OperacaoAtletaJuvenil() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(atletaJuvenil atletaJuvenil) {
    lista.add(atletaJuvenil);

    }

    @Override
    public List<atletaJuvenil> listar() {
        return this.lista;
    }


}
