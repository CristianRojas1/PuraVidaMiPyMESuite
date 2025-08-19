/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author User
 */
public class Producto {
    public String codigo;
    public String nombre;
    public String categoria;
    public double precio;
    public int stockMin;
    public int stockActual;

    public Producto(String codigo, String nombre, String categoria, double precio, int stockMin, int stockActual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stockMin = stockMin;
        this.stockActual = stockActual;
    }

    public String toCSV() {
        return "\"" + codigo + "\";\"" + nombre + "\";\"" + categoria + "\";" + precio + ";" + stockMin + ";" + stockActual;
    }
}