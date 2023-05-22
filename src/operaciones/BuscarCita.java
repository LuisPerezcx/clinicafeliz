package operaciones;

import pojo.CitaMedica;
import pojo.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarCita {
    public int buscar(ArrayList<CitaMedica> citaMedicaArrayList, Scanner scanner){
        if (citaMedicaArrayList.isEmpty()){
            System.out.println("No hay fechas registradas");
        }else{
            System.out.println("Ingresa el nombre del paciente:");
            String nombre = scanner.nextLine();
            int cont=0;
            for(CitaMedica citaMedica: citaMedicaArrayList){
                Paciente paciente = citaMedica.getPaciente();
                if(paciente!=null){
                    if(paciente.getNombre().equals(nombre)){
                        return cont;
                    }
                }
                cont++;
            }
        }
        System.out.println("Cita no encontrada");
        return -1;
    }
}
