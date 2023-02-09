package ejercicios_tema_4;

public class Ejercicios_Tema_4 {
    
    public static void main(String[] args) {
        // Creamos un objeto SmartPhone
        SmartPhone iPhone = new SmartPhone("Apple", "iPhone 12", 128, 12);
        
        // Imprimimos los valores de los atributos del objeto SmartPhone
        System.out.println("Marca: " + iPhone.getMarca());
        System.out.println("Modelo: " + iPhone.getModelo());
        System.out.println("Almacenamiento: " + iPhone.getAlmacenamiento());
        System.out.println("Camara: " + iPhone.getCamara());
        
        // Creamos un objeto SmartPhone
        SmartWatch AppleWatch = new SmartWatch("Apple", "AppleWatch SE", 112, true);
        
        // Imprimimos los valores de los atributos del objeto SmartPhone
        System.out.println("Marca: " + AppleWatch.getMarca());
        System.out.println("Modelo: " + AppleWatch.getModelo());
        System.out.println("Almacenamiento: " + AppleWatch.getAlmacenamiento());
        System.out.println("NFC: " + AppleWatch.isNFC());
    }
    
}
