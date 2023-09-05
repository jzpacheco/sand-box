package org.example.teste.umpraum;

import infra.DAO;
import org.example.modelo.umpraum.Assento;
import org.example.modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();
        Assento assento = new Assento("4H");
        Cliente cliente = new Cliente("Carlos", assento);

        dao.abrirTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fechar();
    }
}
