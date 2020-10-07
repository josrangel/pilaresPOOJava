package Capa3;

import Capa2.Trabajador;
import Interfaces.TrabajaEmpleado;

public class Maestro extends Trabajador implements Comparable, TrabajaEmpleado {
    private String cedula;

    public Maestro(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre, String numeroINE, String numeroCadena, String identificadorUnico, String numeroOficina, String cedula) {
        super(nombre, apPaterno, apMaterno, tipoSangre, subtipoSangre, numeroINE, numeroCadena, identificadorUnico, numeroOficina);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public int compareTo(Object o) {
        Float calif = (Float) o;
        if(calif<6){

            return 5;
        }else{
            if (calif >=6 && calif < 6.5){
                return 6;
            }
        }
        return 0;
    }

    @Override
    public void modoDeTrabajo() {

        System.out.println("Golpear alumnos");
    }
}
