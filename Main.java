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

import java.util.Scanner;

public class Main {

    Paciente p1;
    Medico m1;
    CentroDeServicio cs1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main mn = new Main();
        int rep;
        System.out.println("¿Desea iniciar el programa?");
        System.out.println("     SI (0)   NO(1)");
        rep = sc.nextInt();
        while (rep < 4 ) {
         
            System.out.println();
            int menu1;
            System.out.println("Digite el numero correspondiente a la opcion que quiera elegir");
            System.out.println("******************************************************************");
            System.out.println("*          1) Registrar               2) Consultar               *");
            System.out.println("******************************************************************");
            menu1 = sc.nextInt();

            switch(menu1){
                case 1: 
                    int menu2;
                    System.out.println("Digite el numero correspondiente a la opcion que quiera elegir");
                    System.out.println("******************************************************************");
                    System.out.println("*     1) Centro de salud         2) Médico         3) Paciente   *");
                    System.out.println("******************************************************************");
                    menu2 = sc.nextInt();
                    switch(menu2){
                        case 1:
                            mn.registratCentro1();
                        break;
                        case 2:
                            mn.registrarMedico1();
                        break;
                        case 3:
                            mn.registrarPaciente1();
                        break;
                        default:
                            System.out.println("Digite una opción válida");
                        break;
                    }
                break;
                case 2:
                    int menu3;
                    System.out.println("Digite el numero correspondiente a la opcion que quiera consultar");
                    System.out.println("******************************************************************");
                    System.out.println("*     1) Centro de salud         2) Médico         3) Paciente   *");
                    System.out.println("******************************************************************");
                    menu3 = sc.nextInt();
                    switch(menu3){
                        case 1:
                            mn.mostratCentro1();
                        break;
                        case 2:
                            mn.mostrarMedico1();
                        break;
                        case 3:
                            mn.mostrarPaciente1();
                        break;
                        default:
                            System.out.println("Digite una opción válida");
                        break;
                    }
                    
                break;
                default:
                    System.out.println("Digite una opción válida");
                break;

            }
            /*System.out.println();
            System.out.print("¿Desea modificar y/o revisar los datos?");
            System.out.print("        SI (0)        NO (1)");
            rep = sc.nextInt();
            */
            System.out.println("Podra detener el programa cuando haya completado los 3 registros");
            System.out.println();
        }
        
    }
    
    public void registrarPaciente1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del paciente: ");
        String n1;
        n1 = sc.nextLine();
        
        System.out.print("Apellidos del paciente: ");
        String a1;
        a1 = sc.nextLine();
        
                
        System.out.print("Digite sexo del paciente: ");
        String s1;
        s1 = sc.nextLine();
        
        System.out.print("Digite la dirección de residencia del paciente: ");
        String d1;
        d1 = sc.nextLine();
        
        System.out.print("Centro de salud disponible: ");
        String nom1;
        nom1 = cs1.getnombreCentro();
        System.out.print(nom1);
        System.out.println();
        
        System.out.print("Digite el motivo de la consulta del paciente: ");
        String mr;
        mr = sc.nextLine();
        
        System.out.print("Médico disponible: ");
        String mrr;
        mrr=m1.getNombre();
        System.out.print(mrr);
        System.out.println();
       
        System.out.print("Digite fecha de la consulta: ");
        String f1;
        f1 = sc.nextLine();
        
        System.out.print("Digite el D.I del paciente: ");
        int id1;
        id1 = sc.nextInt();
        
        p1 = new Paciente(n1, a1, id1, s1, d1, nom1, mr, mrr, f1);
    }
    public void mostrarPaciente1(){
        p1.mostratPaciente();
    }
    
    
    public void registrarMedico1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del médico: ");
        String n1;
        n1 = sc.nextLine();
        
        
        System.out.print("Apellidos del médico: ");
        String a1;
        a1 = sc.nextLine();
        
        System.out.print("Digite la especialización del médico: ");
        String es1;
        es1 = sc.nextLine();
        
        //System.out.print("Digite centro de atención: ");
        //p1.lugarAtencion;
        
        
        //System.out.print("Digite fecha de la consulta: ");
        //String f1;
        //f1 = sc.nextLine();
        
       m1 = new Medico(es1, n1, a1, null);
    }
    public void mostrarMedico1(){
        m1.mostratMedico();
    }
    
    
    public void registratCentro1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite el nombre del centro: ");
        String n12;
        n12 = sc.nextLine();
        
        System.out.print("Digite la dirección del centro de salud: ");
        String d1;
        d1 = sc.nextLine();
        
        System.out.print("Digite el nivel de salud del centro: ");
        int n1;
        n1 = sc.nextInt();
        
        cs1 = new CentroDeServicio(n12, d1, n1);
    }
    public void mostratCentro1(){
        cs1.mostrarCentroSalud();
    }
    
}
