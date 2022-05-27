package com.company;

public class Cliente extends Pessoa{
    private String dataNascimento;

    public Cliente (String nome, String CPF, String dataNascimento){
        super(nome, CPF);
        this.dataNascimento=dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
