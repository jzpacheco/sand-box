package infra;

import org.example.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO(){
       super(Produto.class);
    }
}
