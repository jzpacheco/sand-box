package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalcularMediaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de nota a ser calculada: ");
        int num = sc.nextInt();

        double notas[] = new double[num];

        double total = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Insira a nota "+i);
            notas[i] = sc.nextDouble();
            total += notas[i];
        }
        System.out.println("Notas: ");
        for (double nota:notas) {
            System.out.print(nota+ " ");
        }
        double teste = Arrays.stream(notas).sum();
        System.out.println("\nMédia final: "+total/num);
        System.out.println("Média final 2: "+teste/num);
        System.out.println(total);
        System.out.println(num);

        sc.close();
    }


}
