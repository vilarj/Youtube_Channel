import java.util.Scanner;

/**
 * Escribe un programa que determine si la persona esta en sobre peso, bajo peso, o peso adecuado.
 * Cabe destacar que todo esto esta determinado por los siguientes parametros:
 *
 * 				|       Altura	     | Peso en Kg   | Estatus      |
 * 				| Mujer 1.50 - 1.60  | 45 - 51      | Peso Normal  |
 * 				| Mujer 1.60 - 1.80  | 52.5 - 54.8  | Peso Normal  |
 * 				| Mujer 1.80 - 1.95  | 64.8 - 75.3  | Peso Normal  |
 * 				----------------------------------------------------
 * 				| Hombre 1.50 - 1.60  | 45 - 57.1    | Peso Normal  |
 * 				| Hombre 1.60 - 1.80  | 57.1 - 69.7  | Peso Normal  |
 * 				| Hombre 1.80 - 1.95  | 69.7 - 80.9  | Peso Normal  |
 * 				----------------------------------------------------
 */

public class Estatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sexo;
        double estatura, peso;

        System.out.println("Introduzca la letra de su sexo:");
        sexo = input.next();
        System.out.println("Introduzca su altura:");
        estatura = input.nextDouble();
        System.out.println("Introduzca su peso actual:");
        peso = input.nextDouble();

        sexo.toUpperCase();

        // Determinando el estatus dependiendo de la estatura y el peso del individuo
        if (sexo.equals("F")) {
            if (estatura >= 1.50 || estatura <= 1.60) {
                if (peso >= 45 || peso <= 51) {
                    System.out.println("Su peso es normal");
                }
            }

            else if (estatura >= 1.60 || estatura <= 1.80) {
                if (peso >= 52.5 || peso <= 54.8) {
                    System.out.println("Su peso es normal");
                }
            }

            else if (estatura >= 1.80 || estatura <= 1.95) {
                if (peso >= 64.8 || peso <= 75.3) {
                    System.out.println("Su peso es normal");
                }
            }
            // Check: Bajo peso
            else if (estatura < 1.50 && peso < 45) {
                System.out.println("Usted es bajo peso");
            }

            // Check: Sobre peso
            else if (estatura < 1.50 && peso < 45) {
                System.out.println("Usted esta sobre peso");
            }
        }

        else if (sexo.equals("M")) {
            if (estatura >= 1.50 || estatura <= 1.60) {
                if (peso >= 45 || peso <= 57.1) {
                    System.out.println("Su peso es normal");
                }
            }

            else if (estatura >= 1.60 || estatura <= 1.80) {
                if (peso >= 57.1 || peso <= 69.7) {
                    System.out.println("Su peso es normal");
                }
            }

            else if (estatura >= 1.80 || estatura <= 1.95) {
                if (peso >= 69.7 || peso <= 80.9) {
                    System.out.println("Su peso es normal");
                }
            }

            // Check: Bajo peso
            else if (estatura < 1.50 && peso < 45) {
                System.out.println("Usted es bajo peso");
            }

            // Check: Sobre peso
            else if (estatura < 1.50 && peso < 45) {
                System.out.println("Usted esta sobre peso");
            }
        }

        else {
            System.out.println("Error, no ha introducido el valor correcto. Nota: Debe de ser F o M");
        }

        // Cerrando el objeto input de la clase Scanner
        input.close();
    }
}
