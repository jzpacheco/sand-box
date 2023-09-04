package org.example.teste.basico;

import infra.DAO;
import org.example.modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        DAO< Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Caneta", 7.45);
//        dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();

        Produto produto2 = new Produto("Notebook", 1580.45);
        dao.incluirAtomico(produto2).fechar();

        System.out.println("ID 1: "+ produto.getId());
        System.out.println("ID 2: "+ produto2.getId());


    }
}
