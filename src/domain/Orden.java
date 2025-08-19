/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.util.List;

public class Orden {
    public String id;
    public Cliente cliente;
    public List<ItemOrden> items;
    public double totalBruto;
    public double impuestos;
    public double descuentos;
    public double totalNeto;
    public String fecha;

    public Orden(String id, Cliente cliente, List<ItemOrden> items, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.items = items;
        this.fecha = fecha;
    }
}