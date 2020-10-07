package Capa3;

import Capa2.TrabajadorBanco;

public class Cajero extends TrabajadorBanco {
    public Cajero(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String identificadorUnico, String numeroOficina, String claveAcceso, String firmaElectronica) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena, identificadorUnico, numeroOficina, claveAcceso, firmaElectronica);
    }
}
