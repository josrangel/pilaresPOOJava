package Capa2;

import Capa1.Persona;

public class Adulto extends Persona {
    private String numeroINE;
    private String numeroCadena;

    public Adulto(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre);
        this.numeroINE = numeroINE;
        this.numeroCadena = numeroCadena;
    }

    public String getNumeroINE() {
        return numeroINE;
    }

    public void setNumeroINE(String numeroINE) {
        this.numeroINE = numeroINE;
    }

    public String getNumeroCadena() {
        return numeroCadena;
    }

    public void setNumeroCadena(String numeroCadena) {
        this.numeroCadena = numeroCadena;
    }
}
