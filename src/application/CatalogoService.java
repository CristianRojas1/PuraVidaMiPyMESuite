/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;
import javax.swing.JOptionPane;

public class CatalogoService {
    public static void mostrarMenu() {
        String[] opciones = {"Agregar Producto", "Buscar", "Importar CSV", "Volver"};
        String seleccion = (String) JOptionPane.showInputDialog(null,
            "Catálogo de Productos",
            "Catálogo",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]);

        if ("Agregar Producto".equals(seleccion)) {
            String nombre = JOptionPane.showInputDialog("Nombre del producto:");
            // Validar y guardar...
            JOptionPane.showMessageDialog(null, "Producto agregado: " + nombre);
        }
    }
}