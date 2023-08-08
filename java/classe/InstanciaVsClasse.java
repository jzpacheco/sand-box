/*
* PARA ACESSAR MEMBRO DE INSTÂNCIA DE UM MÉTODO ESTÁTICO É NECESSÁRIO CRIAR A INSTÂNCIA.
* */
package classe;

public class InstanciaVsClasse {
    int a =3;

    public static void main(String[] args) {
        InstanciaVsClasse d1 = new InstanciaVsClasse();

        System.out.println(d1.a);
    }
}
