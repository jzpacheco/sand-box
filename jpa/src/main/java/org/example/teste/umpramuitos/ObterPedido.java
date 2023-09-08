package org.example.teste.umpramuitos;

import infra.DAO;
import org.example.modelo.umpramuitos.ItemPedido;
import org.example.modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);
        Pedido pedido = dao.obterPorId(1L);

        for(ItemPedido item: pedido.getItens()){
            System.out.println(item.getProduto().getNome());
            System.out.println(item.getQuantidade());
        }

        dao.fechar();
    }
}
