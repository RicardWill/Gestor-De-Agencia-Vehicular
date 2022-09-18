/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author William
 */
public class ccCoche {
    private String IdentificadorCliente;
    private String NombreVendedorCoche;
    private String ModeloCoche;

    public ccCoche(String IdentificadorCliente, String NombreVendedorCoche, String ModeloCoche) {
        this.IdentificadorCliente = IdentificadorCliente;
        this.NombreVendedorCoche = NombreVendedorCoche;
        this.ModeloCoche = ModeloCoche;
    }

    public String getIdentificadorCliente() {
        return IdentificadorCliente;
    }

    public void setIdentificadorCliente(String IdentificadorCliente) {
        this.IdentificadorCliente = IdentificadorCliente;
    }

    public String getNombreVendedorCoche() {
        return NombreVendedorCoche;
    }

    public void setNombreVendedorCoche(String NombreVendedorCoche) {
        this.NombreVendedorCoche = NombreVendedorCoche;
    }

    public String getModeloCoche() {
        return ModeloCoche;
    }

    public void setModeloCoche(String ModeloCoche) {
        this.ModeloCoche = ModeloCoche;
    }
    
    
}
