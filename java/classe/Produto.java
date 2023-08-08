package classe;

public class Produto {
    String nomeProduto;
    double vlrProduto;
    static double desconto =0.25;

    Produto (){};
    Produto (String nome, double valor){
        nomeProduto = nome;
        vlrProduto = valor;
    };

    double vlrProdutoComDesconto(){
        return vlrProduto * (1 - desconto);
    }
}
