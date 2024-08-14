/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Estudiante_MCA
 */
public class Municipio {
    private int id;
    private String nombre_muni;
    private Departamento Departamento;

    public Municipio(int id, String nombre_muni, Departamento Departamento) {
        this.id = id;
        this.nombre_muni = nombre_muni;
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Su municipio es: "+nombre_muni+" y su id es: "+id+", "+Departamento;
    }
    
}
