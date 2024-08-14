/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Estudiante_MCA
 */
public class Empleado {
    private Cargo Cargo;
    private double salario;

    public Empleado(Cargo Cargo, double salario) {
        this.Cargo = Cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Su cargo es: "+Cargo+" con un salario de: "+salario;
    }
    
    
}
