/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.aModeloClientes;
import Modelo.bModeloEmpleados;
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

/**
 *
 * @author William
 */
public class aControladorPrincipal {    
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
        private aControladorPrincipal controlPrincipal;

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

        public void setControlPrincipal(aControladorPrincipal controlPrincipal) {
            this.controlPrincipal = controlPrincipal;
        }

    //Navegacion entre botones
        
    public void mostrarVentanaClientes() {
        objetoVentanaRegistrarCliente.setVisible(false);
        objetoVentanaModificarCliente.setVisible(false);
        objetoVentanaComprarAuto.setVisible(false);
        objetoVentanaSolicitarServicio.setVisible(false);
        objetoVentanaPrincipal.setVisible(false);
        objetoVentanaCliente.setVisible(true);
    }

    public void mostrarVentanaOperador() {
        objetoVentanaContratarEmpleado.setVisible(false);
        objetoVentanaModificarEmpleado.setVisible(false);
        objetoVentanaDespedirEmpleado.setVisible(false);
        objetoVentanaEliminarCliente.setVisible(false);
        objetoVentanaVisualizarClientes.setVisible(false);
        objetoVentanaVisualizarTecnicos.setVisible(false);
        objetoVentanaVisualizarVendedores.setVisible(false);
        objetoVentanaPrincipal.setVisible(false);
        objetoVentanaOperador.setVisible(true);        
    }

    public void mostrarVentanaPrincipal() {
        objetoVentanaCliente.setVisible(false);
        objetoVentanaOperador.setVisible(false);
        objetoVentanaPrincipal.setVisible(true);
    }

    public void mostrarVentanaRegistrarCliente() {
        objetoVentanaCliente.setVisible(false);
        objetoVentanaRegistrarCliente.setVisible(true);
    }

    public void mostrarVentanaModificarCliente() {
        objetoVentanaCliente.setVisible(false);
        objetoVentanaModificarCliente.setVisible(true);
    }
    
    public void mostrarVentanaComprarCoche() {
        objetoVentanaCliente.setVisible(false);
        objetoVentanaComprarAuto.setVisible(true);
        objetoVentanaComprarAuto.agregarVendedores();
    }
    
    public void mostrarVentanaSolicitarServicio() {
        objetoVentanaSolicitarAutolavado.setVisible(false);
        objetoVentanaSolicitarCambioAceite.setVisible(false);
        objetoVentanaSolicitarCambioLlantas.setVisible(false);
        objetoVentanaSolicitarRevision.setVisible(false);
        objetoVentanaCliente.setVisible(false);
        objetoVentanaFacturaPago.setVisible(false);
        objetoVentanaSolicitarServicio.setVisible(true);
    }

    public void mostrarVentanaCarWash() {
        objetoVentanaSolicitarServicio.setVisible(false);
        objetoVentanaSolicitarAutolavado.setVisible(true);
        objetoVentanaSolicitarAutolavado.agregarTecnicos1();
    }

    public void mostrarVentanaChangeOil() {
        objetoVentanaSolicitarServicio.setVisible(false);
        objetoVentanaSolicitarCambioAceite.setVisible(true);
        objetoVentanaSolicitarCambioAceite.agregarTecnicos2();
    }

    public void mostrarVentanaCambiarNeumaticos() {
        objetoVentanaSolicitarServicio.setVisible(false);
        objetoVentanaSolicitarCambioLlantas.setVisible(true);
        objetoVentanaSolicitarCambioLlantas.agregarTecnicos3();
    }

    public void mostrarVentanaRevisionMecanica() {
        objetoVentanaSolicitarServicio.setVisible(false);
        objetoVentanaSolicitarRevision.setVisible(true);
        objetoVentanaSolicitarRevision.agregarTecnicos4();
    }

    public void mostrarVentanaImprimirFactura() {
        objetoVentanaSolicitarServicio.setVisible(false);
        objetoVentanaFacturaPago.setVisible(true);
    }

    public void mostrarVentanaContratarEmpleado() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaContratarEmpleado.setVisible(true);
    }

    public void mostrarVentanaModificarDatosEmpleado() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaModificarEmpleado.setVisible(true);
    }

    public void mostrarVentanaDespedirEmpleado() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaDespedirEmpleado.setVisible(true);
    }

    public void mostrarVentanaVisualizarClientes() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaVisualizarClientes.setVisible(true);
    }

    public void mostrarVentanaVisualizarVendedores() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaVisualizarVendedores.setVisible(true);
    }

    public void mostrarVentanaVisualizarTecnicos() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaVisualizarTecnicos.setVisible(true);
    }

    public void mostrarVentanaEliminarCliente() {
        objetoVentanaOperador.setVisible(false);
        objetoVentanaEliminarCliente.setVisible(true);
    }   
        
}
