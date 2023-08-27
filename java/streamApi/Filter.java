package streamApi;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",2800.99,0.1, true);
        Produto p2 = new Produto("Carregador",300.01,0.25, false);
        Produto p3 = new Produto("Mouse",128.99,0.27, true);
        Produto p4 = new Produto("Teclado",457.99,0.35, false);

        List<Produto> lista = Arrays.asList(p1,p2,p3,p4);

        lista.stream()
                .filter(p -> p.desconto >= 0.25)
                .filter(p -> p.freteGratis)
                .map(produto -> produto.nome+" BIG_SALE")
                .forEach(System.out::println);
    }
}
