import java.util.Random;
import java.util.Scanner;

/**
 * Implementaremos un juego de adivinanzas donde
 * el jugador estara enfrentando al CPU. Si el jugador
 * da con el numero aleatorio entonces ganas. De lo contrario,
 * sigue jugando hasta que no tengas mas vidas.
 *
 * Reglas:
 * - El CPU tomara un numero aleatorio entre 1-10. Tal numero debe de
 * ser adivinado por el usuario.
 *
 * - El jugador tiene tres oportunidades/vidas para dar con el numero
 * aleatorio. De no dar con el numero correcto, el juego termina.
 *
 */

public class Adivinanza {
    public static void main(String[] args) {
        Random aleatorio = new Random(); // Generando un numero aleatorio
        Scanner input = new Scanner(System.in);
        int vidas = 3, respuesta, target = aleatorio.nextInt(10);
        String mensaje = "Felicidades, lo has conseguido. Eres un mago!";


        System.out.println(target);

        System.out.print("Implementaremos un juego de adivinanzas donde\n" +
                "el jugador estara enfrentando al CPU. Si el jugador\n" +
                "da con el numero aleatorio entonces ganas. De lo contrario,\n" +
                "sigue jugando hasta que no tengas mas vidas. \nSabiendo esto, adivina el numero: ");
        respuesta = input.nextInt();

        if (respuesta == target) {
            System.out.println(mensaje);
        }

        else if (respuesta != target) {
            vidas -= 1; // vida = vida - 1

            System.out.println("Lo siento, no es el numero correcto. " + "Te quedan " + vidas + " vidas. Intenta de nuevo: ");
            respuesta = input.nextInt();

            if (respuesta == target) {
                System.out.println(mensaje);
            }

            else {
                vidas -= 1; // vida = vida - 1

                System.out.println("Lo siento, no es el numero correcto. " + "Te quedan " + vidas + " vidas. Intenta de nuevo: ");
                respuesta = input.nextInt();

                if (respuesta == target) {
                    System.out.println(mensaje);
                }

                else {
                    System.out.println("No has podido dar con el numero indicado. Gracias por intentarlo. El numero era " + target + ".");
                }

            }
        }

        else {
            System.out.println("ERROR! Recuerda que espero un numero entero no una palabra.");
        }

        // Cerrando la clase Scanner
        input.close();
    }

}
