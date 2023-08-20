package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaMain {

    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89,0.13);

        Function<Produto, Double> calculaDesconto = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
        UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100: valor + 50;
        UnaryOperator<Double> arredonda = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",","."));
        Function<Double,String> formatar = valor -> "R$"+valor;

//        System.out.println(calculaDesconto.apply(p));
        String precoFinal = calculaDesconto.andThen(impostoMunicipal).andThen(frete).andThen(arredonda).andThen(formatar).apply(p);
        System.out.println(precoFinal);


        Double precoFinal2 = calculaDesconto.andThen(impostoMunicipal).andThen(frete).apply(p);
        System.out.println(precoFinal2);

    }
}
