package ejercicios_temas_7_8_y_9;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio10 {
    public static void main(String[] args) {
    HashMap<String, ArrayList<Double>> expenses = new HashMap<>();
    String fileName = "expenses.txt";

    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split(",");
        String category = parts[0];
        double amount = Double.parseDouble(parts[1]);

        if (!expenses.containsKey(category)) {
          expenses.put(category, new ArrayList<Double>());
        }
        expenses.get(category).add(amount);
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo de gastos");
    }

    try (PrintStream ps = new PrintStream(new FileOutputStream("expense_report.txt"))) {
      for (String category : expenses.keySet()) {
        ArrayList<Double> amounts = expenses.get(category);
        double total = 0;
        for (double amount : amounts) {
          total += amount;
        }
        ps.println(category + "," + total);
      }
    } catch (IOException e) {
      System.out.println("Error al generar el informe de gastos");
    }
  }
}
