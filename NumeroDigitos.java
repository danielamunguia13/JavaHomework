public class NumeroDigitos {
    public static void main(String[] args) {
        int numero = 943815;
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número de dígitos en " + numero + " es: " + cantidadDigitos);
    }

    public static int contarDigitos(int numero) {
        // Es el numero en una cadena
        String numeroStr = Integer.toString(numero);

        // Método length() de la cadena para contar los dígitos
        int cantidadDigitos = numeroStr.length();

        return cantidadDigitos;
    }
}
