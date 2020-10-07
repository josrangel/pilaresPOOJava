package Capa2;

public class TrabajadorBanco extends Trabajador{
    private String claveAcceso;
    private String firmaElectronica;

    public TrabajadorBanco(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String identificadorUnico, String numeroOficina, String claveAcceso, String firmaElectronica) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena, identificadorUnico, numeroOficina);
        this.claveAcceso = claveAcceso;
        this.firmaElectronica = firmaElectronica;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getFirmaElectronica() {
        return firmaElectronica;
    }

    public void setFirmaElectronica(String firmaElectronica) {
        this.firmaElectronica = firmaElectronica;
    }
}
