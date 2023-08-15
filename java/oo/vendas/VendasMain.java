package oo.vendas;

public class VendasMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Monitor", 1200);

        Item item1 = new Item(1, produto1);
        Item item2 = new Item(2, new Produto("Teclado", 550));

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionarItem(item1);
        compra2.adicionarItem(item2);

        Cliente cliente = new Cliente("Maria");

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.valorTotal());
    }
}
