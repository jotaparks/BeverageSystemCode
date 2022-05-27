package com.company.model;

import com.company.controller.BebidaController;
import com.company.services.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BebidaModel {
    public static void inserir(BebidaController bebida){
        Connection con_db = dbconnection.getConnection();
        PreparedStatement st2 = null;
        try {
            st2 = con_db.prepareStatement("INSERT INTO bebida"
                    + "(id_bebida,nome_bebida,quantidade_estoque,preco_balcao,preco_delivery) VALUES (null, ?, ?, ? , ?)");

            st2.setString(1, bebida.getNomeBebida());
            st2.setDouble(2, 0);
            st2.setDouble(3, 0);
            st2.setDouble(4, 0);
            st2.executeUpdate();
            con_db.commit();
        }catch(Exception e){
            System.out.println(e);
        }


    }

    public static void deletar(int idBebida) {
        Connection con_db = dbconnection.getConnection();
        PreparedStatement st2 = null;
        try {
            st2 = con_db.prepareStatement("DELETE FROM bebida WHERE id_bebida=?");

            st2.setInt(1, idBebida);

            st2.executeUpdate();
            con_db.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void atualiza(int idBebida, String ){

    }
}
