package Capa3;

import Capa2.Adulto;

public class Aguador extends Adulto {
    private String especialidad;
    private String aniosExperiencia;

    public Aguador(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String especialidad, String aniosExperiencia) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
