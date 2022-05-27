package com.company;

public class Venda{
    private int idVenda;
    private String dataVenda;
    private int tipoVenda;
    private String enderecoEntrega;
    private int formaPagamento;
    private Funcionario funcionario;
    private ItemVenda[] itemVenda = new ItemVenda[maxI];
    private Cliente cliente;
    private double troco;

    private int nItem;
    private static final int maxI=800;

    public Venda(int idVenda, String dataVenda, int tipoVenda, int formaPagamento){
        this.idVenda=idVenda;
        this.dataVenda=dataVenda;
        this.tipoVenda=tipoVenda;
        this.formaPagamento=formaPagamento;
    }
    //metodos
    public void adicionaItemVenda(ItemVenda item){
        if(nItem<=maxI){
            this.itemVenda[nItem++]=item;
        }
    }
    public double imprime(){
        int i;
        double soma=0;
        for(i=0;i<nItem;i++){
            soma=soma+itemVenda[i].getValorVendido();
        }
        return soma;
    }
    public String infosItem(int a){
        return itemVenda[a].toStringItemVenda();
    }

    public void adicionaFuncionario(Funcionario funcionario){
        this.funcionario=funcionario;
    }

    public String retornaInfff() {
        return funcionario.retornaInfo();
    }
    public double trocoR(double valor){
        this.troco=valor-imprime();
        return troco;
    }
    //getters


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public int getnItem() {
        return nItem;
    }
}
