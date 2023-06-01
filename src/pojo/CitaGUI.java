package pojo;

public class CitaGUI {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String edad;
    private String sexo;
    private String motivo;
    private String diabetes;
    private String medico;
    private String hora;
    private String fecha;
    private String telefono;
    private String correo;

    public CitaGUI(String nombre, String aPaterno, String aMaterno, String edad,String sexo, String motivo, String diabetes, String medico,
                   String hora, String fecha, String telefono, String correo) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.edad = edad;
        this.sexo = sexo;
        this.motivo = motivo;
        this.diabetes = diabetes;
        this.medico = medico;
        this.hora = hora;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public String getEdad() {
        return edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getMedico() {
        return medico;
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDiabetes() {
        return diabetes;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", aPaterno='" + aPaterno + '\'' +
                ", aMaterno='" + aMaterno + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", motivo='" + motivo + '\'' +
                ", diabetes='" + diabetes + '\'' +
                ", medico='" + medico + '\'' +
                ", hora='" + hora + '\'' +
                ", fecha='" + fecha + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo;
    }
}
