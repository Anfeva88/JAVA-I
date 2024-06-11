// EJERCICIO 1: Calculadora Simple
import java.util.Scanner;
public class ejercicio1 {

   public static void main(String[] args) {

    Scanner data = new Scanner(System.in);
    int a = 0, b = 0, r = 0;
    String op = "";

    System.out.println("Ingresa el primer numero");
    a = data.nextInt();

    System.out.println("Ingresa el segundo numero");
    b = data.nextInt();

    System.out.println("Elige la operacion que deseas realizar: (+) suma ,(-) resta, (*) multiplicación, (/) división");
    op = data.next();
    switch (op) {
        case "+":
            r = (a + b);
            System.out.println("El resultado de tu suma es: " + r);
            break;
            case "-":
            r = (a - b);
            System.out.println("El resultado de tu resta es: " + r);
            break;
            case "*":
            r = (a * b);
            System.out.println("El resultado de tu multiplicación es: " + r);
            break;
            case "/":
            r = (a / b);
            System.out.println("El resultado de tu división es: " + r);
            break;    
    
        default:
            System.out.println("La opción no es valida");
            break;
    }
    
   }


}
