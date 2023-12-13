package com.restaurante.tep.model.queries;

public class ConsultasSQL {
    public static final String INSERIR_FUNCIONARIO =
            "INSERT INTO tbFuncionario\n" +
            "       (Email,     Senha,  Nome,   CPF,    Endereco,   Telefone)\n" +
            "VALUES (?,         ?,      ?,      ?,      ?,          ?);";

    public static final String OBTER_FUNCIONARIOS = "SELECT * FROM tbFuncionario";

    public static final String OBTER_FUNCIONARIO_POR_ID =
            "SELECT * FROM tbFuncionario\n" +
            "WHERE IdFun = ?";

    public static final String ATUALIZAR_FUNCIONARIO_POR_ID =
            "UPDATE tbFuncionario\n" +
            "SET\n" +
                "Email = ?, Senha = ?, Nome = ?,\n" +
                "CPF = ?, Endereco = ?, Telefone = ?\n" +
            "WHERE IdFun = ?;";

    public static final String DELETAR_FUNCIONARIO_POR_ID =
            "DELETE FROM tbFuncionario\n" +
            "WHERE IdFun = ?";
}
