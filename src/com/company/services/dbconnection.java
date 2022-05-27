package com.company.services;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnection {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/gerbd";//banco de dados remoto coloca-se o endereco IP;
    private static final String USER = "root";
    private static final String SENHA = "root";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, SENHA);

            } catch (Exception ex) {
            throw new RuntimeException("falha ao conectar com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("erro ao fechar a conexão" + ex);
            }
        }

    }

    public static void closeConnection(Connection con, PreparedStatement stat) {
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println("erro ao fechar a conexão" + ex);
            }
        }

        closeConnection(con);
    }

    public static void closeConnection(Connection con, PreparedStatement stat, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("erro ao fechar a conexão" + ex);
            }
        }

        closeConnection(con, stat);
    }

}