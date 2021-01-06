import java.util.Random;
import java.util.Scanner;

/**
 * Escribe un programa que ayude a practicar la suma
 * a ninos. El programa debe:
 *
 * I) Generar dos numeros aleatorios, n1 y n2
 *
 * a) Preguntar al usuario: "Cual es el resultado de n1 + n2? "
 * b) Verificar la respuesta del nino y imprimir en consola si la respuesta es
 * correcta o no
 * c) Despues de los procesos anteriores, preguntale
 * al usuario si quiere seguir jugando
 *
 * II) La interfaz grafica (UI) debe de verse asi:
 *
 * a) El usuario responde correctamente:
 *      Respuesta correcta: 1
 *      "Cual es el resultado de 4 + 3? " 1
 *       La respuesta es correcta.
 *       "Quieres jugar de nuevo? (S/N) " S
 * b) El usuario responde correctamente:
 *      Respuesta correcta: 5
 *      "Cual es el resultado de 8 + 3? " 6
 *       La respuesya es incorrecta.
 *       "Quieres jugar de nuevo? (S/N) " N
 */
public class Game {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, suma, respuesta;
        boolean jugar = true;
        char decision;

        // Obteniendo los numeros aleatorios
        n1 = aleatorio.nextInt(10);
        n2 = aleatorio.nextInt(10);
        suma = n1 + n2;

        while (jugar) {
            System.out.println("Cual es el resultado de " + n1 + " + " + n2 + "? ");
            respuesta = entrada.nextInt();

            if (respuesta == suma) {
                System.out.println("La respuesta es correcta. \nQuieres jugar de nuevo? (S/N) ");
                decision = entrada.next().charAt(0);

                if (decision == 's' || decision == 'S') {
                    n1 = aleatorio.nextInt(10);
                    n2 = aleatorio.nextInt(10);
                    suma = n1 + n2;

                    continue;
                }
                else {
                    jugar = false;
                }
            }

            else {
                System.out.println("La respuesta no es correcta. \nQuieres jugar de nuevo? (S/N) ");

                decision = entrada.next().charAt(0);

                if (decision == 's' || decision == 'S') {
                    n1 = aleatorio.nextInt(10);
                    n2 = aleatorio.nextInt(10);
                    suma = n1 + n2;

                    continue;
                }
                else {
                    jugar = false;
                }
            }
        }

        // Cerrando la clase Scanner
        entrada.close();
    }
}
