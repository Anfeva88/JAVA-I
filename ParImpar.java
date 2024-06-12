import java.util.Scanner;
public class ParImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        System.out.println("Digite por favor un numero entero");
        a = scanner.nextInt();

        System.out.println("Los numeros pares son: ");
        for(int i = 1; i <= a; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nLos numeros impares son: ");
        for(int i = 1; i <= a; i++){
            if(i % 2 == 1){
                System.out.print(i + ", ");
            }
        }
    }
}
