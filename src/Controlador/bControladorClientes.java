/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.aModeloClientes;
import Modelo.aaCliente;
import Modelo.aaaExcepcionRango;
import Modelo.bModeloEmpleados;
import Modelo.cModeloAutos;
import Modelo.ccCoche;
import Modelo.dModeloServicios;
import Modelo.ddServicio;
import Vista.Principal;
import Vista._DashboardCliente;
import Vista._DashboardOperador;
import Vista.__ComprarAuto;
import Vista.__ModificarCliente;
import Vista.__RegistrarCliente;
import Vista.__SolicitarServicio;
import Vista.__SolicitarServicioCarWash;
import Vista.__SolicitarServicioChangeOil;
import Vista.__SolicitarServicioLlantas;
import Vista.__SolicitarServicioRevision;
import Vista.___FacturaPago;
import Vista.xContratarEmpleado;
import Vista.xDespedirEmpleado;
import Vista.xEliminarCliente;
import Vista.xModificarEmpleado;
import Vista.xVisualizarClientes;
import Vista.xVisualizarTecnicos;
import Vista.xVisualizarVendedores;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class bControladorClientes {
    //Objetos Vistas
        private Principal objetoVentanaPrincipal;
        private _DashboardCliente objetoVentanaCliente;
        private __RegistrarCliente objetoVentanaRegistrarCliente;
        private __ModificarCliente objetoVentanaModificarCliente;
        private __ComprarAuto objetoVentanaComprarAuto;
        private __SolicitarServicio objetoVentanaSolicitarServicio;
        private __SolicitarServicioCarWash objetoVentanaSolicitarAutolavado;
        private __SolicitarServicioChangeOil objetoVentanaSolicitarCambioAceite;
        private __SolicitarServicioLlantas objetoVentanaSolicitarCambioLlantas;
        private __SolicitarServicioRevision objetoVentanaSolicitarRevision;
        private ___FacturaPago objetoVentanaFacturaPago;        
        private _DashboardOperador objetoVentanaOperador;
        private xContratarEmpleado objetoVentanaContratarEmpleado;
        private xModificarEmpleado objetoVentanaModificarEmpleado;
        private xDespedirEmpleado objetoVentanaDespedirEmpleado;
        private xEliminarCliente objetoVentanaEliminarCliente;
        private xVisualizarClientes objetoVentanaVisualizarClientes;
        private xVisualizarTecnicos objetoVentanaVisualizarTecnicos;
        private xVisualizarVendedores objetoVentanaVisualizarVendedores;
        //Objetos Modelos
        private aModeloClientes objetoModeloClientes;
        private bModeloEmpleados objetoModeloEmpleados;
        private cModeloAutos objetoModeloAutos;
        private dModeloServicios objetoModeloServicios;
        //Objeto Controlador
        private bControladorClientes controlClientes;

    public void setObjetoVentanaPrincipal(Principal objetoVentanaPrincipal) {
        this.objetoVentanaPrincipal = objetoVentanaPrincipal;
    }

    public void setObjetoVentanaCliente(_DashboardCliente objetoVentanaCliente) {
        this.objetoVentanaCliente = objetoVentanaCliente;
    }

    public void setObjetoVentanaRegistrarCliente(__RegistrarCliente objetoVentanaRegistrarCliente) {
        this.objetoVentanaRegistrarCliente = objetoVentanaRegistrarCliente;
    }

    public void setObjetoVentanaModificarCliente(__ModificarCliente objetoVentanaModificarCliente) {
        this.objetoVentanaModificarCliente = objetoVentanaModificarCliente;
    }

    public void setObjetoVentanaComprarAuto(__ComprarAuto objetoVentanaComprarAuto) {
        this.objetoVentanaComprarAuto = objetoVentanaComprarAuto;
    }

    public void setObjetoVentanaSolicitarServicio(__SolicitarServicio objetoVentanaSolicitarServicio) {
        this.objetoVentanaSolicitarServicio = objetoVentanaSolicitarServicio;
    }

    public void setObjetoVentanaSolicitarAutolavado(__SolicitarServicioCarWash objetoVentanaSolicitarAutolavado) {
        this.objetoVentanaSolicitarAutolavado = objetoVentanaSolicitarAutolavado;
    }

    public void setObjetoVentanaSolicitarCambioAceite(__SolicitarServicioChangeOil objetoVentanaSolicitarCambioAceite) {
        this.objetoVentanaSolicitarCambioAceite = objetoVentanaSolicitarCambioAceite;
    }

    public void setObjetoVentanaSolicitarCambioLlantas(__SolicitarServicioLlantas objetoVentanaSolicitarCambioLlantas) {
        this.objetoVentanaSolicitarCambioLlantas = objetoVentanaSolicitarCambioLlantas;
    }

    public void setObjetoVentanaSolicitarRevision(__SolicitarServicioRevision objetoVentanaSolicitarRevision) {
        this.objetoVentanaSolicitarRevision = objetoVentanaSolicitarRevision;
    }

    public void setObjetoVentanaFacturaPago(___FacturaPago objetoVentanaFacturaPago) {
        this.objetoVentanaFacturaPago = objetoVentanaFacturaPago;
    }

    public void setObjetoVentanaOperador(_DashboardOperador objetoVentanaOperador) {
        this.objetoVentanaOperador = objetoVentanaOperador;
    }

    public void setObjetoVentanaContratarEmpleado(xContratarEmpleado objetoVentanaContratarEmpleado) {
        this.objetoVentanaContratarEmpleado = objetoVentanaContratarEmpleado;
    }

    public void setObjetoVentanaModificarEmpleado(xModificarEmpleado objetoVentanaModificarEmpleado) {
        this.objetoVentanaModificarEmpleado = objetoVentanaModificarEmpleado;
    }

    public void setObjetoVentanaDespedirEmpleado(xDespedirEmpleado objetoVentanaDespedirEmpleado) {
        this.objetoVentanaDespedirEmpleado = objetoVentanaDespedirEmpleado;
    }

    public void setObjetoVentanaEliminarCliente(xEliminarCliente objetoVentanaEliminarCliente) {
        this.objetoVentanaEliminarCliente = objetoVentanaEliminarCliente;
    }

    public void setObjetoVentanaVisualizarClientes(xVisualizarClientes objetoVentanaVisualizarClientes) {
        this.objetoVentanaVisualizarClientes = objetoVentanaVisualizarClientes;
    }

    public void setObjetoVentanaVisualizarTecnicos(xVisualizarTecnicos objetoVentanaVisualizarTecnicos) {
        this.objetoVentanaVisualizarTecnicos = objetoVentanaVisualizarTecnicos;
    }

    public void setObjetoVentanaVisualizarVendedores(xVisualizarVendedores objetoVentanaVisualizarVendedores) {
        this.objetoVentanaVisualizarVendedores = objetoVentanaVisualizarVendedores;
    }

    public void setObjetoModeloClientes(aModeloClientes objetoModeloClientes) {
        this.objetoModeloClientes = objetoModeloClientes;
    }

    public void setObjetoModeloEmpleados(bModeloEmpleados objetoModeloEmpleados) {
        this.objetoModeloEmpleados = objetoModeloEmpleados;
    }

    public void setObjetoModeloAutos(cModeloAutos objetoModeloAutos) {
        this.objetoModeloAutos = objetoModeloAutos;
    }

    public void setObjetoModeloServicios(dModeloServicios objetoModeloServicios) {
        this.objetoModeloServicios = objetoModeloServicios;
    }

    public void setControlClientes(bControladorClientes controlClientes) {
        this.controlClientes = controlClientes;
    }

    public void registraClienteNuevo(String identificador, String nombres, String apellidos, String genero, String edad, String domicilio) throws aaaExcepcionRango, Exception {
        objetoModeloClientes.registraClienteNuevo(identificador, nombres, apellidos, genero, edad, domicilio);
    }

    public aaCliente buscaCliente(String identificador) {
        aaCliente buscaCliente = objetoModeloClientes.buscaExistenciaCliente(identificador);
            
        if(buscaCliente == null){
            return null;
        }else{
            return buscaCliente;
        } 
    }

    public void modificaCliente(String identificador, String nombres, String apellidos, String genero, String edad, String domicilio) throws aaaExcepcionRango {
        objetoModeloClientes.modificaCliente(identificador,nombres,apellidos,genero,edad,domicilio);
    }    

    public void eliminaCliente(String identificador, String nombres, String apellidos, String genero, String edad, String domicilio) {
        objetoModeloClientes.eliminaCliente(identificador,nombres,apellidos,genero,edad,domicilio);
    }

    public ArrayList<aaCliente> cargarListaClientes() {
        ArrayList<aaCliente> ListaClientes = objetoModeloClientes.getListaClientes();
        if(ListaClientes == null){
            JOptionPane.showMessageDialog(null, "Ningun cliente se encuentra registrado");
            return null;
        }else{
            return ListaClientes;
        }  
    }

    public ArrayList<ccCoche> CargarMisCoches() {
            ArrayList<ccCoche> ListaCochesVendidos = objetoModeloAutos.getListaCochesVendidos();
            if(ListaCochesVendidos == null){
                JOptionPane.showMessageDialog(null, "No tienes comprado ningún vehículo");
                return null;
            }else{
                return ListaCochesVendidos;
            }  
    }

    public ArrayList<ddServicio> CargarMiFactura() {
            ArrayList<ddServicio> ListaServiciosVendidos = objetoModeloServicios.getListaServiciosVendidosDeuda();
            if(ListaServiciosVendidos == null){
                JOptionPane.showMessageDialog(null, "No tienes comprado ningún vehículo");
                return null;
            }else{
                return ListaServiciosVendidos;
            }
    }

    public void PagarDeuda(String IdentificadorCliente) {
        objetoModeloServicios.PagarDeuda(IdentificadorCliente);
    }

    public Object mostrarCantidadCochesComprados(String Identificador) {
        
        int CantidadCochesComprados = objetoModeloAutos.mostrarCantidadCochesComprados(Identificador); 
        if(CantidadCochesComprados == 0){
            return 0;
        }else{
            return CantidadCochesComprados;
        }
    }

    public Object mostrarCantidadServiciosRealizados(String Identificador) {
        int CantidadServiciosRealizados = objetoModeloServicios.mostrarCantidadServiciosRealizados(Identificador);
        if(CantidadServiciosRealizados == 0){
            return 0;
        }else{
            return CantidadServiciosRealizados;
        }
    }

    

   
        
        
}
