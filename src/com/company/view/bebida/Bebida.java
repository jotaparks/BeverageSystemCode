package com.company.view.bebida;

import com.company.controller.BebidaController;

public class Bebida {
    public static void criarBebida(
            int idBebida, String nomeBebida,
            int quantidadeEstoque, double precoBalcao, double precoDelivery
    ){
        try{
            new BebidaController(1,"agua",15,8.6,10);
            BebidaController.deletar(52);
            BebidaController.atualizar(1,"guarana",30,9,12);
            System.out.println("Bebida criada com sucesso " + nomeBebida);
        }catch(Exception e){
            System.out.println("Ocorreu um erro ao criar bebida " + nomeBebida + "\n " + e);
        }
    }
}
