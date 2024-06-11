import java.util.Scanner;
public class conversorT {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        
        int opc = 0, celcius = 0, fahrenheit = 0 ;

        System.out.println(" Elige 1. convertir grados Celcius °C a Fahrenheit °F\n 2. Fahrenheit °F a Celcius °C");
        opc = intro.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Ingresa el dato en Celcius");
                celcius = intro.nextInt();
                fahrenheit = ((celcius * 9/5) + 32);
                System.out.println("El resultado en fahrenheit es: " + fahrenheit);
                break;
            case 2:
                System.out.println("Ingresa el dato en Fahrenheit");
                fahrenheit = intro.nextInt();
                celcius = ((fahrenheit - 32) * 5/9);
                System.out.println("El resultado en Celcius es: " + celcius);
                break;
            default:
                break;
        }

    }
}
