package ejercicios_temas_7_8_y_9;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicios7 {
     public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();

    // Rellenar el ArrayList con números del 1 al 10
    for (int i = 1; i <= 10; i++) {
      numeros.add(i);
    }

    // Eliminar números pares
    Iterator<Integer> it = numeros.iterator();
    while (it.hasNext()) {
      int num = it.next();
      if (num % 2 == 0) {
        it.remove();
      }
    }

    // Mostrar el ArrayList final
    System.out.println("ArrayList final: " + numeros);
  }
}
