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
public class ddServicio {
    private String IdentificadorCliente;
    private String CocheTrabajado;
    private String TecnicoResponsable;
    private String TipoServicio;
    private int CostoServicio;

    public ddServicio(String IdentificadorCliente, String CocheTrabajado, String TecnicoResponsable, String TipoServicio, int CostoServicio) {
        this.IdentificadorCliente = IdentificadorCliente;
        this.CocheTrabajado = CocheTrabajado;
        this.TecnicoResponsable = TecnicoResponsable;
        this.TipoServicio = TipoServicio;
        this.CostoServicio = CostoServicio;
    }

    public String getIdentificadorCliente() {
        return IdentificadorCliente;
    }

    public void setIdentificadorCliente(String IdentificadorCliente) {
        this.IdentificadorCliente = IdentificadorCliente;
    }

    public String getCocheTrabajado() {
        return CocheTrabajado;
    }

    public void setCocheTrabajado(String CocheTrabajado) {
        this.CocheTrabajado = CocheTrabajado;
    }

    public String getTecnicoResponsable() {
        return TecnicoResponsable;
    }

    public void setTecnicoResponsable(String TecnicoResponsable) {
        this.TecnicoResponsable = TecnicoResponsable;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public void setTipoServicio(String TipoServicio) {
        this.TipoServicio = TipoServicio;
    }

    public int getCostoServicio() {
        return CostoServicio;
    }

    public void setCostoServicio(int CostoServicio) {
        this.CostoServicio = CostoServicio;
    }
    
    
}
