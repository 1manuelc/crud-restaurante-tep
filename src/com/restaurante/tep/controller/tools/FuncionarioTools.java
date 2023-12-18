package com.restaurante.tep.controller.tools;

import com.restaurante.tep.model.Funcionario;

import java.util.List;

public class FuncionarioTools {
    public static final int LOGIN_LIBERADO = 0;
    public static final int SENHA_ERRADA = 1;
    public static final int USUARIO_NAO_ENCONTRADO = 2;

    public static int validarLogin(String cpfAtual, String senhaAtual, List<Funcionario> listaFun) {
        boolean usuarioFoiEncontrado = false;
        boolean senhaEstaCorreta = false;

        for(Funcionario fun : listaFun) {

            if(cpfAtual.equals(fun.getCpf())) {
                usuarioFoiEncontrado = true;
                
                if(senhaAtual.equals(fun.getSenha()))
                    senhaEstaCorreta = true;
            }
        }

        if (usuarioFoiEncontrado == false) return USUARIO_NAO_ENCONTRADO;
        else if (senhaEstaCorreta == false) return SENHA_ERRADA;
        return LOGIN_LIBERADO;
    }
}
