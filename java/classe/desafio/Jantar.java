package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida feijao = new Comida("Feijão",200);
        Comida arroz = new Comida("Arroz", 350);

        Pessoa p1 = new Pessoa("Pedro",70);

        System.out.printf("Nome: %s\nPeso: %f \n",p1.nome,p1.peso);
        p1.comer(feijao);
        System.out.println("Peso da pessoa pós comer feijão: "+ p1.peso);
        p1.comer(arroz);
        System.out.println("Peso da pessoa pós comer arroz: "+ p1.peso);
    }
}
