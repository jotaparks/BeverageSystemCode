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
            st2.setDouble(2, bebida.getQuantidadeEstoque());
            st2.setDouble(3, bebida.getPrecoBalcao());
            st2.setDouble(4, bebida.getPrecoDelivery());
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

    public static void atualizar(int idBebida, String nomeBebida, int quantidadeEstoque, double preco_balcao,
                                 double  preco_delivery){
        Connection con_db = dbconnection.getConnection();
        PreparedStatement st2 = null;
        try {
            st2 = con_db.prepareStatement("UPDATE bebida SET nome_bebida=?, quantidade_estoque=?," +
                    "preco_balcao=?,preco_delivery=? WHERE id_bebida=?");

            st2.setString(1, nomeBebida);
            st2.setInt(2,quantidadeEstoque);
            st2.setDouble(3,preco_balcao);
            st2.setDouble(4,preco_delivery);
            st2.setInt(5, idBebida);

            st2.executeUpdate();
            con_db.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    }

