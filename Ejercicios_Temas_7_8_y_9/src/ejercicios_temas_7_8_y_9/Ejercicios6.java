package ejercicios_temas_7_8_y_9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicios6 {
    public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("elemento1");
    arrayList.add("elemento2");
    arrayList.add("elemento3");
    arrayList.add("elemento4");

    LinkedList<String> linkedList = new LinkedList<>(arrayList);

    System.out.println("ArrayList: ");
    for (String element : arrayList) {
      System.out.println(element);
    }

    System.out.println("LinkedList: ");
    for (String element : linkedList) {
      System.out.println(element);
    }
  }
}
