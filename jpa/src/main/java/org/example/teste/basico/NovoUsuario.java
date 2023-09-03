package org.example.teste.basico;

import org.example.modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Tonho", "tonho@outlook.com");
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.persist(new Usuario("Adamastor", "adamastor@gmail.com"));
        em.persist(new Usuario("Alanpa", "alanpa10@jogado.com"));
        em.persist(new Usuario("Enner", "valencia@avante.com"));
        em.persist(new Usuario("Aranguiz", "aranguiz@principe.uk"));
        em.persist(new Usuario("Rochet", "nino@wall.com"));
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
