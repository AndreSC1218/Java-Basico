package ejercicios_temas_7_8_y_9;

public class Ejercicio8 {

    public static void DividePorCero() throws ArithmeticException {
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    public static void main(String[] args) {
        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
}
