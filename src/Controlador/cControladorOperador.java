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
import Modelo.bbEmpleado;
import Modelo.bbbExcepcionRango;
import Modelo.cModeloAutos;
import Modelo.dModeloServicios;
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
public class cControladorOperador {
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
        private cControladorOperador controlOperador;

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

    public void setControlOperador(cControladorOperador controlOperador) {
        this.controlOperador = controlOperador;
    }

    public void registraEmpleadoNuevo(String Identificador, String Nombres, String Apellidos, String Genero, String Edad, String Telefono, String CorreoElectronico, String TipoEmpleado) throws aaaExcepcionRango, Exception{
        objetoModeloEmpleados.registraEmpleadoNuevo(Identificador,Nombres,Apellidos,Genero,Edad,Telefono,CorreoElectronico,TipoEmpleado);
    }

    public ArrayList<bbEmpleado> cargarListaTecnicos() {
        ArrayList<bbEmpleado> ListaTecnicos = objetoModeloEmpleados.getListaEmpleados();
        if(ListaTecnicos == null){
            JOptionPane.showMessageDialog(null, "Ningun cliente se encuentra registrado");
            return null;
        }else{
            return ListaTecnicos;
        }  
    }

    public bbEmpleado buscaEmpleado(String identificador) {
            bbEmpleado buscaEmpleado = objetoModeloEmpleados.buscaEmpleado(identificador);
            
            if(buscaEmpleado == null){
                return null;
            }else{
                return buscaEmpleado;
            } 
    }

    public void modificaEmpleado(String Identificador, String Nombres, String Apellidos, String Genero, String Edad, String Telefono, String CorreoElectronico, String TipoEmpleado) throws bbbExcepcionRango, Exception {
        objetoModeloEmpleados.modificaEmpleado(Identificador,Nombres,Apellidos,Genero,Edad,Telefono,CorreoElectronico,TipoEmpleado);
    }


    public void eliminaEmpleado(String Identificador, String Nombres, String Apellidos, String TipoEmpleado) {
        objetoModeloEmpleados.eliminaEmpleado(Identificador,Nombres,Apellidos,TipoEmpleado);
    }

    public ArrayList<bbEmpleado> cargarListaVendedores() {
        ArrayList<bbEmpleado> ListaVendedores = objetoModeloEmpleados.getListaEmpleados();
        if(ListaVendedores == null){
            JOptionPane.showMessageDialog(null, "Ningun cliente se encuentra registrado");
            return null;
        }else{
            return ListaVendedores;
        }  
    }

    public void registraNuevaVenta(String Identificador, String Vendedor, String Coche) {
        objetoModeloAutos.registraNuevaVenta(Identificador,Vendedor,Coche);
    }

    public void registraNuevoServicio(String Identificador, String Coche, String TecnicoResponsable, String TipoServicio, int CostoServicio) {
        objetoModeloServicios.registraNuevoServicio(Identificador,Coche,TecnicoResponsable,TipoServicio,CostoServicio);
    }

    public Object mostrarVentasPorVendedor(String NombreApellido) {
        int ventasPorEmpleado = objetoModeloAutos.mostrarVentasPorVendedor(NombreApellido);
        
        if(ventasPorEmpleado == 0){
            return 0;
        }else{
            return ventasPorEmpleado;
        }
    }

    public Object mostrarServiciosPorTecnico(String NombreApellido) {
        int serviciosPorTecnico = objetoModeloServicios.mostrarServiciosPorTecnico(NombreApellido);
        
        if(serviciosPorTecnico == 0){
            return 0;
        }else{
            return serviciosPorTecnico;
        }
    }
        
        
}
