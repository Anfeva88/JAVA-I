public class palindromo {
    public static void main(String[] args) {
        String texto = "Anita lava la tina";

        boolean esPalindromo = esPalindromo(texto);
        System.out.println("El texto es palindromo? " + esPalindromo);

    }
    public static boolean esPalindromo(String texto){
        String clean = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
