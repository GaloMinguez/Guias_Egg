package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import persistencia.AutorDAO;

public class AutorServicio {

    private final AutorDAO dao = new AutorDAO();

    public void guardarAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean bucle;
        do {
            bucle = false;
            Autor autor = new Autor();
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.next();
            autor.setNombre(nombre);
            autor.setAlta(true);
            dao.persistirAutor(autor);
            System.out.println("¿Desea cargar otro autor? S/N");
            if (leer.next().equalsIgnoreCase("S")) {
                bucle = true;
            }
        } while (bucle);
    }

    public void darBajaAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del autor");
        String nombreEditorial = leer.next();
        boolean noEncontrado = true;
        boolean alta = true;
        boolean bucle;

        Autor autor = buscarAutorNombre();
        if (autor != null) {
            do {
                System.out.println("1- Darlo de baja");
                System.out.println("2- Darlo de alta");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1 -> {
                        alta = false;
                        bucle = false;
                    }
                    case 2 -> {
                        alta = true;
                        bucle = false;
                    }
                    default -> {
                        System.out.println("Opción no reconocida");
                        bucle = true;
                    }
                }
            } while (bucle);
            autor.setAlta(alta);
            noEncontrado = false;
            dao.actualizarEstadoAutor(autor);
        }

        if (noEncontrado) {
            System.out.println("Autor no encontrado");
            leer.next();
        }
    }

    public Autor buscarAutorNombre() {
        boolean noEncontrado = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del autor");
        String nombreAutor = leer.next();
        List<Autor> autores = dao.buscarAutor();
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombreAutor)) {
                System.out.println("Autor encontrado");
                System.out.println(autor);
                return autor;
            }
        }
        if (noEncontrado) {
            System.out.println("Autor no encontrado");
        }
        return null;
    }
}
