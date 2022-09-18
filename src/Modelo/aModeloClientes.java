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
public class aModeloClientes {

    private aControladorPrincipal ControlPrincipal;
    private bControladorClientes ControlClientes;
    private cControladorOperador ControlOperador;
    
    //Array list donde guardaremos los alumnos a registrar
    
    ArrayList<aaCliente> ListaClientes = new ArrayList<aaCliente>();

    public aModeloClientes() {
        
    }

    public ArrayList<aaCliente> getListaClientes() {
        return ListaClientes;
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

    public void registraClienteNuevo(String identificador, String nombres, String apellidos, String genero, String edad, String domicilio) throws aaaExcepcionRango, Exception {
        //Evaluar identificadores existentes
        EvaluarIdentificador(identificador);
        EvaluarNombresApellidos(nombres, apellidos);
        //Evaluar entrada de dato para edad
        int intEdad = Integer.parseInt(edad);
        EvaluarEdad(intEdad);
        //Vuelvo a lanzar la excepcion
        
        aaCliente objetoCliente = new aaCliente(identificador,nombres,apellidos,genero,intEdad,domicilio);
        ListaClientes.add(objetoCliente);
    }

    private void EvaluarEdad(int intEdad) throws aaaExcepcionRango {
        if(intEdad < 18 || intEdad > 100){
            throw new aaaExcepcionRango("El rango de edad debe estar entre 18 - 70 años");
        }else{
            
        }
    }

    private void EvaluarIdentificador(String identificador) throws Exception {
        Iterator<aaCliente> itr = ListaClientes.iterator();
              
        while(itr.hasNext()){
            aaCliente obj=(aaCliente)itr.next();
            
            if(obj.getIdentificador().equals(identificador)){
                throw new Exception("El identificador de cliente ya existe");
            }
            
        }
    }
    
    private void EvaluarNombresApellidos(String nombres, String apellidos) throws Exception {
        Iterator<aaCliente> itr = ListaClientes.iterator();
              
        while(itr.hasNext()){
            aaCliente obj=(aaCliente)itr.next();
            
            if(obj.getNombre().concat(obj.getApellido()).equals(nombres.concat(apellidos))){
                throw new Exception("El usuario a registrar ya existe");
            }
            
        }
    }


    public aaCliente buscaCliente(String identificador) {
        Iterator<aaCliente> itr = ListaClientes.iterator();
        
        while(itr.hasNext()){
            aaCliente obj=(aaCliente)itr.next();
            
            if(obj.getIdentificador().equals(identificador)){
                JOptionPane.showMessageDialog(null, "Se ha encontrado el cliente");
                return obj;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente");
            }    
        }
        return null;
    }

    public void modificaCliente(String identificador, String nombres, String apellidos, String genero, String edad, String domicilio) throws aaaExcepcionRango {
        int intEdad = Integer.parseInt(edad);
        EvaluarEdad(intEdad);
        Iterator<aaCliente> itr = ListaClientes.iterator();
        
        while(itr.hasNext()){
            aaCliente obj=(aaCliente)itr.next();
            if(obj.getIdentificador().equals(identificador)){
                obj.setNombre(nombres);
                obj.setApellido(apellidos);
                obj.setGenero(genero);
                obj.setEdad(intEdad);
                obj.setDomicilio(domicilio);
                JOptionPane.showMessageDialog(null, "Cambios modificados exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error al modificar los datos");
            }
        }
    }

    public void eliminaCliente(String identificador, String nombres, String apellidos, String genero, String edad, String domicilio) {
        int intEdad = Integer.parseInt(edad);
        //aaCliente objAlumno = new aaCliente(identificador,nombres,apellidos,genero,intEdad,domicilio);
        Iterator<aaCliente> itr = ListaClientes.iterator();
        int contador = 0;
        
        while(itr.hasNext()){
            aaCliente obj=(aaCliente)itr.next();
            if(obj.getIdentificador().equals(identificador)){
                ListaClientes.remove(contador);
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
                break;
            }
            contador++;
        }
    }

    public aaCliente buscaExistenciaCliente(String identificador) {
        Iterator<aaCliente> itr = ListaClientes.iterator();
        
        while(itr.hasNext()){
            aaCliente obj=(aaCliente)itr.next();
            
            if(obj.getIdentificador().equals(identificador)){
                JOptionPane.showMessageDialog(null, "Se ha encontrado el cliente");
                return obj;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente");
            }    
        }
        return null;
    }

    
    
    
    
    
    
    
}
