package ejercicios_temas_7_8_y_9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio9 {
    public static void copyFile(String fileIn, String fileOut) throws IOException {
    InputStream in = new FileInputStream(fileIn);
    OutputStream out = new FileOutputStream(fileOut);
    byte[] buffer = new byte[1024];
    int length;
    while ((length = in.read(buffer)) > 0) {
      out.write(buffer, 0, length);
    }
    in.close();
    out.close();
  }
    
    public static void main(String[] args) {
    try {
      copyFile("fileIn.txt", "fileOut.txt");
      System.out.println("Archivo copiado con éxito");
    } catch (IOException e) {
      System.out.println("Error al copiar el archivo");
    }
  }
}
