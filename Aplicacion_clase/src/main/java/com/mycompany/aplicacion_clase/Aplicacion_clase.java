/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aplicacion_clase;

import Clases.Pais;
import Clases.Departamento;
import Clases.Municipio;
import Clases.Direccion;
import Clases.Persona;
import Clases.Estudiante;
import Clases.Cargo;
import Clases.Empleado;

public class Aplicacion_clase {

    public static void datos() {

        Pais colombia = new Pais(1, "Colombia");
        Departamento meta = new Departamento(1, "Meta", colombia);
        Municipio vicio = new Municipio(1, "Villavicencio", meta);
        Direccion lugar = new Direccion(vicio, meta, colombia, "NA", "5", "x.y", "conjunto cerrado");
        Persona yo = new Persona(1, "Michael Andres", "Rodriguez Estrada", lugar);
        Estudiante estu1 = new Estudiante("160004535", "sistemas", 3.3, 1, "Andres", "Rodriguez", lugar);
        Estudiante estu2 = new Estudiante("160004540", "sistemas", 3.6, yo);
        Cargo cargo = new Cargo(1,"ingeniero");
        Empleado empleado1 = new Empleado(cargo,1200000);
        
        
        System.out.println("Hello World!");
        System.out.println(colombia.toString());
        System.out.println(meta.toString());
        System.out.println(vicio.toString());
        System.out.println(lugar.toString());
        System.out.println(yo.toString());
        System.out.println(estu1.toString());
        System.out.println(estu2.toString());
        System.out.println(empleado1.toString());
    }

    public static void main(String[] args) {
        datos();
    }
}
