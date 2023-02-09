package ejercicios_tema_3;

public class Ejercicios_Tema_3 {

    public static void main(String[] args) {
        // Array de nombres
        String[] nombres = {"Juan", "Pedro", "Maria", "Ana"};
        // Cadena donde se almacenará el resultado de la concatenación
        String resultado = "";

        // Recorremos el array de nombres
        for (int i = 0; i < nombres.length; i++) {
            // Concatenamos cada nombre al resultado
            resultado = resultado + nombres[i] + " ";
        }

        // Imprimimos el resultado por consola
        System.out.println(resultado);
    }

}
