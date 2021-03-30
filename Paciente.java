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



//import java.util.Scanner;

public class Paciente {
    private String nombre;
    private String apellido;
    private int id;
    private String sexo;
    private String direccionResidencia;
    private String lugarAtencion;
    private String motivoConsulta;
    private String medicoAtendio;
    private String fecha;
    
    public Paciente(){
        this.nombre = null;
        this.apellido = null;
        this.id = 0;
        this.sexo = null;
        this.direccionResidencia = null;
        this.lugarAtencion = null;
        this.motivoConsulta = null;
        this.medicoAtendio = null;
        this.fecha = null;
    }

    public Paciente(String nombre, String apellido, int id, String sexo, String direccionResidencia, String lugarAtencion, String motivoConsulta, String medicoAtendio, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.sexo = sexo;
        this.direccionResidencia = direccionResidencia;
        this.lugarAtencion = lugarAtencion;
        this.motivoConsulta = motivoConsulta;
        this.medicoAtendio = medicoAtendio;
        this.fecha = fecha;
    }
    
    public void mostratPaciente(){
        System.out.print("Nombre del paciente: "+nombre);
         System.out.println();
        System.out.print("Apellidos del paciente: "+apellido);
         System.out.println();
        System.out.print("Número de D.I es: "+id); 
         System.out.println();
        System.out.print("Sexo del paciente: "+sexo);
         System.out.println();
        System.out.print("Dirección de residencia del paciente: "+direccionResidencia);
         System.out.println();
        System.out.print("Lugar de atención: "+lugarAtencion);
         System.out.println();
        System.out.print("Motivo de la consulta: "+motivoConsulta);
         System.out.println();
        System.out.print("Médico que atendió: "+medicoAtendio);
         System.out.println();
        System.out.print("Fecha de la ultima consulta: "+fecha);
         System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getLugarAtencion() {
        return lugarAtencion;
    }

    public void setLugarAtencion(String lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMedicoAtendio() {
        return medicoAtendio;
    }

    public void setMedicoAtendio(String medicoAtendio) {
        this.medicoAtendio = medicoAtendio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
     
}
