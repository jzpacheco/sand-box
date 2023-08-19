package oo.carros;

public class Carro {
    final int VELOCIDADEMAXIMA;
    double velocidadeAtual = 0;

    Carro(int velocidadeMaxima){
        this.VELOCIDADEMAXIMA = velocidadeMaxima;
    }
    void acelerar(){
        velocidadeAtual += 5;
    }

    void frear(){
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual: "+ velocidadeAtual + "Km/h";
    }
}
