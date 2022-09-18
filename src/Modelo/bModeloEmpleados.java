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
public class bModeloEmpleados {

    private aControladorPrincipal ControlPrincipal;
    private bControladorClientes ControlClientes;
    private cControladorOperador ControlOperador;
    
    //Array list donde guardaremos los alumnos a registrar
    ArrayList<bbEmpleado> ListaEmpleados = new ArrayList<bbEmpleado>();
    
    //private final bbEmpleado [] array = (bbEmpleado[]) ListaEmpleados.toArray();

    //public bbEmpleado[] getArray() {
      //  return array;
    //}

    
    public bModeloEmpleados() {
    
    }

    public ArrayList<bbEmpleado> getListaEmpleados() {
        
        return ListaEmpleados;
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

    public void registraEmpleado(String Identificador, String Nombres, String Apellidos, String Genero, int Edad, int Telefono, String CorreoElectronico, String TipoEmpleado) throws aaaExcepcionRango, Exception{
        bbEmpleado objetoEmpleado = new bbEmpleado(Identificador,Nombres,Apellidos,Genero,Edad,Telefono,CorreoElectronico,TipoEmpleado);
        ListaEmpleados.add(objetoEmpleado);
    }
    
    public void registraEmpleadoNuevo(String Identificador, String Nombres, String Apellidos, String Genero, String Edad, String Telefono, String CorreoElectronico, String TipoEmpleado) throws aaaExcepcionRango, Exception{
       
        EvaluarIdentificador(Identificador);
        EvaluarNombresApellidos(Nombres, Apellidos);
        int intEdad = Integer.parseInt(Edad);
        EvaluarEdad(intEdad);
        int intTelefono = Integer.parseInt(Telefono);
        //EvaluarTelefono(intTelefono);
        
        bbEmpleado objetoEmpleado = new bbEmpleado(Identificador,Nombres,Apellidos,Genero,intEdad,intTelefono,CorreoElectronico,TipoEmpleado);
        ListaEmpleados.add(objetoEmpleado);
        
    }

    private void EvaluarIdentificador(String Identificador) throws Exception {
        Iterator<bbEmpleado> itr = ListaEmpleados.iterator();
              
        while(itr.hasNext()){
            bbEmpleado obj=(bbEmpleado)itr.next();
            
            if(obj.getIdentificador().equals(Identificador)){
                throw new Exception("El identificador de cliente ya existe");
            }
            
        }
    }

    private void EvaluarEdad(int intEdad) throws aaaExcepcionRango {
        if(intEdad < 18 || intEdad > 100){
            throw new aaaExcepcionRango("El rango de edad debe estar entre 18 - 70 años");
        }else{
            
        }
    }

    private void EvaluarTelefono(int intTelefono) throws Exception {
        throw new Exception("Número de teléfono incorrecto");
    }

    public bbEmpleado buscaEmpleado(String identificador) {
        Iterator<bbEmpleado> itr = ListaEmpleados.iterator();
        
        while(itr.hasNext()){
            bbEmpleado obj=(bbEmpleado)itr.next();
            
            if(obj.getIdentificador().equals(identificador)){
                JOptionPane.showMessageDialog(null, "Se ha encontrado el empleado");
                return obj;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el empleado");
            }    
        }
        return null;
    }

    public void modificaEmpleado(String Identificador, String Nombres, String Apellidos, String Genero, String Edad, String Telefono, String CorreoElectronico, String TipoEmpleado) throws bbbExcepcionRango, Exception {
        int intEdad = Integer.parseInt(Edad);
        EvaluarEdad(intEdad);
        
        int intTelefono = Integer.parseInt(Telefono);
        //EvaluarTelefono(intTelefono);
        
        Iterator<bbEmpleado> itr = ListaEmpleados.iterator();
        
        while(itr.hasNext()){
            bbEmpleado obj=(bbEmpleado)itr.next();
            if(obj.getIdentificador().equals(Identificador)){
                obj.setNombre(Nombres);
                obj.setApellido(Apellidos);
                obj.setGenero(Genero);
                obj.setEdad(intEdad);
                obj.setTelefono(intTelefono);
                obj.setCorreoElectronico(CorreoElectronico);
                obj.setTipoEmpleado(TipoEmpleado);
                JOptionPane.showMessageDialog(null, "Cambios modificados exitosamente");
                
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error al modificar los datos");
            }
        }
    }

    public void eliminaEmpleado(String Identificador, String Nombres, String Apellidos, String TipoEmpleado) {
        Iterator<bbEmpleado> itr = ListaEmpleados.iterator();
        int contador = 0;
        
        while(itr.hasNext()){
            bbEmpleado obj=(bbEmpleado)itr.next();
            if(obj.getIdentificador().equals(Identificador)){
                ListaEmpleados.remove(contador);
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
                break;
            }
            contador++;
        }
    }

    private void EvaluarNombresApellidos(String Nombres, String Apellidos) throws Exception {
        Iterator<bbEmpleado> itr = ListaEmpleados.iterator();
              
        while(itr.hasNext()){
            bbEmpleado obj=(bbEmpleado)itr.next();
            
            if(obj.getNombre().concat(obj.getApellido()).equals(Nombres.concat(Apellidos))){
                throw new Exception("La persona a contratar ya se encuentra registrada");
            }
            
        }
    }

   

    
    
}
