package streamApi;

public class Produto {
    final String nome;
    final double valor;
    final double desconto;
    final boolean freteGratis;

    public Produto(String nome, double valor, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
}
