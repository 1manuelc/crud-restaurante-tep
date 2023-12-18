package com.restaurante.tep.model;

public class DetalhesPedido {
    private int idDetalhesPed;
    private int idPedido;
    private int idItemCardapio;
    private int quantidade;
    private double preco;

    public DetalhesPedido() {}

    public DetalhesPedido(int idDetalhesPed, int idPedido, int idItemCardapio, int quantidade, double preco) {
        this.idDetalhesPed = idDetalhesPed;
        this.idPedido = idPedido;
        this.idItemCardapio = idItemCardapio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getIdDetalhesPed() {
        return idDetalhesPed;
    }

    public void setIdDetalhesPed(int idDetalhesPed) {
        this.idDetalhesPed = idDetalhesPed;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdItemCardapio() {
        return idItemCardapio;
    }

    public void setIdItemCardapio(int idItemCardapio) {
        this.idItemCardapio = idItemCardapio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
