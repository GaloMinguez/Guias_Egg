/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.servicio;

import java.util.ArrayList;
import main.entidad.Producto;
import main.persistencia.ProductoDAO;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {
    
    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public ArrayList<Producto> allProducto() throws Exception {

        return dao.buscarVariosProducto();
    }

    public ArrayList<Producto> allPortatil() throws Exception {
        return dao.buscarPortatilProducto();
    }

    public Producto produc() throws Exception {

        return dao.buscarProducto();
    }

}
