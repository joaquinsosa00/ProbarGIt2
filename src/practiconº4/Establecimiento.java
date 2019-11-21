/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiconº4;

import java.util.Objects;

/**
 *
 * @author joaqu
 */
public class Establecimiento {
    private String Nombre;
    private String Codigo;
    private String Direccion;
    private TipoEstablecimiento TipoEstablecimiento; 

    public Establecimiento( TipoEstablecimiento tipoEstablecimiento, String Nombre, String Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.TipoEstablecimiento = TipoEstablecimiento;
    }
    
    public Establecimiento (TipoEstablecimiento TipoEstablecimiento, String Nombre, String Codigo,  String Direccion) 
    {
        this( TipoEstablecimiento, Nombre,  Codigo );
        this.Direccion= Direccion; 
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public TipoEstablecimiento getTipoEstablecimiento() {
        return TipoEstablecimiento;
    }

    public void setTipoEstablecimiento(TipoEstablecimiento TipoEstablecimiento) {
        this.TipoEstablecimiento = TipoEstablecimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.Codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Establecimiento other = (Establecimiento) obj;
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return true;
    }
    
    public void mostrar()
    { 
        System.out.println(" Nombre: " + this.Nombre + " Codigo: " + this.Codigo + "" + TipoEstablecimiento+ "Direccion: " + this.Direccion);
    }
    
    
}
