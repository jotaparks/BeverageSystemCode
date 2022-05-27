package com.company;

public class Funcionario extends Pessoa{
    private int idFuncionario;
    private Venda[] venda;

    public Funcionario(String nome, String CPF, int idFuncionario){
        super(nome, CPF);
        this.idFuncionario=idFuncionario;
    }
    public String retornaInfo(){
        return getNome() + " " + idFuncionario;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }
}
