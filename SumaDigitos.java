public class SumaDigitos {
    public static void main(String[] args) {
        int numero = 586347569;
        int suma = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }

    public static int sumaDigitos(int numero) {
        // Convierte el número en una cadena de caracteres
        String numeroStr = Integer.toString(numero);

        // Inicializa la variable para la suma
        int suma = 0;

        // Recorre cada dígito de la cadena y suma los dígitos
        for (int i = 0; i < numeroStr.length(); i++) {
            char digitoChar = numeroStr.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            suma += digito;
        }

        return suma;
    }
}
