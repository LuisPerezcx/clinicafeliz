package pojo;

public class Paciente {
    private String nombre;
    private int edad;
    private int telefono;
    private String motivoVisita;

    public Paciente(String nombre, int edad, int telefono, String motivoVisita) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.motivoVisita = motivoVisita;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", motivoVisita='" + motivoVisita + '\'';
    }
}
