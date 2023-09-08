package org.example.teste.muitospramuitos;

import infra.DAO;
import org.example.modelo.muitospramuitos.Sobrinho;
import org.example.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Tio tio = new Tio("Adamastor");
        Tio tia = new Tio("Maria");


        Sobrinho sobrinho = new Sobrinho("Anselmo");
        Sobrinho sobrinha = new Sobrinho("Lurdes");

        tio.getSobrinhos().add(sobrinho);
        sobrinho.getTios().add(tio);

        tio.getSobrinhos().add(sobrinha);
        sobrinha.getTios().add(tio);

        tia.getSobrinhos().add(sobrinho);
        sobrinho.getTios().add(tia);

        tia.getSobrinhos().add(sobrinha);
        sobrinha.getTios().add(tia);

        dao.abrirTransacao()
                .incluir(tio)
                .incluir(tia)
                .incluir(sobrinha)
                .incluir(sobrinho)
                .fecharTransacao()
                .fechar();
    }
}
