package pojo;

public class Doctor {
    private String nombre;
    private int telefono;
    private String especialidad;

    public Doctor(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nTelefono: " + telefono + "\nEspecialidad: " + especialidad;
    }
}
