/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiconº4;

/**
 *
 * @author joaqu
 */
public enum TipoEstablecimiento {
    PRIVADO, PUBLICO;

  @Override
    public String toString() {
        switch(this){
            case PRIVADO: return " Tipo: Privado";
            case PUBLICO: return " Tipo: Publico";    
            default: return "";   
}
    }
}
    
