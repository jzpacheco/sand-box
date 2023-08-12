package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos");
        int qtdAluno = sc.nextInt();
        System.out.println("Quantidade de notas/aluno");
        int qtdNota = sc.nextInt();

        double[][] notas = new double[qtdAluno][qtdNota];
        System.out.println(notas.getClass());
        double total = 0;
        for (int i = 0; i < qtdAluno; i++) {
            System.out.println("Aluno "+(i+1));
            for (int j = 0; j < qtdNota; j++) {
                System.out.println("Informe a "+ (i+1) +"a nota");
                notas[i][j] = sc.nextDouble();
                total += notas[i][j];
            }
        }

        double media = total /(qtdAluno * qtdNota);
        System.out.println("Média da turma: "+media);

        for (double[] notasAluno: notas) {
            System.out.println(Arrays.toString(notasAluno));
        }

        sc.close();
    }

}
