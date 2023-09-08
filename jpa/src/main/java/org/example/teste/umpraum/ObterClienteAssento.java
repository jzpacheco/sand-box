package org.example.teste.umpraum;

import infra.DAO;
import org.example.modelo.umpraum.Assento;
import org.example.modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println(cliente.getAssento().getNome());
        daoCliente.fechar();

        Assento assento = daoAssento.obterPorId(1L);
        System.out.println(assento.getCliente().getNome());
        daoAssento.fechar();
    }
}
