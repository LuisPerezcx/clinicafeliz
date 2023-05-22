package operaciones;

import pojo.CitaMedica;

import java.util.ArrayList;

public class MostrarFechas {
    public void mostrar(ArrayList<CitaMedica> citaMedicaArrayList){
        if (citaMedicaArrayList.isEmpty()){
            System.out.println("No hay fechas registradas");
        }else{
            int i=1;
            for(CitaMedica citaMedica: citaMedicaArrayList){
                System.out.println(i + ".-" + citaMedica);
            }
        }
    }
}
