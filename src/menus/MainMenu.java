package menus;

import operaciones.*;
import pojo.CitaMedica;
import pojo.Doctor;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public AgregarFechas agregarFechas;
    public AgendarCita agendarCita;
    Doctores doctores;
    public BuscarCita buscarCita;
    public CancelarCita cancelarCita;
    public MostrarFechas mostrarFechas;
    public ArrayList<CitaMedica> citaMedicaArrayList;
    public ArrayList<Doctor> doctorArrayList;


    public MainMenu(AgregarFechas agregarFechas, AgendarCita agendarCita, Doctores doctores,
                    BuscarCita buscarCita, CancelarCita cancelarCita,
                    MostrarFechas mostrarFechas, ArrayList<CitaMedica> citaMedicaArrayList,
                    ArrayList<Doctor> doctorArrayList) {

        this.agregarFechas = agregarFechas;
        this.agendarCita = agendarCita;
        this.doctores = doctores;
        this.buscarCita = buscarCita;
        this.cancelarCita = cancelarCita;
        this.mostrarFechas = mostrarFechas;
        this.citaMedicaArrayList = citaMedicaArrayList;
        this.doctorArrayList = doctorArrayList;
    }
    Validar validar = new Validar();
    public void menu(Scanner scanner){
        int opc=1;
        while (opc!=6){
            opc = menuSelect(scanner);
            switch (opc){
                case 1 -> agregarFechas.agregar(citaMedicaArrayList,validar,scanner);
                case 2 -> mostrarFechas.mostrar(citaMedicaArrayList);
                case 3 -> agendarCita.agendar(citaMedicaArrayList,mostrarFechas,validar,scanner, doctores, doctorArrayList);
                case 4 -> cancelarCita.cancelar(citaMedicaArrayList,buscarCita,scanner);
                case 5 -> doctores.agregar(doctorArrayList,validar,scanner);
                case 6 -> System.out.println();
                default -> System.out.println("Opcion Invalida, ingresa nuevamente");
            }
        }
    }
    private int menuSelect(Scanner scanner){
        System.out.println("""
                ---------------------------------------------\s
                Seleccione una opcion:\s
                1.- Agregar fechas disponibles \s
                2.- Ver fechas disponibles\s
                3.- Agendar Cita\s
                4.- Cancelar Cita\s
                5.- Agregar Doctores\s
                6.- Salir\s
                pulsa 0 para salir
                """);
        int n=validar.validarnum(scanner);
        scanner.nextLine();
        return n;
    }
}
