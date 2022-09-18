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
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class dModeloServicios {

    private aControladorPrincipal ControlPrincipal;
    private bControladorClientes ControlClientes;
    private cControladorOperador ControlOperador;
    
    ArrayList<ddServicio> ListaServiciosVendidos = new ArrayList<ddServicio>();
    ArrayList<ddServicio> ListaServiciosVendidosDeuda = new ArrayList<ddServicio>();

    public ArrayList<ddServicio> getListaServiciosVendidos() {
        return ListaServiciosVendidos;
    }
    
    public ArrayList<ddServicio> getListaServiciosVendidosDeuda() {
        return ListaServiciosVendidosDeuda;
    }
    
    public dModeloServicios() {
        
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

    public void registraNuevoServicio(String Identificador, String Coche, String TecnicoResponsable, String TipoServicio, int CostoServicio) {
        ddServicio objetoCompra = new ddServicio(Identificador,Coche,TecnicoResponsable,TipoServicio,CostoServicio);
        ListaServiciosVendidos.add(objetoCompra);
        ListaServiciosVendidosDeuda.add(objetoCompra);
    }

    public void PagarDeuda(String IdentificadorCliente) {
        Predicate<ddServicio> condition = servicio -> servicio.getIdentificadorCliente().equals(IdentificadorCliente);
        
        //int repeticiones = Collections.frequency(ListaServiciosVendidos, IdentificadorCliente);
        //System.out.println(repeticiones);
        
        int count = 0;
        for (int i = 0; i < ListaServiciosVendidos.size(); i++) {
            if (ListaServiciosVendidos.get(i).getIdentificadorCliente().equals(IdentificadorCliente)) {
                count = count + 1;
            }
        }
        System.out.println(count);     
        
        ListaServiciosVendidosDeuda.removeIf(condition); 
        JOptionPane.showMessageDialog(null, "Usted ha pagado sus servicios, gracias por su compra");
    }

    public int mostrarCantidadServiciosRealizados(String Identificador) {
        int contador = 0;
        for (int i = 0; i < ListaServiciosVendidos.size(); i++) {
            if (ListaServiciosVendidos.get(i).getIdentificadorCliente().equals(Identificador)) {
                contador = contador + 1;
            }
        }
        return contador;
        //System.out.println(count);
    }

    public int mostrarServiciosPorTecnico(String NombreApellido) {
        int contador = 0;
        for (int i = 0; i < ListaServiciosVendidos.size(); i++) {
            if (ListaServiciosVendidos.get(i).getTecnicoResponsable().equals(NombreApellido)) {
                contador = contador + 1;
            }
        }
        return contador;
    }
    
}
