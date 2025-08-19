/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Cliente {
    public String idInterno;
    public String nombre;
    public String correo;
    public String telefono;
    public String cedulaCifrada;

    public Cliente(String idInterno, String nombre, String correo, String telefono, String cedulaCifrada) {
        this.idInterno = idInterno;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.cedulaCifrada = cedulaCifrada;
    }
}