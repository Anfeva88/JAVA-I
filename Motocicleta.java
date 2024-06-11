public class Motocicleta{
    public static void main(String[] args) {
        
        Moto motoUno = new Moto("FMT74G", "Hero eco100", 2023, 99);
        

        System.out.println("la placa de la moto es: " + motoUno.getPlaca() + " y el cilindraje es: " + motoUno.getCilindraje() + " CC");
        }
    
}
