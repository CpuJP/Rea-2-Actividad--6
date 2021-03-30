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
public class CentroDeServicio {
    private String nombreCentro;
    private String Direccion;
    private int nivel;

    public CentroDeServicio() {
        this.nombreCentro = null;
        this.Direccion = null;
        this.nivel = 0;
    }

    public CentroDeServicio(String nombreCentro, String Direccion, int nivel) {
        this.nombreCentro = nombreCentro;
        this.Direccion = Direccion;
        this.nivel = nivel;
    }
    
    public void mostrarCentroSalud(){
        System.out.print("El nombre del centro de salud es: "+nombreCentro);
         System.out.println("");
        System.out.print("La dirección de ubicación del centro es: "+Direccion);
         System.out.println();
        System.out.print("El nivel de salud es: "+nivel);
         System.out.println();
    }

    public String getnombreCentro(){
        return nombreCentro;
    }
    
    public void setnombreCentro(String nombreCentro){
        this.nombreCentro = nombreCentro;
    }
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
     
    
    
}

