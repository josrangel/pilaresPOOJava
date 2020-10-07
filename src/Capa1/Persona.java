package Capa1;

public class Persona {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String tipoSangre;
    private String subtipoSangre;

    public Persona(String nombre, String apPaterno, String apMaterno, String tipoSangre, String subtipoSangre) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.tipoSangre = tipoSangre;
        this.subtipoSangre = subtipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getSubtipoSangre() {
        return subtipoSangre;
    }

    public void setSubtipoSangre(String subtipoSangre) {
        this.subtipoSangre = subtipoSangre;
    }
}
