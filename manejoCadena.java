import java.util.Scanner;
public class manejoCadena {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);

        String cad, palabra = "JAVA";

        System.out.println("Digita la cadena que quieres evaluar");
        cad = cadena.nextLine();

        cad.length();
        cad.toUpperCase();
        cad.toLowerCase();
        cad.contains(palabra);

        System.out.println("La logitud de la cadena " + cad +" ES: " + cad.length());
        System.out.println("En Mayusculas se veria de la siguiente forma: " + cad.toUpperCase());
        System.out.println("En minusculas se veria de la siguiente manera: " + cad.toLowerCase());
        
        if (cad.contains(palabra))
         {
            System.out.println("La palabra " + palabra + " se encuentra en la cadena de texto");    
         }
        
    }
}
