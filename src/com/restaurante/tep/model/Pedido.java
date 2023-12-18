package com.restaurante.tep.model;

import java.sql.Date;

public class Pedido {
    private int idPedido;
    private Date dataPedido;
    private int idFun;
    private int idMesa;

    public Pedido() {}

    public Pedido(int idPedido, Date dataPedido, int idFun, int idMesa) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.idFun = idFun;
        this.idMesa = idMesa;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getIdFun() {
        return idFun;
    }

    public void setIdFun(int idFun) {
        this.idFun = idFun;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
}
