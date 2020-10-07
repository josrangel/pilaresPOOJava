package Capa3;

import Capa2.Trabajador;

public class Director extends Trabajador {
    private String cedula;
    private String identificadorZonaEscolar;

    public Director(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String identificadorUnico, String numeroOficina, String cedula, String identificadorZonaEscolar) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena, identificadorUnico, numeroOficina);
        this.cedula = cedula;
        this.identificadorZonaEscolar = identificadorZonaEscolar;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getIdentificadorZonaEscolar() {
        return identificadorZonaEscolar;
    }

    public void setIdentificadorZonaEscolar(String identificadorZonaEscolar) {
        this.identificadorZonaEscolar = identificadorZonaEscolar;
    }
}
