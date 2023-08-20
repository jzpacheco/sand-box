package oo.polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Peso: "+peso;
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
    public double getPeso() {
        return peso;
    }
}
