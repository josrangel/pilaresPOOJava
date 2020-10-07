package Capa3;

import Capa1.Persona;

public class Alumno extends Persona{
    private String numeroCuenta;
    private String grupo;
    private String grado;
    private String promedio;

    public Alumno(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroCuenta, String grupo, String grado, String promedio) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre);
        this.numeroCuenta = numeroCuenta;
        this.grupo = grupo;
        this.grado = grado;
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
}
