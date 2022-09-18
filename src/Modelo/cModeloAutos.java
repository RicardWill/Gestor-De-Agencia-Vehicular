/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.aControladorPrincipal;
import Controlador.bControladorClientes;
import Controlador.cControladorOperador;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class cModeloAutos {

    private aControladorPrincipal ControlPrincipal;
    private bControladorClientes ControlClientes;
    private cControladorOperador ControlOperador;
    
    ArrayList<ccCoche> ListaCochesVendidos = new ArrayList<ccCoche>();
    
    public cModeloAutos() {
        
    }

    public ArrayList<ccCoche> getListaCochesVendidos() {
        return ListaCochesVendidos;
    }
    
    
    public void setControlPrincipal(aControladorPrincipal ControlPrincipal) {
        this.ControlPrincipal = ControlPrincipal;
    }

    public void setControlClientes(bControladorClientes ControlClientes) {
        this.ControlClientes = ControlClientes;
    }

    public void setControlOperador(cControladorOperador ControlOperador) {
        this.ControlOperador = ControlOperador;
    }

    public void registraNuevaVenta(String Identificador, String Vendedor, String Coche) {
        ccCoche objetoCompra = new ccCoche(Identificador,Vendedor,Coche);
        ListaCochesVendidos.add(objetoCompra);
    }

    public int mostrarCantidadCochesComprados(String Identificador) {
        int contador = 0;
        for (int i = 0; i < ListaCochesVendidos.size(); i++) {
            if (ListaCochesVendidos.get(i).getIdentificadorCliente().equals(Identificador)) {
                contador = contador + 1;
            }
        }
        return contador;
        //System.out.println(count);
    }

    public int mostrarVentasPorVendedor(String NombreApellido) {
        int contador = 0;
        for (int i = 0; i < ListaCochesVendidos.size(); i++) {
            if (ListaCochesVendidos.get(i).getNombreVendedorCoche().equals(NombreApellido)) {
                contador = contador + 1;
            }
        }
        return contador;
    }
    
   
}
