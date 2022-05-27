package com.company.controller;

import com.company.model.BebidaModel;
import com.company.view.bebida.Bebida;


public class BebidaController {
    private int idBebida;
    private String nomeBebida;
    private int quantidadeEstoque;
    private double precoBalcao;
    private double precoDelivery;

    public BebidaController(int idBebida, String nomeBebida,
                            int quantidadeEstoque, double precoBalcao, double precoDelivery){
        this.idBebida=idBebida;
        this.nomeBebida=nomeBebida;
        this.quantidadeEstoque=quantidadeEstoque;
        this.precoBalcao=precoBalcao;
        this.precoDelivery=precoDelivery;

        BebidaModel.inserir(this);

    }
    public static void deletar(int idBebida){
        BebidaModel.deletar(idBebida);
    }
    //metodos
    public void atualizaEstoque(int quantVendido){
        this.quantidadeEstoque=quantidadeEstoque-quantVendido;
    }

    //getters
    public double getPrecoBalcao() {
        return precoBalcao;
    }

    public double getPrecoDelivery() {
        return precoDelivery;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }
}
