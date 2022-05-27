package com.company.view.bebida;

import com.company.controller.BebidaController;

public class Bebida {
    public static void criarBebida(
            int idBebida, String nomeBebida,
            int quantidadeEstoque, double precoBalcao, double precoDelivery
    ){
        try{
            new BebidaController(001, nomeBebida,20,8.5,10);
            BebidaController.deletar(6);
            System.out.println("Bebida criada com sucesso " + nomeBebida);
        }catch(Exception e){
            System.out.println("Ocorreu um erro ao criar bebida " + nomeBebida + "\n " + e);
        }
    }
}
