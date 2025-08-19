/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class PagoTransferencia implements Pago {
    public boolean procesar(double monto) { return true; }
    public String tipo(){ return"Transferencia";}
}