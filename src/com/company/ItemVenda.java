package com.company;


import com.company.controller.BebidaController;

public class ItemVenda {
    private int idItemVenda;
    private int quantVendida;
    private double valorVendido;
    private BebidaController bebida;
    private Venda venda;

    public ItemVenda(int idItemVenda){
        this.idItemVenda=idItemVenda;
    }
    //metodos
    public void adicionaBebida(BebidaController bebida){
        this.bebida=bebida;
    }
    public void adicionaVenda(Venda venda){
        this.venda=venda;
    }
    public void atualizaQuantidadeVendida(int quantVendida){
        this.quantVendida=quantVendida;
        bebida.atualizaEstoque(quantVendida);
    }
    public void atualizaValorVendido(int quantVendida){
        this.valorVendido=quantVendida*(bebida.getPrecoBalcao());
    }

    public String toStringItemVenda(){
        return "Item: " + bebida.getNomeBebida() +
                " Quantidade vendida: " + quantVendida + " Valor vendido: " +
                valorVendido;
    }

    public double getValorVendido() {
        return valorVendido;
    }
}
