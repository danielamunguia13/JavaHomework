import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pide que se ingrese los dos números
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcula el MCD utilizando el algoritmo de Euclides
        int mcd = encontrarMCD(numero1, numero2);

        System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es " + mcd);

        // Cierra el objeto Scanner
        scanner.close();
    }

    // Método para encontrar el MCD utilizando el algoritmo de Euclides
    public static int encontrarMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
