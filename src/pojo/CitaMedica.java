package pojo;

public class CitaMedica {
    private String fecha;
    private int hora;
    private Paciente paciente;
    private Doctor doctor;

    public CitaMedica(String fecha, int hora, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + "\nHora: " + hora + "\nPaciente: " + paciente;
    }
}
