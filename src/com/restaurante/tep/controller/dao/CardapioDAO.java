package com.restaurante.tep.controller.dao;

import com.mysql.jdbc.PreparedStatement;
import com.restaurante.tep.model.Cardapio;
import com.restaurante.tep.model.factory.ConnectionFactory;
import com.restaurante.tep.model.queries.ConsultasSQL;
import com.restaurante.tep.controller.tools.ObjectTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardapioDAO {
    public static boolean inserirCardapio(Cardapio cardapioAtual) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.INSERIR_CARDAPIO;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, cardapioAtual.getIdCategoria());
                consultaPreparada.setString(2, cardapioAtual.getNome());
                consultaPreparada.setString(3, cardapioAtual.getDescricao());
                consultaPreparada.setDouble(4, cardapioAtual.getPreco());
                consultaPreparada.setInt(5, cardapioAtual.getAtivo());

                consultaPreparada.executeUpdate();
                operacaoBemSucedida = true;

            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao preparar consulta", 20, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 20, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    
    public static List<Cardapio> obterListaCardapio() {
        String consultaAtual = ConsultasSQL.OBTER_CARDAPIO;
        List<Cardapio> listaCardapio = new ArrayList<>();
        ResultSet resultados = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                resultados = consultaPreparada.executeQuery();

                while (resultados.next()) {
                    Cardapio cardapio = new Cardapio(
                            resultados.getInt("IdItemCardapio"),
                            resultados.getInt("IdCategoria"),
                            resultados.getString("Nome"),
                            resultados.getString("Descricao"),
                            resultados.getDouble("Preco"),
                            resultados.getInt("Ativo")
                    );

                    listaCardapio.add(cardapio);
                }
            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter dados da consulta", 59, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 59, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } finally {
            try {
                ObjectTools.fecharObjetos(resultados);
            } catch (SQLException e) {
                ObjectTools.imprimirErro(
                        "Erro ao fechar resultados", 97, "CardapioDAO",
                        e.getMessage(),
                        Arrays.toString(e.getStackTrace())
                );
            }
        }

        return listaCardapio;
    }

    
    public static Cardapio obterCardapioPorId(int id) {
        String consultaAtual = ConsultasSQL.OBTER_CARDAPIO_POR_ID;
        ResultSet resultados = null;
        Cardapio cardapio = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                resultados = consultaPreparada.executeQuery();

                if (resultados.next()) {
                    cardapio = new Cardapio(
                            resultados.getInt("IdItemCardapio"),
                            resultados.getInt("IdCategoria"),
                            resultados.getString("Nome"),
                            resultados.getString("Descricao"),
                            resultados.getDouble("Preco"),
                            resultados.getInt("Ativo")
                    );
                    System.out.println("Cardápio de id " + id + " obtido!");

                } else {
                    System.err.println("Cardápio de id " + id + " inexistente!");
                    return null;
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter resultados da consulta", 115, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 115, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );

        } finally {
            try {
                ObjectTools.fecharObjetos(resultados);
            } catch (SQLException e) {
                ObjectTools.imprimirErro(
                        "Erro ao fechar resultados", 155, "CardapioDAO",
                        e.getMessage(),
                        Arrays.toString(e.getStackTrace())
                );
            }
        }

        return cardapio;
    }
    
    public static boolean atualizarCardapioPorId(int id, Cardapio cardapioAtualizado) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.ATUALIZAR_CARDAPIO_POR_ID;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, cardapioAtualizado.getIdCategoria());
                consultaPreparada.setString(2, cardapioAtualizado.getNome());
                consultaPreparada.setString(3, cardapioAtualizado.getDescricao());
                consultaPreparada.setDouble(4, cardapioAtualizado.getPreco());
                consultaPreparada.setInt(5, cardapioAtualizado.getAtivo());
                consultaPreparada.setInt(6, id);

                int linhasAfetadas = consultaPreparada.executeUpdate();

                if (linhasAfetadas == 0) {
                    System.err.println("Cardápio de id " + id + " inexistente!");
                } else {
                    operacaoBemSucedida = true;
                    System.out.println("Cardápio de id " + id + " atualizado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter resultados da consulta", 171, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 171, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    public static boolean deletarCardapioPorId(int id) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.DELETAR_CARDAPIO_POR_ID;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                int linhasAfetadas = consultaPreparada.executeUpdate();

                if (linhasAfetadas == 0) {
                    System.err.println("Cardápio de id " + id + " inexistente!");
                } else {
                    System.out.println("Cardápio de id " + id + " deletado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta", 213, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 213, "CardapioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }
}
