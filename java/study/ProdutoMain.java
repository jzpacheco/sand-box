package study;

public class ProdutoMain {
    public static void main(String[] args) {
        System.out.println("Desconto: "+Produto.desconto);
        Produto p1 = new Produto();
        p1.nomeProduto = "study.Produto 1";
        p1.vlrProduto = 100;
        System.out.printf(" %s: %f\n", p1.nomeProduto, p1.vlrProdutoComDesconto());

        Produto p2 = new Produto("study.Produto 2", 200.00);
        System.out.printf(" %s: %f\n", p2.nomeProduto, p2.vlrProdutoComDesconto());

        Produto.desconto = 0.10;
        System.out.println("Desconto: "+Produto.desconto);
        System.out.printf(" %s: %f\n", p1.nomeProduto, p1.vlrProdutoComDesconto());
        System.out.printf(" %s: %f\n", p2.nomeProduto, p2.vlrProdutoComDesconto());

        Produto p3 = new Produto("study.Produto 3", 300.00);
        Produto.desconto = 0.35;
        System.out.println("Desconto: "+Produto.desconto);
        System.out.printf(" %s: %f\n", p1.nomeProduto, p1.vlrProdutoComDesconto());
        System.out.printf(" %s: %f\n", p2.nomeProduto, p2.vlrProdutoComDesconto());
        System.out.printf(" %s: %f\n", p3.nomeProduto, p3.vlrProdutoComDesconto());

    }
}
