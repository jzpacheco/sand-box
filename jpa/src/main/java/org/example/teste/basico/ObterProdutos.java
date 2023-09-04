package org.example.teste.basico;

import infra.ProdutoDAO;
import org.example.modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for(Produto produto: produtos){
            System.out.println(produto);
        }
//                                                   p-> p.getPreco()                   (acumulador, valor -> acumulador + valor)
        double precoTotal = produtos.stream().map(Produto::getPreco).reduce(0.0, Double::sum);
        System.out.println("Valor total é R$"+precoTotal);

        dao.fechar();
    }
}
