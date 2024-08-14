/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Estudiante_MCA
 */
public class Persona {
    private int id;
    private String nombres_persona;
    private String apellidos_persona;
    private Direccion Direccion;

    public Persona(int id, String nombres_persona, String apellidos_persona, Direccion Direccion) {
        this.id = id;
        this.nombres_persona = nombres_persona;
        this.apellidos_persona = apellidos_persona;
        this.Direccion = Direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres_persona() {
        return nombres_persona;
    }

    public void setNombres_persona(String nombres_persona) {
        this.nombres_persona = nombres_persona;
    }

    public String getApellidos_persona() {
        return apellidos_persona;
    }

    public void setApellidos_persona(String apellidos_persona) {
        this.apellidos_persona = apellidos_persona;
    }

    public Direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(Direccion Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Su nombre es: "+nombres_persona+" "+apellidos_persona+" y vive en: "+Direccion;
    }
    
}
