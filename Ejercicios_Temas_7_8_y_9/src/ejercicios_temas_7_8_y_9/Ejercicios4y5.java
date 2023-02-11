package ejercicios_temas_7_8_y_9;

import java.util.Vector;

public class Ejercicios4y5 {

    public static void main(String[] args) {
        //Vector de Strings
        Vector<String> vector = new Vector<>();
        //añadimos 5 elementos
        vector.add("elemento1");
        vector.add("elemento2");
        vector.add("elemento3");
        vector.add("elemento4");
        vector.add("elemento5");
        System.out.println("Vector original: " + vector);
        //quitamos 2
        vector.remove(1);
        vector.remove(1);
        System.out.println("Vector final: " + vector);
    }

}
