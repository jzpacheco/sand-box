public class DataMain {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data();

        d1.dia = 14;
        d1.mes = 07;
        d1.ano = 2022;

        d2.dia = 29;
        d2.mes = 12;
        d2.ano = 2021;

        System.out.println(d1.dataFormatada());
        System.out.printf(d2.dataFormatada());
    }
}
