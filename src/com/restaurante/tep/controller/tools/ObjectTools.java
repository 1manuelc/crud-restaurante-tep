package com.restaurante.tep.controller.tools;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class ObjectTools {
    public static void fecharObjetos(ResultSet rst) throws SQLException {
        try { if (rst != null) rst.close(); }
        catch (SQLException e) {
            ObjectTools.imprimirErro(
                "Erro ao fechar resultados", 14, "ObjectTools",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
            throw new SQLException();
        }
    }

    public static PreparedStatement obterConsultaPreparada(String consulta, Connection conexao) {
        PreparedStatement consultaPreparada = null;
        try {
            if(conexao != null) consultaPreparada = (PreparedStatement) conexao.prepareStatement(consulta);
            else throw new SQLException();
        } catch(SQLException e) {
            ObjectTools.imprimirErro(
                "Erro ao inicializar consulta preparada", 24, "ObjectTools",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        }

        return consultaPreparada;
    }

    public static void imprimirErro(String stringErro, int linha,
                                    String nomeClasse, String msgErro, String pilha) {
        System.err.printf(
                "%s (linha=%d classe=%s)" +
                "%s" +
                "%s\n",
                stringErro, linha, nomeClasse,
                msgErro,
                pilha
        );
    }
}
