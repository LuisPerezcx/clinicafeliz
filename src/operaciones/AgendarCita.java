package operaciones;

import pojo.CitaMedica;
import pojo.Doctor;
import pojo.Paciente;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendarCita {
    public void agendar(ArrayList<CitaMedica> citaMedicaArrayList,
                        MostrarFechas mostrarFechas, Validar validar,
                        Scanner scanner, Doctores doctores, ArrayList<Doctor> doctorArrayList){
        mostrarFechas.mostrar(citaMedicaArrayList);
        if(!citaMedicaArrayList.isEmpty()){
            System.out.println("ingresa el indice de la cita que desea agendar: ");
            int indice = validar.validarnum(scanner);
            scanner.nextLine();
            indice=indice-1;
            if(citaMedicaArrayList.get(indice).getPaciente()==null){
                doctorArrayList.add(new Doctor("Doctor de turno",9352625,"general"));
                System.out.println("Ingresa el nombre del paciente:");
                String nombre = scanner.nextLine();
                int edad = -1;
                while (edad==-1){
                    System.out.println("Ingresa edad del paciente:");
                    edad = validar.validarnum(scanner);
                    scanner.nextLine();
                }
                int telefono = -1;
                while (telefono==-1){
                    System.out.println("Ingresa telefono del paciente:");
                    telefono = validar.validarnum(scanner);
                    scanner.nextLine();
                }
                System.out.println("Ingresa el motivo de la visita:");
                String motivo = scanner.nextLine();
                citaMedicaArrayList.get(indice).setPaciente(new Paciente(nombre,edad,telefono,motivo));
                doctores.mostrar(doctorArrayList);
                System.out.println("Selecciona el indice del doctor que deseas");
                int indice1=validar.validarnum(scanner);
                scanner.nextLine();
                indice1=indice1-1;
                citaMedicaArrayList.get(indice).setDoctor(doctorArrayList.get(indice1));
                System.out.println("Cita agendada");
            }else System.out.println("Cita ocupada");
        }
    }
}
