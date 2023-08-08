package persistencia;

import libreria.entidades.Editorial;
import java.util.List;

public class EditorialDAO extends DAO {

    public void persisitrEditorial(Editorial editorial) {

        persisitrEntidad(editorial);

    }

    public void actualizarEstadoEditorial(Editorial editorial) {

        actualizarEstadoEntidad(editorial);
    }

    public List consultarEditorial() {
        String jpql = "SELECT e FROM Editorial e";
        return em.createQuery(jpql).getResultList();
    }
}
