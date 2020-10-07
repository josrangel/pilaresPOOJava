package Capa2;

public class Trabajador extends Adulto{
    private String identificadorUnico;
    private String numeroOficina;

    public Trabajador(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String identificadorUnico, String numeroOficina) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena);
        this.identificadorUnico = identificadorUnico;
        this.numeroOficina = numeroOficina;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(String numeroOficina) {
        this.numeroOficina = numeroOficina;
    }
}
