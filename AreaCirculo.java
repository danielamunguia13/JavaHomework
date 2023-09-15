import java.util.Scanner;

    public class AreaCirculo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el valor del radio del círculo: ");

            // Lee el valor del radio
            double radio = scanner.nextDouble();

            // Calcula el área del círculo usando la fórmula A = π * r^2
            double area = Math.PI * Math.pow(radio, 2);

            System.out.println("El área del círculo es: " + area);

            scanner.close();
        }
    }


