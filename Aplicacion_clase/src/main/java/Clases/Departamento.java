/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Estudiante_MCA
 */
public class Departamento {
    private int id;
    private String nombre_depa;
    private Pais Pais;

    public Departamento(int id, String nombre_depa, Pais Pais) {
        this.id = id;
        this.nombre_depa = nombre_depa;
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return "su departamento es: " + nombre_depa + " y su id es: " + id + ", " + Pais;
    }
    
}
