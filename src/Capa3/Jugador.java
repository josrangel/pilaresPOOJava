package Capa3;

import Capa2.Adulto;

public class Jugador extends Adulto {
    private String posicion;
    private String numeroUnico;

    public Jugador(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String posicion, String numeroUnico) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena);
        this.posicion = posicion;
        this.numeroUnico = numeroUnico;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }
}
