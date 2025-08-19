/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class PagoTarjeta implements Pago {
    public boolean procesar(double monto) { return monto <= 100000; }
    public String tipo() { return "Tarjeta"; }
}
