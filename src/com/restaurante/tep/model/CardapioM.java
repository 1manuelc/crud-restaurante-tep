package com.restaurante.tep.model;

public class CardapioM {
    private int idItemCardapio;
    private int idCategoria;
    private String nome;
    private String descricao;
    private double preco;
    private int ativo;

    public CardapioM() {}

    public CardapioM(int idItemCardapio, int idCategoria, String nome, String descricao, double preco, int ativo)
    {
        this.idItemCardapio = idItemCardapio;
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.ativo = ativo;
    }
    
    public int getIdItemCardapio() {
        return idItemCardapio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
}
