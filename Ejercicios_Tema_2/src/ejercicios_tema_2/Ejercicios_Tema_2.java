package ejercicios_tema_2;

public class Ejercicios_Tema_2 {

    //funcion que recibe el precio y da como resultado el precio con iva
    public static double precioConIva(double precio) {
        final double tasaIva = 0.21;
        return precio * (1 + tasaIva);
    }

    public static void main(String[] args) {
        //probamos la funcion
        double precioSinIva = 100.0;
        double precioConIva = precioConIva(precioSinIva);
        System.out.println("Precio con IVA incluido: " + precioConIva);
    }

}
