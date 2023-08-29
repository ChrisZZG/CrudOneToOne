/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EQUIPO
 */
public class Controladora {
    
    //Instancia ControladoraPersistencia
   ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //Alumno
    //Crear un Alumno
        public void createAlumno(Alumno alu){
            controlPersis.crearAlumno(alu);
        }
    //Eliminar un Alumno
        public void eliminarAlumno(int id){
            controlPersis.deleteAlumno(id);
        }
    //Editar un Alumno
       public void editAlumno(Alumno alu){
           controlPersis.editAlumno(alu);
       }
    //Encontrar y Mostrar un Alumno
       public Alumno findAlumno(int id){
           return controlPersis.findAlumno(id);
       }
    //Encontrar y Mostrar todos los Alumnos
       public ArrayList<Alumno> findAlumnosEntities(){
           return controlPersis.findAlumnosEntities();
       }
       
       
    //Clase
    
    //Crear una Clase
    public void createClase(Clase clase){
        controlPersis.createClase(clase);
    }
    
    //Eliminar una Clase
    public void eliminarClase(int id){
        controlPersis.eliminarClase(id);
    }
    //Editar una Clase
    public void editClase(Clase clase){
        controlPersis.editClase(clase);
    }
    //Encontrar y Mostrar una Clase
    public Clase findClase(int id){
        return controlPersis.findClase(id);
    }
    //Encontrar y Mostrar todas las Clases
    public ArrayList<Clase> findClasesEntities(){
        return controlPersis.findClasesEntities();
    }
    
}
