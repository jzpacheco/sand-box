package org.example.teste.umpramuitos;

import infra.DAO;
import org.example.modelo.basico.Produto;
import org.example.modelo.umpramuitos.ItemPedido;
import org.example.modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Caneta",2.75);
        Pedido pedido = new Pedido();
        ItemPedido itemPedido = new ItemPedido(pedido,produto,4);

        dao.abrirTransacao().incluir(produto).incluir(pedido).incluir(itemPedido).fecharTransacao().fechar();

    }
}
