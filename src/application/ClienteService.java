/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javax.swing.JOptionPane;
import domain.Cliente;
import infrastructure.ClienteRepository;
import utils.CryptoUtils;

public class ClienteService {
    public static void mostrarMenu() {
        String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
        String id = JOptionPane.showInputDialog("ID interno:");
        String correo = JOptionPane.showInputDialog("Correo:");
        String telefono = JOptionPane.showInputDialog("Teléfono:");
        String cedula = JOptionPane.showInputDialog("Cédula:");

        try {
            String cifrada = CryptoUtils.cifrar(cedula);
            Cliente c = new Cliente(id, nombre, correo, telefono, cifrada);
            ClienteRepository.guardar(c);
            JOptionPane.showMessageDialog(null, "Cliente guardado.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cifrar cédula.");
        }
    }
}