package main;

import GUI.GuiPrincipal;
import menus.MainMenu;
import operaciones.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(new AgregarFechas(), new AgendarCita(), new Doctores(), new BuscarCita(), new CancelarCita(),
                new MostrarFechas(),new ArrayList<>(),new ArrayList<>());
        //mainMenu.menu(scanner);
        new GuiPrincipal();
    }
}