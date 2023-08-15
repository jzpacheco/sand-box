package oo.vendas;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){
        this.itens.add(item);
    }

    void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(qtde, p));
    }

    double valorCompra(){
        double valorCompra = 0;
        for (Item item: this.itens){
            valorCompra += item.valorItens();
        }
        return valorCompra;
    }
}
