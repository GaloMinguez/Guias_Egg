package main;

import java.util.ArrayList;
import java.util.Scanner;
import main.entidad.Fabricante;
import main.entidad.Producto;
import main.persistencia.ProductoDAO;
import main.servicio.FabricanteServicio;
import main.servicio.ProductoServicio;

public class Main {

    public static void main(String[] args) throws Exception {
        ProductoServicio pd = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();
        Scanner Leer = new Scanner(System.in);
        int op = 0;
        boolean log = false;
        do {
            try {
                System.out.println("1 - PRODUCTOS COMPLETOS\n2 - PRODUCTOS PRECIO ARTICULO\n"
                        + "3 - ARTICULO PRECIO ENTRE 120 y 202\n4 - PRODUCTO PORTATIL\n5 - PRODUCTO MAS BARATO\n"
                        + "6 - INGRESAR PRODUCTO\n7 - INGRESAR FABRICANTE\n8 - EDITAR PRODUCTO\n9 - SALIR");
                op = Leer.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR - SELECCION");
                Leer.nextLine();
            }
            ArrayList<Producto> p = null;
            ArrayList<Fabricante> f = null;
            switch (op) {
                case 1:
                    p = pd.allProducto();
                    for (Producto producto : p) {
                        System.out.println("Codigo: " + producto.getCodigo()
                                + "\n" + "Nombre: " + producto.getNombre() + "\n"
                                + "Precio: " + producto.getPrecio() + "\n"
                                + "Codigo Fabricante: " + producto.getCodigoFabricante());
                    }
                    System.out.println("============================================");
                    System.out.println("");
                    break;
                case 2:
                    p = pd.allProducto();
                    for (Producto producto : p) {
                        System.out.println("Nombre: " + producto.getNombre()
                                + "\n" + "Precio: " + producto.getPrecio());
                    }
                    System.out.println("============================================");
                    System.out.println("");
                    break;
                case 3:
                    p = pd.allProducto();
                    for (Producto producto : p) {
                        if (producto.getPrecio() >= 120 && producto.getPrecio() <= 202) {
                            System.out.println("Nombre: " + producto.getNombre()
                                    + "\n" + "Precio: " + producto.getPrecio());
                        }
                    }
                    System.out.println("============================================");
                    System.out.println("");
                    break;
                case 4:
                    p = pd.allPortatil();
                    for (Producto producto : p) {
                        System.out.println("Nombre: " + producto.getNombre()
                                + "\n" + "Precio: " + producto.getPrecio());
                    }
                    System.out.println("============================================");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(pd.produc());
                    System.out.println("============================================");
                    System.out.println("");
                    break;
                case 6:
                    Producto producto = new Producto();
                    System.out.println("NOMBRE: ");
                    producto.setNombre(Leer.next());
                    System.out.println("PRECIO: ");
                    producto.setPrecio(Leer.nextDouble());
                    //
                    break;
                case 7:
                    Fabricante fabricante = new Fabricante();
                    System.out.println("NOMBRE: ");
                    fabricante.setNombre(Leer.next());
                    fs.insertFabricante(fabricante);
                    break;
                case 8:
                    p = pd.allProducto();
                    int cont = 1;
                    for (Producto producto1 : p) {
                        System.out.println(cont + "-" + producto1);
                        cont++;
                    }
                    System.out.println("Ingresa el codigo del producto a modificar: ");
                    int opcion = Leer.nextInt();
                    Producto prod = p.get(opcion - 1);
                    System.out.println("Que deseas modificar: ");
                    System.out.println("1 - Nombre\n2 - Precio\n3 - Codigo fabricante: ");
                    int opcion2 = Leer.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingresa el nuevo nombre: ");
                            prod.setNombre(Leer.next());
                            break;
                        case 2:
                            System.out.println("Ingresa el nuevo precio: ");
                            prod.setPrecio(Leer.nextDouble());
                            break;
                        case 3:
                            f = fs.allFabricante();
                            for (Fabricante fabricante1 : f) {
                                System.out.println(fabricante1);
                            }
                            System.out.println("Ingresa el nuevo codigo del fabricante: ");
                            prod.setCodigoFabricante(Leer.nextInt());
                            break;
                        default:
                            System.out.println("Escoge una opcion valida...");
                    }

                    break;
                case 9:
                    log = true;
                           
                    break;
                default:
                    System.out.println("OPCION NO VALIDA...");
                    System.out.println("\n-----------------------------\n");

            }

        } while (!log);

    }

}
