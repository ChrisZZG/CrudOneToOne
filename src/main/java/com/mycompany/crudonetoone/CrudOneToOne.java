/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudonetoone;

import Logica.Alumno;
import Logica.Clase;
import Logica.Controladora;
import java.util.Date;

/**
 *
 * @author EQUIPO
 */
public class CrudOneToOne {

    public static void main(String[] args) {
        
    //Instancia Controladora
   Controladora control = new Controladora();

    //Clase
    
    //Crear una Clase
//    Clase clase1 = new Clase(1, "Programcion1");
//    control.createClase(clase1);
    //Eliminar una Clase
    
    //Editar una Clase
  
    
    //Encontrar y Mostrar una Clase
    
    //Encontrar y Mostrar todas las Clases
    
    
     //Alumno
    //Crear un Alumno *Necesito primero crear la Clase para asignarla como Atributo de el
    //Alumno
//    Alumno alu1 = new Alumno(1, "Mowgli", "Jey", new Date(), clase1);
//    control.createAlumno(alu1);
    //Eliminar un Alumno
    
    //Editar un Alumno
    
    //Encontrar y Mostrar un Alumno
    Alumno findalu1 = control.findAlumno(1);
        System.out.println("----Mostrar Datos del Alumno 1----");
        System.out.println("Nombre: " + findalu1.getNombre());
        System.out.println("Apellido: " + findalu1.getApellido());
        System.out.println("Fecha de Nacimiento: " + findalu1.getFechaNac());
        System.out.println("Curso: " + findalu1.getCurso().getNombre());
    
    //Encontrar y Mostrar todos los Alumnos
    }
}
