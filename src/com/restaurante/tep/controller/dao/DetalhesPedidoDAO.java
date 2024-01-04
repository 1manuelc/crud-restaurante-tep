package com.restaurante.tep.controller.dao;

import com.mysql.jdbc.PreparedStatement;
import com.restaurante.tep.model.DetalhesPedido;
import com.restaurante.tep.model.factory.ConnectionFactory;
import com.restaurante.tep.model.queries.ConsultasSQL;
import com.restaurante.tep.controller.tools.ObjectTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetalhesPedidoDAO {
    public static boolean inserirDetalhesPedido(DetalhesPedido detalhesPedidoAtual) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.INSERIR_DETALHES_PEDIDO;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, detalhesPedidoAtual.getIdPedido());
                consultaPreparada.setInt(2, detalhesPedidoAtual.getIdItemCardapio());
                consultaPreparada.setInt(3, detalhesPedidoAtual.getQuantidade());
                consultaPreparada.setDouble(4, detalhesPedidoAtual.getPreco());

                consultaPreparada.executeUpdate();
                operacaoBemSucedida = true;

            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao preparar consulta", 20, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 20, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    public static List<DetalhesPedido> obterListaDetalhesPedidos() {
        String consultaAtual = ConsultasSQL.OBTER_DETALHES_PEDIDO;
        List<DetalhesPedido> listaDetalhesPedidos = new ArrayList<>();
        ResultSet resultados = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                resultados = consultaPreparada.executeQuery();

                while (resultados.next()) {
                    DetalhesPedido detalhesPedido = new DetalhesPedido(
                            resultados.getInt("IdDetalhesPed"),
                            resultados.getInt("IdPedido"),
                            resultados.getInt("IdItemCardapio"),
                            resultados.getInt("Quantidade"),
                            resultados.getDouble("Preco")
                    );

                    listaDetalhesPedidos.add(detalhesPedido);
                }
            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter dados da consulta", 59, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 59, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } finally {
            try {
                ObjectTools.fecharObjetos(resultados);
            } catch (SQLException e) {
                ObjectTools.imprimirErro(
                        "Erro ao fechar resultados", 97, "DetalhesPedidoDAO",
                        e.getMessage(),
                        Arrays.toString(e.getStackTrace())
                );
            }
        }

        return listaDetalhesPedidos;
    }

    public static DetalhesPedido obterDetalhesPedidoPorId(int id) {
        String consultaAtual = ConsultasSQL.OBTER_DETALHES_PEDIDO_POR_ID;
        ResultSet resultados = null;
        DetalhesPedido detalhesPedido = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                resultados = consultaPreparada.executeQuery();

                if (resultados.next()) {
                    detalhesPedido = new DetalhesPedido(
                            resultados.getInt("IdDetalhesPed"),
                            resultados.getInt("IdPedido"),
                            resultados.getInt("IdItemCardapio"),
                            resultados.getInt("Quantidade"),
                            resultados.getDouble("Preco")
                    );
                    System.out.println("DetalhesPedido de id " + id + " obtido!");

                } else {
                    System.err.println("DetalhesPedido de id " + id + " inexistente!");
                    return null;
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter resultados da consulta", 115, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 115, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );

        } finally {
            try {
                ObjectTools.fecharObjetos(resultados);
            } catch (SQLException e) {
                ObjectTools.imprimirErro(
                        "Erro ao fechar resultados", 155, "DetalhesPedidoDAO",
                        e.getMessage(),
                        Arrays.toString(e.getStackTrace())
                );
            }
        }

        return detalhesPedido;
    }
    
    public static DetalhesPedido obterDetalhesPedidoPorIdPedido(int id) {
        String consultaAtual = ConsultasSQL.OBTER_DETALHES_PEDIDO_POR_ID_PEDIDO;
        ResultSet resultados = null;
        DetalhesPedido detalhesPedido = null;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                resultados = consultaPreparada.executeQuery();

                if (resultados.next()) {
                    detalhesPedido = new DetalhesPedido(
                            resultados.getInt("IdDetalhesPed"),
                            resultados.getInt("IdPedido"),
                            resultados.getInt("IdItemCardapio"),
                            resultados.getInt("Quantidade"),
                            resultados.getDouble("Preco")
                    );
                    System.out.println("DetalhesPedido de id " + id + " obtido!");

                } else {
                    System.err.println("DetalhesPedido de id " + id + " inexistente!");
                    return null;
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao obter resultados da consulta", 115, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 115, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );

        } finally {
            try {
                ObjectTools.fecharObjetos(resultados);
            } catch (SQLException e) {
                ObjectTools.imprimirErro(
                        "Erro ao fechar resultados", 155, "DetalhesPedidoDAO",
                        e.getMessage(),
                        Arrays.toString(e.getStackTrace())
                );
            }
        }

        return detalhesPedido;
    }

    public static boolean deletarDetalhesPedidoPorId(int id) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.DELETAR_DETALHES_PEDIDO_POR_ID;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                int linhasAfetadas = consultaPreparada.executeUpdate();

                if (linhasAfetadas == 0) {
                    System.err.println("DetalhesPedido de id " + id + " inexistente!");
                } else {
                    operacaoBemSucedida = true;
                    System.out.println("DetalhesPedido de id " + id + " deletado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta", 213, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 213, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }
    
    public static boolean deletarDetalhesPedidoPorIdPedido(int id) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.DELETAR_DETALHES_PEDIDO_POR_ID_PED;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                int linhasAfetadas = consultaPreparada.executeUpdate();

                if (linhasAfetadas == 0) {
                    System.err.println("DetalhesPedido de id " + id + " inexistente!");
                } else {
                    operacaoBemSucedida = true;
                    System.out.println("DetalhesPedido de id " + id + " deletado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta", 213, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 213, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }
    
    public static int countQuantidadePedidos() {
        String consultaAtual = ConsultasSQL.SELECT_COUNT_PEDIDOS;
        ResultSet resultados = null;
        int countQtde = 0;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
             PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                resultados = consultaPreparada.executeQuery();
                
                if (resultados.next()) {
                    countQtde = resultados.getInt("COUNT_QTDE_TOTAL");
                } else {
                     System.err.println("Erro no select!");
                }
            } else {
                throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
            }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao preparar consulta", 20, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 20, "DetalhesPedidoDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }
        return countQtde;
    }
}
