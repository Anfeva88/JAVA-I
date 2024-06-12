import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CalcularEdad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa fecha de nacimiento: dd/MM/yyyy");
        String data = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaNacimiento = LocalDate.parse(data, formatter);

        LocalDate fechaActual = LocalDate.now();

        Period period = Period.between(fechaNacimiento, fechaActual);

        System.out.println("Tu tiempo es de: " + period.getDays() + " dias " + period.getMonths() + " meses " + period.getYears() + " años");
    }
}
