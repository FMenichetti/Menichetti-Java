
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franco Menichetti
 */
public class Iterador_ArrayList {
    public static void main(String[] args) {
        // Creamos una lista de números enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Creamos un Iterator para la lista de números
        Iterator<Integer> iterador = numeros.iterator();

        // Iteramos sobre la lista utilizando el Iterator
        while (iterador.hasNext()) {
            int numero = iterador.next(); // Obtenemos el próximo elemento
            System.out.println(numero); // Hacemos algo con el elemento, por ejemplo, imprimirlo
            if ( numero == 1){
                iterador.remove();
            }
            
        }
        System.out.println("vamos");
        
        for (Integer numero : numeros) {
            System.out.println( numero);
        }
    }

}

