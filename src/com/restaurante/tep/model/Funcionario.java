package com.restaurante.tep.model;

public class Funcionario {
    private int idFun;
    private String email;
    private String senha;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Funcionario(){}

    /**
     * @implNote Construtor com id para preencher funcionário vindo do banco de dados.
     *
     * @param cpf no formato [xxx.xxx.xxx-xx]
     * @param endereco no formato [Rua, Cidade, Num, Cep]
     * @param telefone no formato [(xx)9xxxx-xxxx]
     */
    public Funcionario(int idFun, String email, String senha, String nome,
                       String cpf, String endereco, String telefone) {
        this.idFun = idFun;
        this.email = email;
        this.senha = senha;

        this.nome = nome;
        this.cpf = cpf;

        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * @implNote Construtor sem id para compor um funcionário a ser inserido
     * no banco (o id será atribuído automaticamente pelo MySQL).
     *
     * @param cpf no formato [xxx.xxx.xxx-xx]
     * @param endereco no formato [Rua, Cidade, Num, Cep]
     * @param telefone no formato [(xx)9xxxx-xxxx]
     */
    public Funcionario(String email, String senha, String nome,
                       String cpf, String endereco, String telefone) {
        this.email = email;
        this.senha = senha;

        this.nome = nome;
        this.cpf = cpf;

        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdFun() {return idFun;}
    public void setIdFun(int idFun) {this.idFun = idFun;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    /**
     * @implNote cpf deve ser inserido no formato [xxx.xxx.xxx-xx]
     */
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getEndereco() {return endereco;}
    /**
     * @implNote endereco deve ser inserido no formato [Rua, Cidade, Num, Cep]
     */
    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getTelefone() {return telefone;}
    /**
     * @implNote telefone deve ser inserido no formato [(xx)9xxxx-xxxx]
     */
    public void setTelefone(String telefone) {this.telefone = telefone;}
}
