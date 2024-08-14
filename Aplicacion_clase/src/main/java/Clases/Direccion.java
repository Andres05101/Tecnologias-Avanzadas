/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Estudiante_MCA
 */
public class Direccion {

    private Municipio Municipio;
    private Departamento Departamento;
    private Pais Pais;
    private String calle;
    private String carrera;
    private String coordenada;
    private String descripcion;

    public Direccion(Municipio Municipio, Departamento Departamento, Pais Pais, String calle, String carrera, String coordenada, String descripcion) {
        this.Municipio = Municipio;
        this.Departamento = Departamento;
        this.Pais = Pais;
        this.calle = calle;
        this.carrera = carrera;
        this.coordenada = coordenada;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Su ubicación es: " + calle + " " + carrera + " con cordenadas: " + coordenada + " : " + descripcion + " " + Municipio;
    }

}
