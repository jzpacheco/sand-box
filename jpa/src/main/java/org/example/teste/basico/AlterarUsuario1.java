package org.example.teste.basico;

import org.example.modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 1L);
        usuario.setNome("Wanderson");
        usuario.setEmail("wanderson@wandeco.com");

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
