package ejercicios_tema_4;

public class SmartDevice {
    private String marca;
    private String modelo;
    private int almacenamiento;

    // Constructor vacío
    public SmartDevice() {
    }

    // Constructor con todos los parámetros
    public SmartDevice(String marca, String modelo, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
    class SmartPhone extends SmartDevice {
    private int camara;

    // Constructor vacío
    public SmartPhone() {
    }

    // Constructor con todos los parámetros
    public SmartPhone(String marca, String modelo, int almacenamiento, int camara) {
        super(marca, modelo, almacenamiento);
        this.camara = camara;
    }

    // Getters y setters
    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }
}
    class SmartWatch extends SmartDevice {
    private boolean NFC;

    // Constructor vacío
    public SmartWatch() {
    }

    // Constructor con todos los parámetros
    public SmartWatch(String marca, String modelo, int almacenamiento, boolean NFC) {
        super(marca, modelo, almacenamiento);
        this.NFC = NFC;
    }

    // Getters y setters
    public boolean isNFC() {
        return NFC;
    }

    public void setNFC(boolean NFC) {
        this.NFC = NFC;
    }
}