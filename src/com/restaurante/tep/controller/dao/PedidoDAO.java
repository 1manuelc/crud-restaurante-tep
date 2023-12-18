package com.restaurante.tep.controller.dao;

import com.mysql.jdbc.PreparedStatement;
import com.restaurante.tep.model.Pedido;
import com.restaurante.tep.model.factory.ConnectionFactory;
import com.restaurante.tep.model.queries.ConsultasSQL;
import com.restaurante.tep.controller.tools.ObjectTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PedidoDAO {
    public static boolean inserirPedido(Pedido pedidoAtual) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.INSERIR_PEDIDO;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setDate(1, pedidoAtual.getDataPedido());
                consultaPreparada.setInt(2, pedidoAtual.getIdFun());
                consultaPreparada.setInt(3, pedidoAtual.getIdMesa());

                consultaPreparada.executeUpdate();
                operacaoBemSucedida = true;

            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao preparar consulta", 20, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 20, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    public static List<Pedido> obterListaPedidos() {
        String consultaAtual = ConsultasSQL.OBTER_PEDIDOS;
        List<Pedido> listaPedidos = new ArrayList<>();
        ResultSet resultados = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                resultados = consultaPreparada.executeQuery();

                while (resultados.next()) {
                    Pedido pedido = new Pedido(
                            resultados.getInt("IdPedido"),
                            resultados.getDate("DataPedido"),
                            resultados.getInt("IdFun"),
                            resultados.getInt("IdMesa")
                    );

                    listaPedidos.add(pedido);
                }
            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter dados da consulta", 59, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 59, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } finally {
            try {
                ObjectTools.fecharObjetos(resultados);
            } catch (SQLException e) {
                ObjectTools.imprimirErro(
                        "Erro ao fechar resultados", 97, "PedidoDAO",
                        e.getMessage(),
                        Arrays.toString(e.getStackTrace())
                );
            }
        }

        return listaPedidos;
    }
    
    public static boolean deletarPedidoPorId(int id) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.DELETAR_PEDIDO_POR_ID;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                int linhasAfetadas = consultaPreparada.executeUpdate();

                if (linhasAfetadas == 0) {
                    System.err.println("Pedido de id " + id + " inexistente!");
                } else {
                    operacaoBemSucedida = true;
                    System.out.println("Pedido de id " + id + " deletado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta", 109, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 109, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }
    
    public static Pedido obterUltimoPedido() {
        String consultaAtual = ConsultasSQL.OBTER_ULTIMO_PEDIDO;
        ResultSet resultados = null;
        Pedido pedido = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                resultados = consultaPreparada.executeQuery();

                if (resultados.next()) {
                    pedido = new Pedido(
                            resultados.getInt("IdPedido"),
                            resultados.getDate("DataPedido"),
                            resultados.getInt("IdFun"),
                            resultados.getInt("IdMesa")
                    );
                    System.out.println("Último Pedido obtido!");

                } else {
                    System.err.println("Último Pedido inexistente!");
                    return null;
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta", 146, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 146, "PedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return pedido;
    }
}
