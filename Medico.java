/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rea2semana6;

/**
 *
 * @author jp-co
 */
public class Medico extends Paciente {
    
    CentroDeServicio centro = new CentroDeServicio();
    
    private String tipoMedico;

    public Medico() {
        this.tipoMedico = null;
    }

    public Medico(String tipoMedico, String nombre, String apellido, String lugarAtencion) {
        super(nombre, apellido, 0, apellido, tipoMedico, lugarAtencion, tipoMedico, lugarAtencion, nombre);
        this.tipoMedico = tipoMedico;
    }
    
    public void mostratMedico(){
        System.out.print("Tipo de especialización del médico: "+tipoMedico);
         System.out.println();
        System.out.print("Nombre del médico: "+getNombre());
         System.out.println();
        System.out.print("Apellidos del médico: "+getApellido()); 
         System.out.println();
        System.out.print("Centro médico: "+centro.getnombreCentro());
         System.out.println();
        System.out.print("Fecha de la ultima actualización de datos: "+getFecha());
         System.out.println("");
    }

    public String getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(String tipoMedico) {
        this.tipoMedico = tipoMedico;
    }
    
    
    
    public void mostrarMedico(){
        System.out.println();
    }
    
}
