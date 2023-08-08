package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {

    EntityManagerFactory emf;
    EntityManager em;

    public DAO() {
        this.emf = Persistence.createEntityManagerFactory("PruebaPU");
        this.em = emf.createEntityManager();
    }

    public void persisitrEntidad(Object object) {

        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }

    }

    public void actualizarEstadoEntidad(Object object) {

        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el estado");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
    }

}