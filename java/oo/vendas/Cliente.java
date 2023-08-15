package oo.vendas;

import java.util.ArrayList;

public class Cliente {
    final String nomeCliente;
    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nomeCliente = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double valorTotal(){
        double valorTotal = 0;
        for (Compra compra: compras){
            valorTotal += compra.valorCompra();
        }
        return valorTotal;
    }
}
