/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franco Menichetti
 */
public class Matematica {
    
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    public void calcularDescuento(int porcentaje) {
        double descuento = (porcentaje* getPrecio()) / 100;
        System.out.println("El precio con descuento es de: " + (getPrecio()-descuento));
    }
}
