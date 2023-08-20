package oo.carros;

public class Ferrari extends Carro{

    Ferrari(){
        this(315);
    }

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        if (velocidadeAtual >= 10){
            velocidadeAtual -= 10;
        }else{
            velocidadeAtual = 0;
        }
    }
}
