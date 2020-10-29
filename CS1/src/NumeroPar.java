import java.util.Scanner;

/*
 * Escribe un programa que lee un entero desde el usuario
 * y determina si el entero es par o impar.
 */
public class NumeroPar {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        // Adquiriendo el valor desde el usuario
        System.out.printf("Introduzca el numero: ");
        n = input.nextInt();

        // Chequeando si el numero es par o no
        if ( (n % 2) == 0) {
            System.out.format ("El numero %d es par", n);
        }

        else {
            System.out.print("El numero " + n + " es impar");
        }

        // cerrando la clase Scanner
        input.close();
    }
}
