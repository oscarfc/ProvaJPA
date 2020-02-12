
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager();
        em.createQuery("select e from AnimaleDto e order by e.id_animali").getResultList().forEach(System.out::println);
        AnimaleDto a = new AnimaleDto("12w", "34q", "56r", "78u");
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }

}
