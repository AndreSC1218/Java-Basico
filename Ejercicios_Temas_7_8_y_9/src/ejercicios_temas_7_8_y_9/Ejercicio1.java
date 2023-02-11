package ejercicios_temas_7_8_y_9;

public class Ejercicio1 {

    //Codigo que devuelve una cadena al revés
    public static String reverse(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    //Probamos la funcion
    public static void main(String[] args) {
        String texto = "hola mundo";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto al revés: " + reverse(texto));
    }

}
