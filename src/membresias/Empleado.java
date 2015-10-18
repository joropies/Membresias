/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membresias;

/**
 *
 * @author joropies
 */
public class Empleado {
    private String nombre;
    private String email;
    private Float sueldo_base;
    private String calle;
    private String numero;
    private String cp;
    private String municipio;
    
    public Empleado() {
        // metodo para construir el objeto sin argumentos
    }
    
    public Empleado(String nombre, String email, Float sueldo_base, String calle, String numero, String cp, String municipio) {
        // metodo para construir con parametros
        this.nombre = nombre;
        this.email = email;
        this.sueldo_base = sueldo_base;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.municipio = municipio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(Float sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
