package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {
        Arroz arroz = new Arroz(450);
        Feijao feijao = new Feijao(200);

        Sorvete sorvete = new Sorvete(150);

        Pessoa pessoa = new Pessoa(99.5);

        pessoa.comer(arroz);
        System.out.println(pessoa);

        pessoa.comer(feijao);
        System.out.println(pessoa);

        pessoa.comer(sorvete);
        System.out.println(pessoa);



    }




}
