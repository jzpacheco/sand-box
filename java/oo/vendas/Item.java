package oo.vendas;

public class Item {
    final int quantidade;
    final Produto produto;

    Item(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    double valorItens(){
        return this.produto.vlrProduto * this.quantidade;
    }
}
