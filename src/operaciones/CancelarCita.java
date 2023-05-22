package operaciones;

import pojo.CitaMedica;

import java.util.ArrayList;
import java.util.Scanner;

public class CancelarCita {
    public void cancelar(ArrayList<CitaMedica> citaMedicaArrayList, BuscarCita buscarCita, Scanner scanner){
        System.out.println("-Cancelar Cita-");
        if(citaMedicaArrayList.isEmpty()){
            System.out.println("no hay citas registradas");
        }else{
            int indice = buscarCita.buscar(citaMedicaArrayList,scanner);
            citaMedicaArrayList.get(indice).setPaciente(null);
            System.out.println("CIta cancelada");
        }
    }
}
