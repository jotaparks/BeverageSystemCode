package com.company;

public class Gerente extends Pessoa{
    private int idGerente;

    public Gerente(String nome, String CPF, int idGerente){
        super(nome, CPF);
        this.idGerente=idGerente;
    }

    public int getIdGerente() {
        return idGerente;
    }
}
