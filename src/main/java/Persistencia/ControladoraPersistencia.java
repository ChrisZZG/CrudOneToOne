/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Alumno;
import Logica.Clase;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EQUIPO
 */
public class ControladoraPersistencia {
    
    //Instancia de ClaseJpaController
    ClaseJpaController claseJpa = new ClaseJpaController();
    
    //Alta de una Clase
    public void createClase(Clase clase){
        claseJpa.create(clase);
    }
    //Baja de una Clase
    public void eliminarClase(int id){
        try {
            claseJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Edicion de una Clase
    public void editClase(Clase clase){
        try {
            claseJpa.edit(clase);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Lectura de una Clase
    public Clase findClase(int id){
        return claseJpa.findClase(id);
    }
    //Lectura de Todas las Clases
    public ArrayList<Clase> findClasesEntities(){
        List<Clase> listClas = claseJpa.findClaseEntities();
        ArrayList<Clase> arrayClass = new ArrayList<Clase> (listClas);
        return arrayClass;
    }
    
    
    
    
    //Instancia de AlumnoJpaController
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    //Alta de un Alumno
    public void crearAlumno(Alumno alu){
        aluJpa.create(alu);
    }
    //Baja de un Alumno
    public void deleteAlumno(int id){
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Edicion de un Alumno
    public void editAlumno(Alumno alu){
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Lectura de un Alumno
    public Alumno findAlumno(int id){
        return aluJpa.findAlumno(id);
    }
    //Lectura de todos los Alumnos
    
    public ArrayList<Alumno> findAlumnosEntities(){
        List<Alumno> listAlu = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> arrayAlu = new ArrayList<Alumno> (listAlu);
        return arrayAlu;
    }
}
