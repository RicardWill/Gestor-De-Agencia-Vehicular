/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Principal;

import Controlador.aControladorPrincipal;
import Controlador.bControladorClientes;
import Controlador.cControladorOperador;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Instancia de las interfaces o ventanas
        //Principal
        Principal ObjetoVentanaPrincipal = new Principal();
        //Cliente
        _DashboardCliente ObjetoVentanaCliente = new _DashboardCliente();
        __RegistrarCliente ObjetoVentanaRegistrarCliente = new __RegistrarCliente();
        __ModificarCliente ObjetoVentanaModificarCliente = new __ModificarCliente();
        __ComprarAuto ObjetoVentanaComprarAuto = new __ComprarAuto();
        __SolicitarServicio ObjetoVentanaSolicitarServicio = new __SolicitarServicio();
        __SolicitarServicioCarWash ObjetoVentanaSolicitarAutolavado = new __SolicitarServicioCarWash();
        __SolicitarServicioChangeOil ObjetoVentanaSolicitarCambioAceite = new __SolicitarServicioChangeOil();
        __SolicitarServicioLlantas ObjetoVentanaSolicitarCambioLlantas = new __SolicitarServicioLlantas();
        __SolicitarServicioRevision ObjetoVentanaSolicitarRevision = new __SolicitarServicioRevision();
        ___FacturaPago ObjetoVentanaFacturaPago = new ___FacturaPago();        
        //Operador-Administrador
        _DashboardOperador ObjetoVentanaOperador = new _DashboardOperador();
        xContratarEmpleado ObjetoVentanaContratarEmpleado = new xContratarEmpleado();
        xModificarEmpleado ObjetoVentanaModificarEmpleado = new xModificarEmpleado();
        xDespedirEmpleado ObjetoVentanaDespedirEmpleado = new xDespedirEmpleado();
        xEliminarCliente ObjetoVentanaEliminarCliente = new xEliminarCliente();
        xVisualizarClientes ObjetoVentanaVisualizarClientes = new xVisualizarClientes();
        xVisualizarTecnicos ObjetoVentanaVisualizarTecnicos = new xVisualizarTecnicos();
        xVisualizarVendedores ObjetoVentanaVisualizarVendedores = new xVisualizarVendedores();
        // Fin de instancia de las interfaces o ventanas
        
        //Instancia a las clases de controlador
        aControladorPrincipal ControlPrincipal = new aControladorPrincipal();
        bControladorClientes ControlClientes = new bControladorClientes();
        cControladorOperador ControlOperador = new cControladorOperador();
        // Fin de instancia a las clases de controlador
        
        //Instancia a la clases modelo
        aModeloClientes ObjetoModeloClientes = new aModeloClientes();
        bModeloEmpleados ObjetoModeloEmpleados = new bModeloEmpleados();
        cModeloAutos ObjetoModeloAutos = new cModeloAutos();
        dModeloServicios ObjetoModeloServicios = new dModeloServicios();
        //Fin de todas las clases modelo
        
        //Comunicacion Vistas-Controladores
        ObjetoVentanaPrincipal.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaPrincipal.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaPrincipal.setObjetoControladorOperador(ControlOperador);
        
        ObjetoVentanaCliente.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaCliente.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaCliente.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaRegistrarCliente.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaRegistrarCliente.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaRegistrarCliente.setObjetoControladorOperador(ControlOperador);
        
        ObjetoVentanaModificarCliente.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaModificarCliente.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaModificarCliente.setObjetoControladorOperador(ControlOperador);
            
        ObjetoVentanaComprarAuto.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaComprarAuto.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaComprarAuto.setObjetoControladorOperador(ControlOperador);
        
        ObjetoVentanaSolicitarServicio.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaSolicitarServicio.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaSolicitarServicio.setObjetoControladorOperador(ControlOperador);
        
        ObjetoVentanaSolicitarAutolavado.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaSolicitarAutolavado.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaSolicitarAutolavado.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaSolicitarCambioAceite.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaSolicitarCambioAceite.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaSolicitarCambioAceite.setObjetoControladorOperador(ControlOperador);
         
        ObjetoVentanaSolicitarCambioLlantas.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaSolicitarCambioLlantas.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaSolicitarCambioLlantas.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaSolicitarRevision.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaSolicitarRevision.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaSolicitarRevision.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaFacturaPago.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaFacturaPago.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaFacturaPago.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaOperador.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaOperador.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaOperador.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaContratarEmpleado.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaContratarEmpleado.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaContratarEmpleado.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaModificarEmpleado.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaModificarEmpleado.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaModificarEmpleado.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaDespedirEmpleado.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaDespedirEmpleado.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaDespedirEmpleado.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaEliminarCliente.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaEliminarCliente.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaEliminarCliente.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaVisualizarClientes.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaVisualizarClientes.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaVisualizarClientes.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaVisualizarTecnicos.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaVisualizarTecnicos.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaVisualizarTecnicos.setObjetoControladorOperador(ControlOperador);
                
        ObjetoVentanaVisualizarVendedores.setObjetoControladorPrincipal(ControlPrincipal);
        ObjetoVentanaVisualizarVendedores.setObjetoControladorClientes(ControlClientes);
        ObjetoVentanaVisualizarVendedores.setObjetoControladorOperador(ControlOperador);
        //Fin De Comunicacion Vistas-Controladores
        
        //Comunicacion Controladores-Vistas
        ControlPrincipal.setObjetoVentanaPrincipal(ObjetoVentanaPrincipal);
        ControlPrincipal.setObjetoVentanaCliente(ObjetoVentanaCliente);
        ControlPrincipal.setObjetoVentanaRegistrarCliente(ObjetoVentanaRegistrarCliente);
        ControlPrincipal.setObjetoVentanaModificarCliente(ObjetoVentanaModificarCliente);
        ControlPrincipal.setObjetoVentanaComprarAuto(ObjetoVentanaComprarAuto);
        ControlPrincipal.setObjetoVentanaSolicitarServicio(ObjetoVentanaSolicitarServicio);
        ControlPrincipal.setObjetoVentanaSolicitarAutolavado(ObjetoVentanaSolicitarAutolavado);
        ControlPrincipal.setObjetoVentanaSolicitarCambioAceite(ObjetoVentanaSolicitarCambioAceite);
        ControlPrincipal.setObjetoVentanaSolicitarCambioLlantas(ObjetoVentanaSolicitarCambioLlantas);
        ControlPrincipal.setObjetoVentanaSolicitarRevision(ObjetoVentanaSolicitarRevision);
        ControlPrincipal.setObjetoVentanaFacturaPago(ObjetoVentanaFacturaPago);
        ControlPrincipal.setObjetoVentanaOperador(ObjetoVentanaOperador);
        ControlPrincipal.setObjetoVentanaContratarEmpleado(ObjetoVentanaContratarEmpleado);
        ControlPrincipal.setObjetoVentanaModificarEmpleado(ObjetoVentanaModificarEmpleado);
        ControlPrincipal.setObjetoVentanaDespedirEmpleado(ObjetoVentanaDespedirEmpleado);
        ControlPrincipal.setObjetoVentanaEliminarCliente(ObjetoVentanaEliminarCliente);
        ControlPrincipal.setObjetoVentanaVisualizarClientes(ObjetoVentanaVisualizarClientes);
        ControlPrincipal.setObjetoVentanaVisualizarTecnicos(ObjetoVentanaVisualizarTecnicos);
        ControlPrincipal.setObjetoVentanaVisualizarVendedores(ObjetoVentanaVisualizarVendedores);
        
        ControlClientes.setObjetoVentanaPrincipal(ObjetoVentanaPrincipal);
        ControlClientes.setObjetoVentanaCliente(ObjetoVentanaCliente);
        ControlClientes.setObjetoVentanaRegistrarCliente(ObjetoVentanaRegistrarCliente);
        ControlClientes.setObjetoVentanaModificarCliente(ObjetoVentanaModificarCliente);
        ControlClientes.setObjetoVentanaComprarAuto(ObjetoVentanaComprarAuto);
        ControlClientes.setObjetoVentanaSolicitarServicio(ObjetoVentanaSolicitarServicio);
        ControlClientes.setObjetoVentanaSolicitarAutolavado(ObjetoVentanaSolicitarAutolavado);
        ControlClientes.setObjetoVentanaSolicitarCambioAceite(ObjetoVentanaSolicitarCambioAceite);
        ControlClientes.setObjetoVentanaSolicitarCambioLlantas(ObjetoVentanaSolicitarCambioLlantas);
        ControlClientes.setObjetoVentanaSolicitarRevision(ObjetoVentanaSolicitarRevision);
        ControlClientes.setObjetoVentanaFacturaPago(ObjetoVentanaFacturaPago);
        ControlClientes.setObjetoVentanaOperador(ObjetoVentanaOperador);
        ControlClientes.setObjetoVentanaContratarEmpleado(ObjetoVentanaContratarEmpleado);
        ControlClientes.setObjetoVentanaModificarEmpleado(ObjetoVentanaModificarEmpleado);
        ControlClientes.setObjetoVentanaDespedirEmpleado(ObjetoVentanaDespedirEmpleado);
        ControlClientes.setObjetoVentanaEliminarCliente(ObjetoVentanaEliminarCliente);
        ControlClientes.setObjetoVentanaVisualizarClientes(ObjetoVentanaVisualizarClientes);
        ControlClientes.setObjetoVentanaVisualizarTecnicos(ObjetoVentanaVisualizarTecnicos);
        ControlClientes.setObjetoVentanaVisualizarVendedores(ObjetoVentanaVisualizarVendedores);
        
        ControlOperador.setObjetoVentanaPrincipal(ObjetoVentanaPrincipal);
        ControlOperador.setObjetoVentanaCliente(ObjetoVentanaCliente);
        ControlOperador.setObjetoVentanaRegistrarCliente(ObjetoVentanaRegistrarCliente);
        ControlOperador.setObjetoVentanaModificarCliente(ObjetoVentanaModificarCliente);
        ControlOperador.setObjetoVentanaComprarAuto(ObjetoVentanaComprarAuto);
        ControlOperador.setObjetoVentanaSolicitarServicio(ObjetoVentanaSolicitarServicio);
        ControlOperador.setObjetoVentanaSolicitarAutolavado(ObjetoVentanaSolicitarAutolavado);
        ControlOperador.setObjetoVentanaSolicitarCambioAceite(ObjetoVentanaSolicitarCambioAceite);
        ControlOperador.setObjetoVentanaSolicitarCambioLlantas(ObjetoVentanaSolicitarCambioLlantas);
        ControlOperador.setObjetoVentanaSolicitarRevision(ObjetoVentanaSolicitarRevision);
        ControlOperador.setObjetoVentanaFacturaPago(ObjetoVentanaFacturaPago);
        ControlOperador.setObjetoVentanaOperador(ObjetoVentanaOperador);
        ControlOperador.setObjetoVentanaContratarEmpleado(ObjetoVentanaContratarEmpleado);
        ControlOperador.setObjetoVentanaModificarEmpleado(ObjetoVentanaModificarEmpleado);
        ControlOperador.setObjetoVentanaDespedirEmpleado(ObjetoVentanaDespedirEmpleado);
        ControlOperador.setObjetoVentanaEliminarCliente(ObjetoVentanaEliminarCliente);
        ControlOperador.setObjetoVentanaVisualizarClientes(ObjetoVentanaVisualizarClientes);
        ControlOperador.setObjetoVentanaVisualizarTecnicos(ObjetoVentanaVisualizarTecnicos);
        ControlOperador.setObjetoVentanaVisualizarVendedores(ObjetoVentanaVisualizarVendedores);
        //Fin De Comunicacion Controladores-Vistas
        
        //Comunicacion Modelos - Controladores
        ObjetoModeloClientes.setControlPrincipal(ControlPrincipal);
        ObjetoModeloClientes.setControlClientes(ControlClientes);
        ObjetoModeloClientes.setControlOperador(ControlOperador);
        
        ObjetoModeloEmpleados.setControlPrincipal(ControlPrincipal);
        ObjetoModeloEmpleados.setControlClientes(ControlClientes);
        ObjetoModeloEmpleados.setControlOperador(ControlOperador);
        
        ObjetoModeloAutos.setControlPrincipal(ControlPrincipal);
        ObjetoModeloAutos.setControlClientes(ControlClientes);
        ObjetoModeloAutos.setControlOperador(ControlOperador);
        
        ObjetoModeloServicios.setControlPrincipal(ControlPrincipal);
        ObjetoModeloServicios.setControlClientes(ControlClientes);
        ObjetoModeloServicios.setControlOperador(ControlOperador);
        //Fin De Comunicacion Modelo - Controlador
        
        //Comunicacion Controladores - Modelos
        ControlPrincipal.setObjetoModeloClientes(ObjetoModeloClientes);
        ControlPrincipal.setObjetoModeloEmpleados(ObjetoModeloEmpleados);
        ControlPrincipal.setObjetoModeloAutos(ObjetoModeloAutos);
        ControlPrincipal.setObjetoModeloServicios(ObjetoModeloServicios);
        
        ControlClientes.setObjetoModeloClientes(ObjetoModeloClientes);
        ControlClientes.setObjetoModeloEmpleados(ObjetoModeloEmpleados);
        ControlClientes.setObjetoModeloAutos(ObjetoModeloAutos);
        ControlClientes.setObjetoModeloServicios(ObjetoModeloServicios);
        
        ControlOperador.setObjetoModeloClientes(ObjetoModeloClientes);
        ControlOperador.setObjetoModeloEmpleados(ObjetoModeloEmpleados);
        ControlOperador.setObjetoModeloAutos(ObjetoModeloAutos);
        ControlOperador.setObjetoModeloServicios(ObjetoModeloServicios);
        //Fin De Comunicacion Controladores - Modelos
        
        ObjetoModeloClientes.registraClienteNuevo("90HIMOK", "Hector Isai", "Gutierrez Hernandez", "Masculino", "20", "Miguel Hidalgo n1");
        ObjetoModeloClientes.registraClienteNuevo("SOLAR99K", "Alejandra Briggitte", "Alvarez Vera", "Femenino", "22", "Alborada n99");
        ObjetoModeloClientes.registraClienteNuevo("MK12OSLC", "Daniel", "Alonso Perez", "Masculino", "20", "Jose Morelos n12");
        ObjetoModeloClientes.registraClienteNuevo("AMUSE293", "Danna", "Alonso Gomez", "Femenino", "23", "Reforma n45");
        
        ObjetoModeloEmpleados.registraEmpleado("1010AM", "Ricardo William", "Gutierrez Alonso", "Masculino", 21, 777390, "ricardo@gmail.com", "Vendedor");
        ObjetoModeloEmpleados.registraEmpleado("1010PM", "Mafer", "Carrillo Perez", "Femenino", 19, 771390, "mafer@gmail.com", "Vendedor");
        ObjetoModeloEmpleados.registraEmpleado("3010KL", "Ashley", "Arenas Tapia", "Femenino", 22, 777310, "ashley@gmail.com", "Vendedor");
        ObjetoModeloEmpleados.registraEmpleado("2020AL", "Fatima", "Manson Plascencia", "Femenino", 20, 777300, "fatima@gmail.com", "Tecnico");        
        ObjetoModeloEmpleados.registraEmpleado("LU99KS", "Nadia Mitzi", "Zavala Alonso", "Femenino", 25, 777300, "nadia@gmail.com", "Tecnico");
        ObjetoModeloEmpleados.registraEmpleado("RUNNDD", "Ramiro", "Lopez Cardoso", "Masculino", 28, 711300, "ramiro@gmail.com", "Tecnico");
        
        ObjetoModeloAutos.registraNuevaVenta("90HIMOK", "Ashley Arenas Tapia", "Nissan Skyline R34 1999");
        ObjetoModeloAutos.registraNuevaVenta("SOLAR99K", "Ashley Arenas Tapia", "Nissan Skyline R34 1999");
        ObjetoModeloAutos.registraNuevaVenta("SOLAR99K", "Ricardo William Gutierrez Alonso", "Nissan 350z 2005");
        ObjetoModeloAutos.registraNuevaVenta("MK12OSLC", "Ricardo William Gutierrez Alonso", "Ford Focus Wagon 2002");
        ObjetoModeloAutos.registraNuevaVenta("MK12OSLC", "Ricardo William Gutierrez Alonso", "Renault Clio 1.6 2004");
        ObjetoModeloAutos.registraNuevaVenta("MK12OSLC", "Ricardo William Gutierrez Alonso", "Ford F-150 Lightnight 2003");
        
        ObjetoModeloServicios.registraNuevoServicio("SOLAR99K", "Nissan Skyline R34 1999", "Fatima Manson Plascencia", "Car Wash", 150);
        ObjetoModeloServicios.registraNuevoServicio("SOLAR99K", "Nissan Skyline R34 1999", "Fatima Manson Plascencia", "Revision mecanica", 1500);
        ObjetoModeloServicios.registraNuevoServicio("MK12OSLC", "Ford F-150 Lightnight 2003", "Nadia Mitzi Zavala Alonso", "Revision mecanica", 1500);
        ObjetoVentanaPrincipal.setVisible(true);
        
    }
    
}
