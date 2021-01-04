import java.util.Scanner;

/**
 * Escribir un programa que le <br /> pregunte al usuario por un <br />
 * por un numero flotante (float) y luego <br /> imprima todos los
 * numeros del 0 hasta el numero <br /> dado por el usuario. <br />
 * Ojo: cuidado con un bucle infinito.
 */

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float usuario, contador = 0;

        System.out.println("Enter un numero: ");
        usuario = input.nextInt();

        System.out.println("COMIENZO");

        while (contador <= usuario) {
            System.out.println(contador);
            contador = contador + 1; // contador = contador + 1
        }

        System.out.println("FIN");

        input.close();
    }
}
