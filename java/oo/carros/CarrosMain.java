package oo.carros;

public class CarrosMain {
    public static void main(String[] args) {

        Carro ferrari = new Ferrari();
        Civic civic = new Civic(180);

        System.out.println(ferrari);
        System.out.println(civic);

        ferrari.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        civic.acelerar();

        System.out.println(ferrari);
        System.out.println(civic);

        ferrari.frear();
        civic.frear();

        System.out.println(ferrari);
        System.out.println(civic);
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();

        System.out.println(ferrari);
        System.out.println(civic);

    }

}
