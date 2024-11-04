package com.example.atv9_exrc1.controller;

import java.util.List;
//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public interface IOperacao <T>{

    public void cadastrar(T t);

    public List<T> listar();
}
