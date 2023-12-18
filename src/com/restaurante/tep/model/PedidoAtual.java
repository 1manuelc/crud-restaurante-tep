/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.tep.model;

/**
 *
 * @author Off
 */
public class PedidoAtual {
    private int idItemCardapio;
    private String nome;
    private double preco;
    private int qtde;
    
    public PedidoAtual() {}

    public PedidoAtual(int idItemCardapio, String nome, double preco, int qtde) {
        this.idItemCardapio = idItemCardapio;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public int getIdItemCardapio() {
        return idItemCardapio;
    }

    public void setIdItemCardapio(int idItemCardapio) {
        this.idItemCardapio = idItemCardapio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }  
}
