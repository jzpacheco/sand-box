package org.example.teste.muitospramuitos;

import infra.DAO;
import org.example.modelo.muitospramuitos.Ator;
import org.example.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>();

        Filme filmeA = new Filme("Filme muito bom", 10.00);
        Filme filmeB = new Filme("Filme ok", 6D);

        Ator atorA = new Ator("Teste Um");
        Ator atorB = new Ator("Teste Dois");

        filmeA.adicionaAtor(atorA);
        filmeA.adicionaAtor(atorB);

        filmeB.adicionaAtor(atorB);

        dao.incluirAtomico(filmeA);
    }
}
