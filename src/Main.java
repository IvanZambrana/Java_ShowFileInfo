
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *
 * @author Iván Zambrana Naranjo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Pedimos nombre de fichero por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte ruta del fichero(existente): ");
        String ruta = sc.nextLine();
        //Objeto tipo File
        File archivo = new File(ruta);
        
        //Comprobamos que exista
            if (archivo.exists()) {
                //Comprobamos que sea un fichero
                if (archivo.isFile())
                {
                    System.out.println("INFORMACION SOBRE EL FICHERO:");
                    System.out.println("=============================");
                    System.out.println("Nombre del fichero: " + archivo.getName());
                    System.out.println("Ruta: " + archivo.getPath());
                    System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
                    System.out.println("Se puede escribir: " + archivo.canWrite());
                    System.out.println("Se puede leer: " + archivo.canRead());
                    System.out.println("Tamaño: " + archivo.length());
                    System.out.println("Es un directorio: " + archivo.isDirectory());
                    System.out.println("Es un fichero: " + archivo.isFile());
                }
                else
                {
                    System.out.println("-ERROR- Has introducido la ruta de una carpeta, no de un fichero.");
                    System.out.println("Sugerencia: Si estas en Windows, un ejemplo de ruta puede ser: 'C:\\\\Program Files\\\\WinRAR\\\\License.txt'");
                }
        } else
        {
            System.out.println("-ERROR- La ruta introducida no existe.");
            System.out.println("Sugerencia: Si estas en Windows, un ejemplo de ruta puede ser: 'C:\\\\Program Files\\\\WinRAR\\\\License.txt'");
        }
     
        
    }
    
}
