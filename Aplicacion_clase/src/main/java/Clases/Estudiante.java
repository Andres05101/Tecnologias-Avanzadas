/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Estudiante_MCA
 */
public class Estudiante extends Persona {

    private String codigo_es;
    private String programa;
    private double promedio;

    public Estudiante(String codigo_es, String programa, double promedio, int id, String nombres_persona, String apellidos_persona, Direccion direccion) {
        super(id, nombres_persona, apellidos_persona, direccion);
        this.codigo_es = codigo_es;
        this.programa = programa;
        this.promedio = promedio;
    }

    public Estudiante(String codigo_es, String programa, double promedio, Persona persona) {
        super(persona.getId(), persona.getNombres_persona(), persona.getApellidos_persona(), persona.getDireccion());
        this.codigo_es = codigo_es;
        this.programa = programa;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Su codigo es: " + codigo_es + " del programa: " + programa + " con un promedio de: " + promedio;
    }

}
