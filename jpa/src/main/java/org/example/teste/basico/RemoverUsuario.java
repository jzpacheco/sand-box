package org.example.teste.basico;

import org.example.modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 8L);
        em.detach(usuario);
        if (usuario != null) {
            em.getTransaction().begin();
            ;

            em.remove(usuario);

            em.getTransaction().commit();
        }
        System.out.println(usuario);

        em.close();
        emf.close();

    }
}
