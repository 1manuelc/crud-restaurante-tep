package com.restaurante.tep.controller.dao;

import com.mysql.jdbc.PreparedStatement;
import com.restaurante.tep.controller.tools.ObjectTools;
import com.restaurante.tep.model.factory.ConnectionFactory;
import com.restaurante.tep.model.queries.ConsultasSQL;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


// Responsável por controlar o povoamento do banco padrao na tela de login
public class RestauranteDAO {
    /**
     * @implNote povoa o banco de dados padrao, antes verificando antes se isso nao foi feito antes.
     * @return boolean para verificacao de conclusao da operacao
     */
    public static boolean povoarBancoRestaurante() {
        boolean operacaoBemSucedida = false;
        String[] consultasAtuais = ConsultasSQL.POVOAR_BANCO_PADRAO;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL()) {
            if (tabelasJaCriadas(conexao)) return false;

            for (String consultaAtual : consultasAtuais) {
                String[] instrucoes = consultaAtual.split(";");
                
                for (String instrucao : instrucoes) {
                    
                    try (PreparedStatement consultaPreparada = (PreparedStatement) conexao.prepareStatement(instrucao)) {
                        int linhasAfetadas = consultaPreparada.executeUpdate();
                        
                        if (linhasAfetadas != 0)
                            operacaoBemSucedida = true;
                    
                    } catch (SQLException e) {
                        ObjectTools.imprimirErro(
                                "Erro ao executar consulta", 33, "RestauranteDAO",
                                e.getMessage(),
                                Arrays.toString(e.getStackTrace())
                        );
                    }
                }
            }
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Banco de dados inexistente", 25, "RestauranteDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    /**
     * @implNote Verifica se tbCardapio (a maior tabela) ja foi inserida, garantindo que todo o banco padrao foi povoado
     */
    private static boolean tabelasJaCriadas(Connection conexao) {
        String consultaTbCardapio = ConsultasSQL.VERIFICAR_EXISTENCIA_INSERCOES;
        boolean tabelasJaExistem = false;

        try (PreparedStatement consultaPreparada = (PreparedStatement) conexao.prepareStatement(consultaTbCardapio);
            ResultSet resultado = consultaPreparada.executeQuery()) {

            if (resultado.next()) tabelasJaExistem = true;

        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta de verificação", 64, "RestauranteDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return tabelasJaExistem;
    }
}

