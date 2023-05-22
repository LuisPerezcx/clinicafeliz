package operaciones;

import pojo.Doctor;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctores {
    public void agregar(ArrayList<Doctor> doctorArrayList, Validar validar, Scanner scanner){
        System.out.println("Ingresa el nombre del Doctor:");
        String nombre = scanner.nextLine();
        int telefono = -1;
        while (telefono==-1){
            System.out.println("Ingresa telefono del Doctor:");
            telefono = validar.validarnum(scanner);
            scanner.nextLine();
        }
        System.out.println("Ingresa la especialidad del doctor:");
        String especialidad = scanner.nextLine();
        doctorArrayList.add(new Doctor(nombre,telefono,especialidad));
        System.out.println("Doctor Ingresado");
    }
    public void mostrar(ArrayList<Doctor> doctorArrayList){
        int i=1;
        for(Doctor doctor : doctorArrayList){
            System.out.println(i + ".- " + doctor);
            i++;
        }
    }
}
