package com.company;

public abstract class Pessoa {
    private String nome;
    private String CPF;

    public Pessoa(String nome, String CPF){
        this.nome=nome;
        this.CPF=CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}
