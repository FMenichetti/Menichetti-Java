
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franco Menichetti
 */
public class Comparadores {
     public static Comparator<Ejemplo> ordenarPorPrecio = new Comparator<Ejemplo>() {
        @Override
        public int compare(Ejemplo uno, Ejemplo dos) {
            return uno.getEntero1().compareTo(dos.getEntero1());
        }
    };
}
