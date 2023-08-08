package study;

public class Data {
    int dia;
    int mes;
    int ano;

    Data (){
        dia = 01;
        mes = 01;
        ano = 1970;
    };

    Data(int pDia, int pMes, int pAno){
        dia = pDia;
        mes = pMes;
        ano = pAno;


    };

    String dataFormatada(){
      return  String.format("%d/%d/%d", dia, mes, ano);
    }
}
