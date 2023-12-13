package com.restaurante.tep.controller.dao;

import com.mysql.jdbc.PreparedStatement;
import com.restaurante.tep.model.factory.ConnectionFactory;
import com.restaurante.tep.model.queries.ConsultasSQL;
import com.restaurante.tep.model.Funcionario;
import com.restaurante.tep.controller.tools.ObjectTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncionarioDAO {
    public static boolean inserirFuncionario(Funcionario funAtual) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.INSERIR_FUNCIONARIO;

        try (Connection conexao = ConnectionFactory.obterConexaoComMySQL();
            PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

                if(consultaPreparada != null) {
                    consultaPreparada.setString(1, funAtual.getEmail());
                    consultaPreparada.setString(2, funAtual.getSenha());

                    consultaPreparada.setString(3, funAtual.getNome());
                    consultaPreparada.setString(4, funAtual.getCpf());

                    consultaPreparada.setString(5, funAtual.getEndereco());
                    consultaPreparada.setString(6, funAtual.getTelefone());

                    consultaPreparada.executeUpdate();
                    operacaoBemSucedida = true;

                } else {
                    throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
                }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                "Erro ao preparar consulta", 20, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                 "Erro ao conectar ao banco de dados", 20, "FuncionarioDAO",
                 e.getMessage(),
                 Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    public static List<Funcionario> obterListaFuncionarios() {
        String consultaAtual = ConsultasSQL.OBTER_FUNCIONARIOS;
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        ResultSet resultados = null;

        try(Connection conexao = ConnectionFactory.obterConexaoComMySQL();
            PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

                if(consultaPreparada != null) {
                    resultados = consultaPreparada.executeQuery();

                    while (resultados.next()) {
                        Funcionario funNovo = new Funcionario(
                            resultados.getInt("IdFun"),
                            resultados.getString("Email"),
                            resultados.getString("Senha"),
                            resultados.getString("Nome"),
                            resultados.getString("Endereco"),
                            resultados.getString("CPF"),
                            resultados.getString("Telefone")
                        );

                        listaFuncionarios.add(funNovo);
                    }
                } else {
                    throw new IllegalStateException("Consulta preparada não inicializada corretamente.");
                }

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                "Erro ao obter dados da consulta", 59, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                "Erro ao conectar ao banco de dados", 59, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        } finally {
            try { ObjectTools.fecharObjetos(resultados); }
            catch (SQLException e) {
                ObjectTools.imprimirErro(
                    "Erro ao fechar resultados", 97, "FuncionarioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
                );
            }
        }

        return listaFuncionarios;
    }

    public static Funcionario obterFuncionarioPorId(int id) {
        String consultaAtual = ConsultasSQL.OBTER_FUNCIONARIO_POR_ID;
        ResultSet resultados = null;
        Funcionario funNovo = null;

        try(Connection conexao = ConnectionFactory.obterConexaoComMySQL();
            PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if(consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                resultados = consultaPreparada.executeQuery();

                if(resultados.next()) {
                    funNovo = new Funcionario(
                            resultados.getInt("IdFun"),
                            resultados.getString("Email"),
                            resultados.getString("Senha"),
                            resultados.getString("Nome"),
                            resultados.getString("Endereco"),
                            resultados.getString("CPF"),
                            resultados.getString("Telefone")
                    );
                    System.out.println("Funcionário de id " + id + " obtido!");

                } else {
                    System.err.println("Funcionário de id " + id + " inexistente!");
                    return null;
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                "Erro ao obter resultados da consulta", 115, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                "Erro ao conectar ao banco de dados", 115, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );

        } finally {
            try { ObjectTools.fecharObjetos(resultados); }
            catch (SQLException e) {
                ObjectTools.imprimirErro(
                    "Erro ao fechar resultados", 155, "FuncionarioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
                );
            }
        }

        return funNovo;
    }

    public static boolean atualizarFuncionarioPorId(int id, Funcionario funAtual) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.ATUALIZAR_FUNCIONARIO_POR_ID;

        try(Connection conexao = ConnectionFactory.obterConexaoComMySQL();
            PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setString(1, funAtual.getEmail());
                consultaPreparada.setString(2, funAtual.getSenha());

                consultaPreparada.setString(3, funAtual.getNome());
                consultaPreparada.setString(4, funAtual.getCpf());

                consultaPreparada.setString(5, funAtual.getEndereco());
                consultaPreparada.setString(6, funAtual.getTelefone());

                consultaPreparada.setInt(7, id);

                int linhasAfetadas = consultaPreparada.executeUpdate();

                if(linhasAfetadas == 0) {
                    System.err.println("Funcionário de id " + id + " inexistente!");
                } else {
                    operacaoBemSucedida = true;
                    System.out.println("Funcionário de id " + id + " atualizado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                "Erro ao obter resultados da consulta", 171, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                "Erro ao conectar ao banco de dados", 171, "FuncionarioDAO",
                e.getMessage(),
                Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }

    public static boolean deletarFuncionarioPorId(int id) {
        boolean operacaoBemSucedida = false;
        String consultaAtual = ConsultasSQL.DELETAR_FUNCIONARIO_POR_ID;

        try(Connection conexao = ConnectionFactory.obterConexaoComMySQL();
            PreparedStatement consultaPreparada = ObjectTools.obterConsultaPreparada(consultaAtual, conexao)) {

            if (consultaPreparada != null) {
                consultaPreparada.setInt(1, id);
                int linhasAfetadas = consultaPreparada.executeUpdate();

                if(linhasAfetadas == 0) {
                    System.err.println("Funcionário de id " + id + " inexistente!");
                } else {
                    operacaoBemSucedida = true;
                    System.out.println("Funcionário de id " + id + " deletado!");
                }
            } else throw new IllegalStateException("Consulta preparada não inicializada corretamente.");

        } catch (IllegalStateException e) {
            ObjectTools.imprimirErro(
                    "Erro ao executar consulta", 213, "FuncionarioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        } catch (SQLException e) {
            ObjectTools.imprimirErro(
                    "Erro ao conectar ao banco de dados", 213, "FuncionarioDAO",
                    e.getMessage(),
                    Arrays.toString(e.getStackTrace())
            );
        }

        return operacaoBemSucedida;
    }
}
