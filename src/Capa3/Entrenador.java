package Capa3;

import Capa2.Adulto;

public class Entrenador extends Adulto {

    private String clavefifa;

    public Entrenador(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String clavefifa) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena);
        this.clavefifa = clavefifa;
    }

    public String getClavefifa() {
        return clavefifa;
    }

    public void setClavefifa(String clavefifa) {
        this.clavefifa = clavefifa;
    }
}
