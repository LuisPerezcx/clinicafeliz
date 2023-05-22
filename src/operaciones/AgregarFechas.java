package operaciones;

import pojo.CitaMedica;
import pojo.Paciente;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarFechas {
    public void agregar(ArrayList<CitaMedica> citaMedicaArrayList, Validar validar, Scanner scanner){
        System.out.println("- Ingresar fechas disponibles-");
        System.out.println("ingresa fecha:");
        String fecha = scanner.nextLine();
        int hora=-1;
        while (hora==-1){
            System.out.println("Ingresa hora de la cita");
            hora=validar.validarnum(scanner);
            scanner.nextLine();
        }
        citaMedicaArrayList.add(new CitaMedica(fecha,hora,null));
    }
}
