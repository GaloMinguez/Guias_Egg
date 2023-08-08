package persistencia;

import libreria.entidades.Autor;
import java.util.List;

public class AutorDAO extends DAO {

    public void persistirAutor(Autor autor) {

        persisitrEntidad(autor);
    }

    public void actualizarEstadoAutor(Autor autor) {

        actualizarEstadoEntidad(autor);

    }

    public List buscarAutor() {

        return em.createQuery("SELECT a FROM Autor a").getResultList();

    }
}