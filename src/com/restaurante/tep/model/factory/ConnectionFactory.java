package com.restaurante.tep.model.factory;

import com.restaurante.tep.controller.tools.ObjectTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class ConnectionFactory {
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Restaurante";

    public static Connection obterConexaoComMySQL() throws SQLException {
        try {
            return DriverManager.getConnection(DB_URL, USUARIO, SENHA);
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                "Erro ao conectar ao banco de dados", 17, "ConnectionFactory",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
            throw new SQLException();
        }
    }
}
