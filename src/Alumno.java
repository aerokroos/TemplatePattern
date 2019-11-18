/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author villalobos28
 */
public class Alumno {

    String Nombre;
    String Apellido1;
    String Apellido2;
    int edad;
    int calificaion;

    public Alumno(String Nombre, String Apellido1, String Apellido2, int edad, int calificaion) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.edad = edad;
        this.calificaion = calificaion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCalificaion() {
        return calificaion;
    }

    public void setCalificaion(int calificaion) {
        this.calificaion = calificaion;
    }

}
