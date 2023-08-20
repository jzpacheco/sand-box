package oo.polimorfismo;

public class Comida {
    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        peso = peso/1000;
        if (peso >=0) {
            this.peso = peso;
        }
    }
}
