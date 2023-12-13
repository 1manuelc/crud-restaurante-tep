package com.restaurante.tep.controller.tools;

import com.restaurante.tep.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FuncionarioTools {
    public static boolean validarFuncionario(Funcionario func) {
        return !Objects.equals(func, new Funcionario());
    }

    public static boolean validarListaFuncionario(List<Funcionario> lf) {
        List<Funcionario> listaVazia = new ArrayList<>();
        return !Objects.equals(lf, listaVazia);
    }

    public static void imprimirFuncionario(Funcionario func) {
        if(validarFuncionario(func)) {
            System.out.printf(
                    "id: %d\t|\t" + "nome: %s\t|\t" + "email: %s\t|\t" +
                    "cpf: %s\t|\t" + "telefone: %s\t|\t" + "endereco: %s\n",
                    func.getIdFun(), func.getNome(), func.getEmail(),
                    func.getCpf(), func.getTelefone(), func.getEndereco()
            );
        } else {
            System.err.println("Funcionário inválido, impossível ler");
        }
    }

    public static void imprimirListaFuncionario(List<Funcionario> listaFun) {
        if(validarListaFuncionario(listaFun)) {
            if(obterQtdFuncionarios(listaFun) == 0) System.out.println("Lista de funcionários vazia!");
            else {
                for (Funcionario fun : listaFun)
                    imprimirFuncionario(fun);
            }
        } else {
            System.err.println("Lista de funcionários inválida ou vazia, impossível ler");
        }
    }

    public static int obterQtdFuncionarios(List<Funcionario> listaFun) {
        int contadorFun = 0;

        if(validarListaFuncionario(listaFun)) {
            for (Funcionario f : listaFun)
                contadorFun++;
        } else {
            System.err.println("Lista de funcionários inválida, impossível ler");
        }

        return contadorFun;
    }

    public static boolean validarLogin(String cpfAtual, String senhaAtual, List<Funcionario> listaFun) {
        boolean permitirLogin = false;
        boolean usuarioFoiEncontrado = false;
        boolean senhaEstaCorreta = false;

        for(Funcionario fun : listaFun) {

            if(cpfAtual.equals(fun.getCpf())) {
                usuarioFoiEncontrado = true;

                if(senhaAtual.equals(fun.getSenha())) {
                    senhaEstaCorreta = true;
                    permitirLogin = true;
                    System.out.println("Login permitido!");
                }
            }
        }

        if(!usuarioFoiEncontrado) System.out.println("Usuário não encontrado!");
        else if (!senhaEstaCorreta) System.out.println("Senha incorreta para o usuário!");

        return permitirLogin;
    }
}
