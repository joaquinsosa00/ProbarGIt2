/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiconº4;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author joaqu
 */
public class PlanEstudio {
 private String Nombre;
 private LocalDate FechaIn;
 private LocalDate FechaFin;

    public PlanEstudio(String Nombre, LocalDate FechaIn ) {
        this.Nombre = Nombre;
        this.FechaIn = FechaIn;

    }
    public PlanEstudio (String Nombre, LocalDate FechaIn, LocalDate FechaFin){
    this (Nombre, FechaIn);
    this.FechaFin= FechaFin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaIn() {
        return FechaIn;
    }

    public void setFechaIn(LocalDate FechaIn) {
        this.FechaIn = FechaIn;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Nombre);
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
        final PlanEstudio other = (PlanEstudio) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    

}
