package org.example.teste.basico;

import org.example.modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 2L);
        em.detach(usuario);

        usuario.setNome("G. Mercado");
        usuario.setEmail("mercado@paredon.com");

        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
