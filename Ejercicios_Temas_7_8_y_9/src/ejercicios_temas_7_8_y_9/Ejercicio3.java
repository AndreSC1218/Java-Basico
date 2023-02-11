package ejercicios_temas_7_8_y_9;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //creamos una array bidimensional
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Valores del array bidimensional:");
        
        //recorremos para mostrar la posición y el valor de cada elemento en ambas dimensiones
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Posición [" + i + "][" + j + "]: " + array[i][j]);
            }
        }
    }

}
