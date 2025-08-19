/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import application.CatalogoService;
import application.ClienteService;
import application.OrdenService;
import application.DashboardService;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Catálogo", "Clientes", "Órdenes", "Dashboard", "Salir"};
        boolean activo = true;

        while (activo) {
            String seleccion = (String) JOptionPane.showInputDialog(null,
                "Seleccione módulo:",
                "PuraVida MiPyME Suite",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

            if (seleccion == null || seleccion.equals("Salir")) {
                activo = false;
            } else {
                switch (seleccion) {
                    case "Catálogo":
                        CatalogoService.mostrarMenu();
                        break;
                    case "Clientes":
                        ClienteService.mostrarMenu();
                        break;
                    case "Órdenes":
                        OrdenService.mostrarMenu();
                        break;
                    case "Dashboard":
                        DashboardService.mostrarResumen();
                        break;
                }
            }
        }
    }
}