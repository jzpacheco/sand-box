package classe;

public class DataMain {
    public static void main(String[] args) {
        Data d1 = new Data(14, 07,2022);
        System.out.println(d1.dataFormatada());

        Data d2 = new Data();
        d2.dia = 29;
        d2.mes = 12;
        d2.ano = 2021;
        System.out.println(d2.dataFormatada());

        Data d3 = new Data();
        System.out.println(d3.dataFormatada());
    }
}
