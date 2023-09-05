package org.example.teste.umpraum;

import infra.DAO;
import org.example.modelo.umpraum.Assento;
import org.example.modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        daoCliente.fechar();
        System.out.println(cliente.getAssento().getNome());

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(1L);
        System.out.println(assento.getCliente().getNome());
        daoAssento.fechar();
    }
}
