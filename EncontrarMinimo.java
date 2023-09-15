public class EncontrarMinimo {
    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 56;
        int numero3 = 22;

        int minimo = numero1; // Supone que el primer número es el mínimo

        // Compara el primer numero con el segundo
        if (numero2 < minimo) {
            minimo = numero2;
        }

        // Compara el mínimo del numero con el tercer número
        if (numero3 < minimo) {
            minimo = numero3;
        }

        // El valor de 'minimo' ahora es el numero más pequeño
        System.out.println("El número mínimo es: " + minimo);
    }
}

